import java.sql.*;

class TestInsert {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6	");

            int t1=10004;
            String t2="hector";
			int t3=765;
            Statement s=c.createStatement();
            int x=s.executeUpdate("insert into emp101 values('"+t1+"','"+t2+"','"+t3+"')");
            System.out.println(x);
            ResultSet result1=s.executeQuery("select * from emp101");

            while (result1.next()) {
                System.out.println(result1.getString(1));
                System.out.println(result1.getString(2));
                
            }
        }catch(SQLException e)
        {
            System.out.println(e);
        }
		catch(Exception i){System.out.println(i);}
    }
}

/*
SQL> connect
Enter user-name: system
Enter password:
Connected.
*/
/*
E:\JDBC\CURD_opration>javac TestInsert.java

E:\JDBC\CURD_opration>java  TestInsert
1
919383747
ram
35784545
shyam
77784545
shiv
10004
hector
*/