package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Login page</h1>\n");
      out.write("        <form action=\"registration\" method=\"post\">\n");
      out.write("            <table cellpadding=\"4\" cellspacing=\"2\" border=\"0\">\n");
      out.write("                <tr><th colspan=\"2\">Registration form<br></th></tr>\n");
      out.write("                <tr><td>Firstname<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"text\" name=\"fname\" value=\"\" maxlength=\"20\" size=\"15\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td>Lastname<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"text\" name=\"lname\" value=\"\" maxlength=\"20\" size=\"15\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td>Zipcode<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"text\" name=\"zip\" value=\"\" maxlength=\"8\" size=\"5\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td>Username<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"text\" name=\"uid\" value=\"\" maxlength=\"20\" size=\"10\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td>Password<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"password\" name=\"pwd\" value=\"\" maxlength=\"20\" size=\"10\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td>Confirm password<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"password\" name=\"pwd1\" value=\"\" maxlength=\"20\" size=\"10\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td>Town<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"text\" name=\"town\" value=\"\" maxlength=\"10\" size=\"15\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td>Country<sup>*</sup></td>\n");
      out.write("                    <td><input type=\"text\" name=\"country\" value=\"\" maxlength=\"20\" size=\"15\">\n");
      out.write("                    </td></tr>\n");
      out.write("                <tr><td align=\"center\" colspan=\"2\"><br>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
