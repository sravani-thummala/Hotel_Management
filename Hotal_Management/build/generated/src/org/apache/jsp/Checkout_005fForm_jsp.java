package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Checkout_005fForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body background=\"bgimage.jpg\">\n");
      out.write("<h1><center>Customer CheckOut Form</center></h1>\n");
      out.write(" <form>\n");
      out.write("        <table align=\"center\">\n");
      out.write("  \n");
      out.write("            <tr>\n");
      out.write("               <td>Select Room No :  </td>\n");
      out.write("               <td> <select>\n");
      out.write("                   </select></td> <td> <button>SEARCH</button></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("                  <td>Customer Name </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"cusname\"></td>\n");
      out.write("             </tr> \n");
      out.write("             \n");
      out.write("              <tr>\n");
      out.write("                  <td>Check In  Date </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"checkin date\"></td>\n");
      out.write("             </tr>  \n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>Check Out  Date </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"checkout date\"></td>\n");
      out.write("                 <td> <button>Calculate</button></td>\n");
      out.write("                  <td>NoOf Days </td>\n");
      out.write("                 <td><input type=\"text\" name=\"NoOfDays\">  </td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("              <tr>\n");
      out.write("                  <td>Total Rent To Pay </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"Total Rent\"></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("              <tr>\n");
      out.write("                  <td>Food Ordered Bill </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"FoodBill\"></td>\n");
      out.write("                 <td> <button>ShowDetails</button></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("              <tr>\n");
      out.write("                  <td>Tax </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"tax\"></td>\n");
      out.write("                 <td> <button>OK</button></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                  <td>Total Amount To Pay </td>\n");
      out.write("                 <td> <input type=\"text\" name=\"Total Amount\"></td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("              <tr align=\"right\">\n");
      out.write("               <td> <input type=\"submit\" value=\"CheckOut\"></td>\n");
      out.write("           </tr>\n");
      out.write("             \n");
      out.write("        </table>\n");
      out.write(" </form>\n");
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
