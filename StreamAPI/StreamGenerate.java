import java.util.stream.*;
import java.util.*;

public class StreamGenerate
{
   public static void main(String ram[])
   {
     Stream<Integer> randomNumber=Stream
	      .generate(()->(new Random()).nextInt(100));  //ye 100 random no generate karega 
		  
		  randomNumber.limit(20)   //yaha par hamne limit laga di hai ki vo random 20 no print karega
		  .forEach(System.out::println);
   
   }
}