import java.time.LocalDate;
import java.time.LocalDateTime;

public class FromMethod
{
  public static void main(String args[])
  {
	   LocalDateTime ld=LocalDateTime.of(2015,12,30,18,18);
	   System.out.println(ld);
	   
	    LocalDate ld1=LocalDate.from(ld);
		System.out.println(ld1); 
  }
}

/*
E:\Advance_java\Date_API>java  FromMethod
2015-12-30T18:18
2015-12-30
*/