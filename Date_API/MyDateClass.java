import java.util.Date;

public class MyDateClass
{
    public static void main(String[] args) {
        Date d=new Date();
       //Date d=new Date(21,4,2024,9,20,40);

        System.out.println("Todays Date is:"+d);
        System.out.println("current Date is:"+d.getDate());
        System.out.println("current day is:"+d.getDay());
        System.out.println("current year:"+d.getYear());
        System.out.println("current hours:"+d.getHours());
        System.out.println("current minutes:"+d.getMinutes());
        System.out.println("current seconds:"+d.getSeconds());
    }
}