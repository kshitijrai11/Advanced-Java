import java.time.LocalDate;

public class PlusMethod
{
	public static void main(String ard[])
	{
		LocalDate l=LocalDate.of(2003,5,12);
		LocalDate l1=l.plusDays(5);
		System.out.println(l1);
		
		LocalDate l2=l.plusMonths(3);
		System.out.println(l2);
		
		LocalDate l3=l.plusWeeks(3);
		System.out.println(l3);
		
	}

}
/*

E:\Advance_java\Date_API>java  PlusMethod
2003-05-17
2003-08-12
2003-06-02
*/