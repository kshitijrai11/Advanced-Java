<%@ page contentType="text/xml" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>

<%
String ageParam = request.getParameter("ok");
Connection con = null;
Statement st = null;
ResultSet rs = null;

try {
  if (ageParam == null) {
    out.println("<error>Missing age parameter</error>");
    return;
  }

  int id = Integer.parseInt(ageParam);

  Class.forName("oracle.jdbc.driver.OracleDriver");
  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "mca6");
  st = con.createStatement();
  rs = st.executeQuery("SELECT * FROM student WHERE STDID = " + id);

  out.println("<student>");
  if (rs.next()) {
    out.println("<stdid>" + rs.getInt(1) + "</stdid>");
    out.println("<stdname>" + rs.getString(2) + "</stdname>");
    out.println("<stdage>" + rs.getString(3) + "</stdage>");
  } else {
    out.println("<error>No student found for id: " + id + "</error>");
  }
  out.println("</student>");
} catch (NumberFormatException e) {
  out.println("<error>Invalid age parameter: " + ageParam + "</error>");
} catch (ClassNotFoundException e) {
  out.println("<error>Database driver not found: " + e.getMessage() + "</error>");
} catch (SQLException e) {
  out.println("<error>Database error: " + e.getMessage() + "</error>");
} finally {
  try {
    if (rs != null) {
      rs.close();
    }
    if (st != null) {
      st.close();
    }
    if (con != null) {
      con.close();
    }
  } catch (SQLException ex) {
    out.println("<error>Failed to close resources: " + ex.getMessage() + "</error>");
  }
}
%>
