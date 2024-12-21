import java.sql.*;
class TestRetrive
{
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
            Statement s=c.createStatement();

            ResultSet result1=s.executeQuery("select * from emp101");
            while(result1.next())
            {
                System.out.println(result1.getString("ename")+"="+result1.getString(2));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(Exception i)
        {System.out.println(i);}
    }
}

/*
E:\JDBC\CURD_opration>javac TestRetrive.java

E:\JDBC\CURD_opration>java TestRetrive
ram=ram
shyam=shyam
shiv=shiv
hector=hector
hector=hector
*/