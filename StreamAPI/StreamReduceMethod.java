import java.util.stream.*;
import java.util.*;

public class StreamReduceMethod
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
		 Optional<String> reduce=names.stream()
		 .reduce((s1,s2)->s1+"#"+s2);
		 
		 reduce.ifPresent(System.out::println);
	 }
}
/*

E:\Advance_java\StreamAPI>java  StreamReduceMethod
Amitabh#Sekhar#Aman#Rahul#Salman#Yana#Lokesh
*/