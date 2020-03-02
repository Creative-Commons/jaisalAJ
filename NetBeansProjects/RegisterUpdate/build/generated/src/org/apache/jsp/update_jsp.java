package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "java";
String userid = "root";
String password = "vishu123";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write('\n');

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String uid = request.getParameter("id");
String sql ="select * from register where uid="+uid;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<h1>Update data from database in jsp</h1>\n");
      out.write("<form method=\"post\" action=\"update_process.jsp\">\n");
      out.write("<input type=\"hidden\" name=\"uid\" value=\"");
      out.print(resultSet.getString("uid") );
      out.write("\">\n");
      out.write("<input type=\"text\" name=\"uid\" value=\"");
      out.print(resultSet.getString("uid") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("First name:<br>\n");
      out.write("<input type=\"text\" name=\"fname\" value=\"");
      out.print(resultSet.getString("fname") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Last name:<br>\n");
      out.write("<input type=\"text\" name=\"lname\" value=\"");
      out.print(resultSet.getString("lname") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Password:<br>\n");
      out.write("<input type=\"password\" name=\"pwd\" value=\"");
      out.print(resultSet.getString("pwd") );
      out.write("\">\n");
      out.write("<br>\n");
      out.write("Confirm Password:<br>\n");
      out.write("<input type=\"password\" name=\"pwd1\" value=\"");
      out.print(resultSet.getString("pwd1") );
      out.write("\">\n");
      out.write("<br><br>\n");
      out.write("Zip code:<br>\n");
      out.write("<input type=\"text\" name=\"zipcode\" value=\"");
      out.print(resultSet.getString("zipcode") );
      out.write("\">\n");
      out.write("<br><br>\n");
      out.write("Town:<br>\n");
      out.write("<input type=\"text\" name=\"town\" value=\"");
      out.print(resultSet.getString("town") );
      out.write("\">\n");
      out.write("<br><br>\n");
      out.write("Country:<br>\n");
      out.write("<input type=\"text\" name=\"country\" value=\"");
      out.print(resultSet.getString("country") );
      out.write("\">\n");
      out.write("<br><br>\n");
      out.write("<input type=\"submit\" value=\"submit\">\n");
      out.write("</form>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
