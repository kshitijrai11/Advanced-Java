import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
public class Jdbc_Insert
{
  public static void main(String a[])
  {
	  try
	  {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
		PreparedStatement pset=c.prepareStatement("insert into emp101 values(?,?,?)");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Enter emp id: ");
			int eno=Integer.parseInt(br.readLine());
			
			System.out.println("Enter emp Name: ");
			String ename=br.readLine();
			
			System.out.println("Enter emp Salary: ");
			double esalary=Double.parseDouble(br.readLine());
			
			pset.setInt(1,eno);
			pset.setString(2,ename);
			pset.setDouble(3,esalary);
			
			int count=pset.executeUpdate();
			if(count>0)
				System.out.println(count+"record inserted");
			else
				System.out.println(count+"no record inserted");
			
			System.out.print("Do you want to more records[Yes/No]");
			
			String ch=br.readLine();
			if(ch.equalsIgnoreCase("yes"))
			break;
		}
	  }catch(Exception e)
	  {
		  System.out.println();
	  }
  }
}


