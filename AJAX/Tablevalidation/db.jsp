<%@ page import="java.io.*,java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%

response.setContentType("text/xml");
String sn=request.getParameter("ver");

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from emp101 where name='"+sn+"'");
if(rs.next())
{
	out.println("name is already exists");
}
else
	out.println("valid  name");
rs.close();
st.close();
con.close();

%>