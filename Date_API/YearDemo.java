import java.time.Year;

public class YearDemo
{
	public static void main(String agr[])
	{
		Year y1=Year.of(2016);
		System.out.println(y1);
		Year y2=y1.minusYears(1);
		System.out.println(y2);
		Year y3=y1.plusYears(1);
		System.out.println(y3);
		Year y4=Year.now();
		System.out.println(y4);
		if(y1.isLeap())
		{
			System.out.println(y1+" is leap year.");
		}
		else{
			System.out.println(y1+" is not leap year.");
		}
	}
}
/*

E:\Advance_java\Date_API>java  YearDemo
2016
2015
2017
2024
2016 is leap year.
*/