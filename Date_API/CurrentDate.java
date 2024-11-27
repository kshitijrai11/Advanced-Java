import java.util.*;

public class CurrentDate
{
	public static void main(String rge[])
	{
	 Date today=new Date();
   //Date today=new Date("05/12/2014 18:25");
   //Date today=new Date(5,12,2014,18,30,45);
   GregorianCalendar cal=new GregorianCalendar();
   //cal.setTime(today);
   System.out.println("Today:"+today.toString());
   displayDateInfo(cal);
   cal.clear();
	 
	}
	static void displayDateInfo(GregorianCalendar cal)
	{
		String days[]={"","sun","mon","tue","wed","thu","fri","sat"};
		String months[]={"Jan","Feb","Mar","April","May","June","July",
		"Aug","Sep","Oct","Nov","Dec"};
	String am_pm[]={"AM","PM"};
	System.out.println("Year:"+cal.get(Calendar.YEAR));
	System.out.println("Month:"+months[cal.get(Calendar.MONTH)]);
	System.out.println("Date:"+cal.get(Calendar.DATE));
	System.out.println("Day:"+days[cal.get(Calendar.DAY_OF_WEEK)]);
	
	System.out.println("Hour:"+(cal.get(Calendar.HOUR)));
	System.out.println("Minutes:"+cal.get(Calendar.MINUTE));
	System.out.println("Second:"+cal.get(Calendar.SECOND));
	System.out.println(am_pm[cal.get(Calendar.AM_PM)]);
	TimeZone tz=cal.getTimeZone();
	System.out.println("TimeZone:"+tz.getID());
	}

}
/*
E:\Advance_java\Date_API>java CurrentDate
Today:Date@7d4991ad
Year:2024
Month:April
Date:20
Day:sat
Hour:8
Minutes:59
Second:43
PM
TimeZone:America/Los_Angeles
*/