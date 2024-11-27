class LambdaTester1
{
  final static String s="Hello";
  
  public static void main(String args[])
  {
	  GreetingService g=message ->
	  System.out.println(s+message);
	  g.sayMessage("Ram");
  }
  @FunctionalInterface
  interface GreetingService{
	  void sayMessage(String message);
  }
}


/*

E:\Advance_java\LambdaExpression>java  LambdaTester1
HelloRam
*/