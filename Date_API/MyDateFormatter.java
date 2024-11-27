import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormatter {
   
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("YYY.MM.dd.G 'at' HH:mm:ss z");
        
        System.out.println("yyy.MM.dd G 'at' HH:mm:ss z  --->"+sdf.format(new Date()));
        sdf=new SimpleDateFormat("hh 'o''clock' a,zzzz");
        System.out.println("hh 'o''clock' a,zzzz --->"+sdf.format(new Date()));
    }
}
