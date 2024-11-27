import java.time.LocalDate;

public class Minus
{
   public static void main(String arg[])
   {
	   LocalDate ld=LocalDate.of(2014,6,21);
	   LocalDate ld1=ld.minusMonths(5);
	   System.out.println(ld1);
	   
	    LocalDate ld2=ld.minusWeeks(3);
		System.out.println(ld2); 
   }  
}

/*
E:\Advance_java\Date_API>java  Minus
2014-01-21
2014-05-31
*/