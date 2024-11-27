import java.util.*;

class LambdaWithCollection
{
  public static void main(String a[])
  {
	  String[] str={"ram","krishna","anil","pavan"};
	  
	  List<String> family=Arrays.asList(str);
	  
	  //old looping 
	  for(String s:family)
	  {
		  System.out.print(s+";");
	  }
	  
	  System.out.println(" ");
	  //using lambda expression and functional operations
	  family.forEach((s)-> System.out.print(s+";"));
	  System.out.println(" ");
	  //using double colon operator in java 8
	  family.forEach(System.out::println);
  } 
}

/*
E:\Advance_java\LambdaExpression>java  LambdaWithCollection
ram;krishna;anil;pavan;
ram;krishna;anil;pavan;
ram
krishna
anil
pavan

*/
