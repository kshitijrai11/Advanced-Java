import java.util.stream.*;
import java.util.*;

public class StreamMatchMethod
{
	public static void main(String sarg[])
	{
      List<String> names=new ArrayList<>();
		 names.add("Amitabh");
		 names.add("Sekhar");
		 names.add("Aman");
		 names.add("Rahul");
		 names.add("Salman");
		 names.add("Yana");
		 names.add("Lokesh");
		 boolean matchedResult=names.stream()
		 .anyMatch((s)->s.startsWith("A"));
		 
		 System.out.println(matchedResult);
		 
		 matchedResult=names.stream()
		 .allMatch((s)->s.startsWith("A"));
		 
		 matchedResult=names.stream()
		 .noneMatch((s)->s.startsWith("A"));
		 
		 System.out.println(matchedResult);
		 
  }
}