import java.text.DateFormat;
import java.util.Date;

public class DateFormatClass {
    public static void main(String[] args) {
         
        Date d1=new Date();

        DateFormat[] dfa=new DateFormat[6];
        dfa[0]=DateFormat.getInstance();
        dfa[1]=DateFormat.getDateInstance();

        dfa[2]=DateFormat.getDateInstance(DateFormat.SHORT);

        dfa[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4]=DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5]=DateFormat.getDateInstance(DateFormat.FULL);

        for(int i=0;i<dfa.length;i++)
        {
            System.out.println(dfa[i].format(d1));
        }
        for(DateFormat df:dfa)
        {
            System.out.println(df.format(d1));
        }
    }
}
/*
 * Apr 20, 2024
4/20/24
Apr 20, 2024
April 20, 2024
Saturday, April 20, 2024
4/20/24 9:56 PM
Apr 20, 2024
4/20/24
Apr 20, 2024
April 20, 2024
Saturday, April 20, 2024
 */
