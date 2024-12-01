import java.util.stream.*;
import java.util.*;

public class ListStream
{
  public static void main(String s[])
  {
    List<Integer> list=new ArrayList<>();
	for(int i=1;i<10;i++)
	{
	  list.add(i);
	}
	Stream<Integer> stream=list.stream();
	stream.forEach(p->System.out.println(p));
  }
}