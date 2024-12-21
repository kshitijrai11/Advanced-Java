import java.util.*;
import java.sql.*;
public class Sql_connetion
{
 public static void main(String a[])
 {
   
   try{
   
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
    
	Statement set=c.createStatement();
	set.executeUpdate("Create table emp101(eno number,ename varchar(12),esalary number)");
	
	System.out.println("Table created sucessfully ...");
	c.close();
   }
   catch(Exception e)
   {
	   System.out.println(e);
   }
   
 }
}