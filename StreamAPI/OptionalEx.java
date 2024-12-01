import java.util.stream.*;
import java.util.*;

class OptionalEx
{
  public static void main(String a[])
  {
    Optional<Integer> canBEeEmpty1=Optional.of(5);
	   System.out.println(canBEeEmpty1.isPresent());
       System.out.println(canBEeEmpty1.get());
	Optional<Integer> canBEeEmpty2=Optional.empty();
		System.out.println(canBEeEmpty2.isPresent());
	}
}
/*
E:\Advance_java\StreamAPI>java  OptionalEx
true
5
false
*/