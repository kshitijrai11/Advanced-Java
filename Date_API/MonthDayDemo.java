import java.time.Month;
import java.time.MonthDay;

public class MonthDayDemo
{
  public static void main(String agrs[])
  {
	  MonthDay md1=MonthDay.of(Month.DECEMBER,25);
	  MonthDay md2=MonthDay.of(Month.FEBRUARY,29);
	  
	  if(md2.isValidYear(2020))
	  {
		  
		  System.out.println(md2+"leap year");
	  }
	  System.out.println(md1.getDayOfMonth());
  }
}
/*
E:\Advance_java\Date_API>java  MonthDayDemo
--02-29leap year
25
*/