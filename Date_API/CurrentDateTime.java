import java.util.Date;

public class CurrentDateTime
{
 public static void main(String ram[])
 {
	 Date d=new Date();
	String s=d.toString();
	 System.out.println(s);
 }
}
/*  
E:\Advance_java\Date_API>javac CurrentDateTime.java

E:\Advance_java\Date_API>java  CurrentDateTime
Sat Apr 20 11:01:34 PDT 2024
*/