import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;


public class LocalDateDemo1 {
    public static void main(String[] args) {
       // MonthDay dec25=MonthDay.of(Month.DECEMBER,25);
       MonthDay dec25=MonthDay.of(Month.MAY,12);
       //MonthDay may12=MonthDay.of(MonthDay.MAY,12);
       Year year=Year.now();

       for(int l=1;l<=6;l++)
       {
        LocalDate ld=year.plusYears(l).atMonthDay(dec25);
        int yr=ld.getYear();
        String weekDay=ld.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.getDefault());
        System.out.format("Bdy in %d is on %s.%n",yr,weekDay);
       }
    }
    
}
