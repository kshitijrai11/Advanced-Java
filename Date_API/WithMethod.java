import java.time.LocalDate;
import java.time.Month;

public class WithMethod {
    public static void main(String[] args) {
        
        LocalDate ld1=LocalDate.of(2024,Month.APRIL,21);
        System.out.println(ld1);

        LocalDate ld2=ld1.withYear(2025);
        System.out.println(ld2);

        LocalDate ld3=ld1.withYear(2023).withMonth(7);
        System.out.println(ld3);
        
    }
    
}
/*
 * 2024-04-21
2025-04-21
2023-07-21
 */