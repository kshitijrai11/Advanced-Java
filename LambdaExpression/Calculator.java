import java.lang.reflect.*;
import java.util.function.*;

public class Calculator
{
 
 public int operateBinary(int a,int b,IntegerMath op)
 {
    return op.operation(a,b);
 }
 public static void main(String...afaf)throws Exception
 {
	Calculator myApp=new Calculator();
    myApp.show((int a,int b) -> a+b);
    IntegerMath addition=(int a,int b) ->a+b;
	myApp.show(addition);
	IntegerMath subtraction=(a,b) ->a-b;
	Class c=subtraction.getClass();
	if(c.isInterface())
		System.out.println("It is a Interface");
	else if(c.isPrimitive())
     System.out.println("it is Primitive");	
 else if(c.isArray())
	 System.out.println("it is a Array");
 else
	 System.out.println("it is a class");
	 System.out.println(c.getName());
Class in[]=c.getInterfaces();
for(Class t:in)
	System.out.println(t.getName());

Method m=c.getDeclaredMethod("operation",int.class,int.class);
System.out.println(m.getName());
System.out.println("40+2="+myApp.operateBinary(40,2,addition));
System.out.println(m.getName());
System.out.println("20-10="+myApp.operateBinary(20,10,subtraction));
 
 }
 void show(IntegerMath m)
 {
	 System.out.println(m.operation(10,20));
 }
} 
 @FunctionalInterface
 interface IntegerMath
 {
	 int operation(int a,int b);
 }

/*
E:\Advance_java\LambdaExpression>java  Calculator
30
30
it is a class
Calculator$$Lambda$3/295530567
IntegerMath
operation
40+2=42
operation
20-10=10
*/