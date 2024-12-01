import java.util.stream.*;
import java.util.*;

public class SkipMethod
{
  public static void main(String s[])
  {
    Stream<Integer> evenNumberInfiniteStream=Stream.iterate(0,n->n+2);
	
	List<Integer> newList=evenNumberInfiniteStream
	.skip(5)
	.limit(10)
	.collect(Collectors.toList());
	System.out.println(newList);
  }
}

/*
E:\Advance_java\StreamAPI>java  SkipMethod
[10, 12, 14, 16, 18, 20, 22, 24, 26, 28]
*/