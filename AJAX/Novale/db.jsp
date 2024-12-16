<%@ page import="java.io.*,java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%

response.setContentType("text/xml");
String sn=request.getParameter("ok");
int i=Integer.parseInt(sn);

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
Statement st=con.createStatement();
out.println("helllllllllllllllllllllllllllll");
ResultSet rs=st.executeQuery("SELECT * FROM student WHERE id="+i);

if(rs.next())
{
	out.println("<student>");
	out.println("<stdid>"+rs.getInt(1)+"</stdid>");
	out.println("<stdname>"+rs.getString(2)+"</stdname>");
	out.println("<stdage>"+rs.getString(3)+"</stdage>");
	
	out.println("</student>");
}



%>