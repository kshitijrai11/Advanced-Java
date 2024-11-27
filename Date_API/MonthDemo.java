import java.time.LocalDate;
import java.time.Month;

public class MonthDemo
{
   public static void main(String askh[])
   {
	   LocalDate ld=LocalDate.of(2016,Month.SEPTEMBER,12);
	   System.out.println(ld);
	   
	   Month month1=Month.from(ld);
	   System.out.println(month1);
	   
	   Month month2=Month.of(2);
	   System.out.println(month2);
	   
	   Month month3=month2.plus(2);
	   System.out.println(month3);
	   
	   Month month4=ld.getMonth();
	   System.out.println(month4);
	   
	   int monthIntValue=month2.getValue();
	   System.out.println(monthIntValue);
   }
}
/*

E:\Advance_java\Date_API>java  MonthDemo
2016-09-12
SEPTEMBER
FEBRUARY
APRIL
SEPTEMBER
2
*/