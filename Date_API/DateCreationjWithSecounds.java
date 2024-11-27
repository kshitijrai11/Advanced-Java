import java.util.Date;

public class DateCreationjWithSecounds
{
  public static void main(String args[])
  {
    //get curent time in mill seconds

    long currentTimeInSec=System.currentTimeMillis();
    Date d=new Date(currentTimeInSec);
    System.out.println(d);
  } 
    
}