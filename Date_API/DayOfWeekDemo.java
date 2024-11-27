import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekDemo
{
  public static void main(String args[])
  {
	  LocalDate localDate=LocalDate.of(2003,5,12);
	  System.out.println(localDate);
	  
	  DayOfWeek dayOfweek1=DayOfWeek.from(localDate);
	  System.out.println(dayOfweek1);
	  int intValue=dayOfweek1.getValue();
	  System.out.println(intValue);
	  
	  DayOfWeek dayOfweek2=localDate.getDayOfWeek();
	  System.out.println(dayOfweek2);
	  DayOfWeek dayOfweekFromInteger=DayOfWeek.of(7);
	  System.out.println(dayOfweekFromInteger);
	  DayOfWeek dayOfWeekAdded=dayOfweekFromInteger.plus(1);
	  System.out.println(dayOfWeekAdded);
	  DayOfWeek dayOfWeekSubtracted=dayOfweekFromInteger.minus(2);
	  System.out.println(dayOfWeekSubtracted);
  }
}

/*
E:\Advance_java\Date_API>java  DayOfWeekDemo
2003-05-12
MONDAY
1
MONDAY
SUNDAY
MONDAY
FRIDAY
*/