package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Opportunity_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_form_action.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");
      if (_jspx_meth_h_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </center>\n");
      out.write("\n");
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

  private boolean _jspx_meth_h_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent(null);
    _jspx_th_h_form_0.setAction("/oppo");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("         Company Name :<input type=\"text\" name=\"indname\" size=\"20\" required/><br><br>\n");
        out.write("         Company Id :<input type=\"text\" name=\"indid\" size=\"20\" required /><br><br>\n");
        out.write("        Company type:<select name=\"indtype\"> \n");
        out.write("            <option value=\"Software\">Software </option>\n");
        out.write("            <option value=\"Management\">Management </option>\n");
        out.write("            <option value=\"Bussiness\">Bussiness </option>\n");
        out.write("        </select>\n");
        out.write("        <br><br>\n");
        out.write("        Technology :<select name=\"tech\" multiple=\"multiple\" size=\"4\">\n");
        out.write("            <option value=\"C\">C</option>\n");
        out.write("            <option value=\"C++\">C++</option>\n");
        out.write("            <option value=\"Java\">Java</option>\n");
        out.write("            <option value=\"DBMS\">DBMS</option>\n");
        out.write("            <option value=\"Struts\">Struts</option>\n");
        out.write("        </select><br><br>\n");
        out.write("        REQUIREMENTS :<input type=\"text\" name=\"req\" size=\"20\" required/><br><br>\n");
        out.write("        Contact :<input type=\"text\" name=\"contact\" size=\"20\" required/><br><br>\n");
        out.write("        Minimum Package:<input type=\"text\" name=\"packa\" size=\"20\" required/><br><br>        \n");
        out.write("        <input type=\"submit\" value=\"SUBMIT\"/><br><br>\n");
        out.write("        <input type=\"reset\" value=\"RESET\"/>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
    return false;
  }
}
