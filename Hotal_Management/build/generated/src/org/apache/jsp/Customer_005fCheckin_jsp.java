package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customer_005fCheckin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body style=\"background-color:#999900\">\n");
      out.write("<h1><center>Customer Checkin Form</center></h1>\n");
      out.write(" <form>\n");
      out.write("        <table align=\"center\">\n");
      out.write("  \n");
      out.write("             <tr>\n");
      out.write("                  <td>Customer Name </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"cusname\"></td>\n");
      out.write("             </tr> \n");
      out.write("                          \n");
      out.write("             <tr>\n");
      out.write("                  <td>Customer's Father name </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"cusfaname\"></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td> Gender </td>\n");
      out.write("                  <td><input type=\"radio\" name=\"gender\" value=\"male\"> Male</td>\n");
      out.write("                  <td><input type=\"radio\" name=\"gender\" value=\"female\"> Female</td> \n");
      out.write("             </tr> \n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td> Martial Status </td>\n");
      out.write("                  <td><input type=\"radio\" name=\"Martial_Status\" value=\"Married\"> Male</td>\n");
      out.write("                  <td><input type=\"radio\" name=\"Martial_Status\" value=\"UnMarried\"> Female</td> \n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>Address </td>\n");
      out.write("                  <td> <textarea  align=\"center\" name=\"Address\" rows=\"4\" cols=\"30\" ></textarea></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>Mobile </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"Mobile\"></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>MailId </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"MailId\"></td>\n");
      out.write("             </tr> \n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>ID Proof </td>\n");
      out.write("                  <td> <select>\n");
      out.write("                        <option value=\"Adhar\">Adhar</option>\n");
      out.write("                        <option value=\"Licence\">Licence</option>\n");
      out.write("                        <option value=\"Voter\">Voter</option>\n");
      out.write("                        <option value=\"College ID\">College ID</option>\n");
      out.write("                        <option value=\"PAN\">PAN</option>\n");
      out.write("                      </select>\n");
      out.write("                  </td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>ID Number </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"ID Number\"></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("              <tr>\n");
      out.write("               <td>Select Room Category  </td>\n");
      out.write("               <td><select>\n");
      out.write("                   </select></td>\n");
      out.write("            </tr>\n");
      out.write("               \n");
      out.write("            <tr>\n");
      out.write("               <td>Select Room Type  </td>\n");
      out.write("               <td> <select>\n");
      out.write("                    </select></td><td> <button>OK</button></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("               <td>Available Room No.s  </td>\n");
      out.write("               <td> <select>\n");
      out.write("                    </select></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                  <td>Rent </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"rent\"></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>Check In  Date </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"checkin date\"></td>\n");
      out.write("             </tr>     \n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                 <td align=\"right\"> <input type=\"submit\" value=\"SAVE\"></td>\n");
      out.write("             </tr>\n");
      out.write("        </table>\n");
      out.write(" </form>    </body>\n");
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
