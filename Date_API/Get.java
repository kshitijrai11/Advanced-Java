import java.time.LocalDate;
import java.time.Month;

public class Get
{
  public static void main(String sa[])
  {
	 LocalDate ld=LocalDate.of(2014,6,21);
	 int year=ld.getYear();
	   System.out.println(year);
	   
	    Month month=ld.getMonth();
		System.out.println(month);

	  int day=ld.getDayOfMonth();
	  System.out.println(day);
  }
}
/*
E:\Advance_java\Date_API>javac Get.java

E:\Advance_java\Date_API>java  Get
2014
JUNE
21
*/