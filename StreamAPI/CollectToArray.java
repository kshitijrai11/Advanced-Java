import java.util.stream.*;
import java.util.*;

public class CollectToArray
{
  public static void main(String[] arh)
  {
     List<Integer> l=new ArrayList<Integer>();
	 
	 for(int i=1;i<10;i++)
	 {
	   l.add(i);
	 }
	 Stream<Integer> stream=l.stream();
	 System.out.println(stream.getClass().getName());
	 Integer[] evenNumbersArr=stream.filter(i -> i%2==0).toArray(Integer[]::new);
	 for(int z:evenNumbersArr)
		 System.out.println(z);
  }

}

/*

E:\Advance_java\StreamAPI>java  CollectToArray
java.util.stream.ReferencePipeline$Head
2
4
6
8
*/