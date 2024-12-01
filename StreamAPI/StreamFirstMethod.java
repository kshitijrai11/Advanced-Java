import java.util.stream.*;
import java.util.*;

public class StreamFirstMethod
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
		 
	String firstMatchName=names.stream()
		.filter((s)->s.startsWith("L"))
		   .findFirst()
		    .get();
		 System.out.println(firstMatchName);
	 }
}