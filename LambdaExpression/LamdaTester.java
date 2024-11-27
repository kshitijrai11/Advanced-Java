import java.util.function.*;

public class LamdaTester
{
  public static void main(String arg[])
  {
   LamdaTester t=new LamdaTester();
   
   //with type delaration
   MathOperation add=(int a, int b)-> a+b;
   
   //with out type delaration
   MathOperation sub=(a,b)-> a-b;
   
  //with return statemnt along with curly braes
   MathOperation multi=(int a, int b)->{return a*b;};
   //witout return statemnt and without curly braces
   MathOperation div=(int a, int b)-> a/b;
   
   System.out.println("10+5="+t.operate(10,5,add));
   System.out.println("10-5="+t.operate(10,5,sub));
   System.out.println("10*5="+t.operate(10,5,multi));
   System.out.println("10/5="+t.operate(10,5,div));
   
     GreetingService g1=(message) ->{
	   System.out.println("hello"+message);
	 GreetingService g2=(message) ->{
	   System.out.println("hello"+message);   
	 System.out.println("hay"+message);}; 

g1.sayMessage("Ram");	 
g2.sayMessage("Ram");	 
   
  }
  @FunctionalInterface
  interface MathOperation{
	  int operation(int a,int b);
  }
   @FunctionalInterface
  interface GreetingService{
	  void sayMessage(String message);
	  static void show(){}
  }
  
  private int operate(int a,int b,MathOperation mathOperation)
  {
	  return mathOperation.operation(a,b);
  }
}