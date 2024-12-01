import java.util.stream.*;
import java.util.*;

public class StreamCountMethod
{
     public static void main(String aer[])
	 {
		 List<String> names=new ArrayList<>();
		 names.add("Amitabh");
		 names.add("Sekhar");
		 names.add("Ankit");
		 names.add("Rahul");
		 names.add("Salman");
		 names.add("Yana");
		 names.add("Lokesh");
		long totalMached=names.stream()		
		 .filter((s)->s.startsWith("A"))
		 .count();
		System.out.println(totalMached);
	 }
}