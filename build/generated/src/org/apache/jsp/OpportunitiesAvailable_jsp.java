package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class OpportunitiesAvailable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>Opportunities available at present!</h1>\n");
      out.write("        ");
 try
        {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from opportunities");
                if(rs.next())
                {
          
      out.write("  \n");
      out.write("    \n");
      out.write("        <p>\n");
      out.write("            <em>Name of Company ::</em>");
 out.println(rs.getString(1));
      out.write("<br><br>\n");
      out.write("            <em>Company ID ::</em>");
 out.println(rs.getString(2));
      out.write("<br><br>\n");
      out.write("            <em>Company Type ::</em>");
 out.println(rs.getString(3));
      out.write("<br><br>\n");
      out.write("            <em>Technology ::</em>");
 out.println(rs.getString(4));
      out.write("<br><br>\n");
      out.write("            <em>Company Contact No ::</em>");
 out.println(rs.getString(5));
      out.write("<br><br>\n");
      out.write("            <em>Package Offered::</em>");
 out.println(rs.getString(6));
      out.write("<br><br>\n");
      out.write("            <em>Requirements ::</em>");
 out.println(rs.getString(7));
      out.write("<br><br>            \n");
      out.write("        </p>\n");
      out.write("    \n");
      out.write("       ");
 }
        }
        catch(Exception e)
        {
            out.println("Empty or error in processing");
        }
        
      out.write("\n");
      out.write("        </center>\n");
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