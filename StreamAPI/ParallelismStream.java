import java.util.stream.*;
import java.util.*;

public class ParallelismStream
{
  public static void main(String args[])
   {
     List<Integer> list=new ArrayList<>();
	 for(int i=1;i<10;i++)
	 {
	   list.add(i);
	 }
	 
	 //here createing a parallel stream
	  Stream<Integer> stream=list.parallelStream();
	  
	  Integer[] evenNumberArr=stream.filter(i->i%2==0).toArray(Integer[]::new);
	  for(int z:evenNumberArr)
	  System.out.println(z);
   }  
}