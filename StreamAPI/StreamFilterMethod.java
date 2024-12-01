import java.util.stream.*;
import java.util.*;

public class StreamFilterMethod
{
     public static void main(String aer[])
	 {
		 List<String> names=new ArrayList<>();
		 names.add("Amitabh");
		 names.add("Sekhar");
		 names.add("Laluuu");
		 names.add("Rahul");
		 names.add("Salman");
		 names.add("Yana");
		 names.add("Lokesh");
		 names.stream().filter((s)->s.startsWith("A"))
		 .forEach(System.out::println);
	 }
}