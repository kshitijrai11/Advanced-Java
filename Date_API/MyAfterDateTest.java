import java.util.Date;

public class MyAfterDateTest
{
 public static void main(String[] args) {
    
    Date current=new Date();
    //create a date one day after currnt date
    long nextDay=System.currentTimeMillis()+ 1000*60*60*24;
    //create date object
    Date next=new Date(nextDay);
    long prevDay=System.currentTimeMillis()- 1000*60*60*24;
    //create date object
    Date prev=new Date(prevDay);
    System.out.println(prev);
    System.out.println(next);
    //compare both dates
    if(next.after(current))
    {
        System.out.println("The date is future day");
    }else{
        System.out.println("The dateb is older then current day");
    }
    if(prev.before(current))
    {
        System.out.println("The date is older then current day");
    }
    
 }
}