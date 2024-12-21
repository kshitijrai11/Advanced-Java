import java.sql.*;
import java.io.*;
import java.util.*;

class TestRerive2 {
  public static void main(String[] args) {
    try 
        {
            FileInputStream fn=new FileInputStream("dp.properties");
            Properties pr=new Properties();
            pr.load(fn);
            String driver=pr.getProperty("driver");
            String url=pr.getProperty("url");
            String user=pr.getProperty("user");
            String pass=pr.getProperty("pass");
			Class.forName(driver);

            Connection c=DriverManager.getConnection(url, user, pass);
            Statement s=c.createStatement();
            ResultSet result1=s.executeQuery("select * from emp101");
            while (result1.next()) {
                
                System.out.println(result1.getString("ename")+"="+result1.getString(2));

            }

        }catch(SQLException e)
        {
            System.out.println(e);
        }catch(Exception i)
        {System.out.println(i);}
  }    
}

//C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar


/*

E:\JDBC\CURD_opration>javac TestRerive2.java

E:\JDBC\CURD_opration>java  TestRerive2
ram=ram
shyam=shyam
shiv=shiv
hector=hector
hector=hector*/