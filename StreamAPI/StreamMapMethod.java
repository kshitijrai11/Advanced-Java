import java.util.stream.*;
import java.util.*;

public class StreamMapMethod
{
     public static void main(String aer[])
	 {
		 List<String> names=new ArrayList<>();
		 names.add("Amitabh");
		 names.add("Sekhar");
		 names.add("Aman");
		 names.add("Rahul");
		 names.add("Salman");
		 names.add("Yana");
		 names.add("Lokesh");
		 names.stream().filter((s)->s.startsWith("A"))
		 .map(String::toUpperCase)
		 .forEach(System.out::println);
	 }
}