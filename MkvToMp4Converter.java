package com.springboot.prod_ready_features.prod_ready_features.advice;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class MkvToMp4Converter {

    public static void main(String[] args) {
        String inputDirectory = "/Users/rinx/Downloads/Secret_Level_s1";
        String outputDirectory = "/Users/rinx/Downloads/Secret_Level_s1_convert";

        try {
            Files.createDirectories(Paths.get(outputDirectory));

            File dir = new File(inputDirectory);
            File[] files = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".mkv"));

            if (files == null || files.length == 0) {
                System.out.println("No MKV files found in the directory.");
                return;
            }

            for (File file : files) {
                String inputFilePath = file.getAbsolutePath();
                String outputFileName = file.getName().replaceFirst("\\.mkv$", ".mp4");
                String outputFilePath = Paths.get(outputDirectory, outputFileName).toString();

                List<String> command = Arrays.asList(
                        "ffmpeg", "-i", inputFilePath, "-c:v", "libx264", "-c:a", "aac", "-strict", "experimental", outputFilePath
                );

                ProcessBuilder processBuilder = new ProcessBuilder(command);
                processBuilder.redirectErrorStream(true);
                Process process = processBuilder.start();

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                }

                int exitCode = process.waitFor();
                if (exitCode == 0) {
                    System.out.println("Successfully converted: " + file.getName());
                } else {
                    System.out.println("Failed to convert: " + file.getName());
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
