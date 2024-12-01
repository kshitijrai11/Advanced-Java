import java.util.stream.*;
import java.util.*;

public class StreamToList
{
    public static void main(String[] args)
	{
		List<String> names=new ArrayList<>();
		names.add("Amit");
		names.add("Shekhar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sahul");
		names.add("Yaman");
		names.add("himanshi");
		List<String> memNameInUppercase=names.stream().sorted()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		
	System.out.print(memNameInUppercase);	
	}
}

/*

E:\Advance_java\StreamAPI>java StreamToList
[AMAN, AMIT, RAHUL, SAHUL, SHEKHAR, YAMAN, HIMANSHI]
*/