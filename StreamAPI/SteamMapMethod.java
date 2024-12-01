import java.util.stream.*;
import java.util.*;

public class SteamMapMethod
{
   public static void main(String[] dga)
   {
     List<String> names=new ArrayList<>();
	 names.add("Amit");
		names.add("Shekhar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sahul");
		names.add("Yaman");
		names.add("himanshi");
		names.stream().filter((s) ->s.startsWith("A"))
		     .map(String::toUpperCase)
		     .forEach(System.out::println);
   }
   
}

/*

E:\Advance_java\StreamAPI>java  SteamMapMethod
AMIT
AMAN
*/