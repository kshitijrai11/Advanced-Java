import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class NowMethod
{
	public static void main(String ard[])
	{
		LocalDate l=LocalDate.now();
		System.out.println(l);
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
	}
}
/*
E:\Advance_java\Date_API>java  NowMethod
2024-04-22
03:33:48.357
2024-04-22T03:33:48.357
2024-04-22T03:33:48.357-07:00[America/Los_Angeles]
*/

