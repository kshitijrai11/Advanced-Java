import java.sql.*;
public class TestData
{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement s=con.createStatement();
		ResultSet set=s.executeQuery("select * from student_record");
		System.out.println("\nID         Name               Mobile_No");
		//data retrive program.
		while(set.next()){
			System.out.println(set.getString(1)+" ---- "+set.getString(2)+" ------- "+set.getString(3));
		}
		}catch(Exception e){
			
		}
		
	}
}