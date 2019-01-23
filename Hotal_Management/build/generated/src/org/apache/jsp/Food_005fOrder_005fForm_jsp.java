package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Food_005fOrder_005fForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body backgroud=\"data:image/jpeg;base64,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\">\n");
      out.write("<h1><center>Food Order Form</center></h1>\n");
      out.write(" <form>\n");
      out.write("        <table align=\"center\">\n");
      out.write("  \n");
      out.write("            <tr>\n");
      out.write("               <td align=\"left\">Order No : </td>\n");
      out.write("               <td align=\"left\"> <input type=\"text\" name=\"OrderNo\"></td>\n");
      out.write("                <td align=\"right\">Date </td>\n");
      out.write("                <td align=\"right\"> <input type=\"text\" name=\"Date\"></td>\n");
      out.write("         \n");
      out.write("            <tr>\n");
      out.write("               <td>Select Room No  </td>\n");
      out.write("               <td> <select>\n");
      out.write("                   </select></td> <td> <button>OK</button></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("               <td>Customer Name </td>\n");
      out.write("               <td> <input type=\"text\" name=\"cusname\">\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("               <td>Select Category  </td>\n");
      out.write("               <td><select>\n");
      out.write("                   </select></td>\n");
      out.write("            </tr>\n");
      out.write("               \n");
      out.write("            <tr>\n");
      out.write("               <td>Food Type  </td>\n");
      out.write("               <td> <select>\n");
      out.write("                    </select></td><td> <button>OK</button></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("               <td>Dish Name  </td>\n");
      out.write("               <td><select>\n");
      out.write("                   </select></td><td> <button>OK</button></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("               <td>Enter Price </td>\n");
      out.write("               <td> <input type=\"text\" name=\"Price\">\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("               <td>Rent </td>\n");
      out.write("               <td> <input type=\"text\" name=\"Rent\">\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("               <td>Quantity </td>\n");
      out.write("               <td> <input type=\"text\" name=\"Quantity\"><button>Add Food</button></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("               <td align=\"left\">Food to Order </td><br/><br/>\n");
      out.write("               <td align=\"left\"><ol>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                     <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                </ol></td>\n");
      out.write("                <td align=\"center\">Quantity </td>\n");
      out.write("                <td align=\"center\"><ol>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                     <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                </ol></td>       \n");
      out.write("               <td align=\"right\">Price </td>\n");
      out.write("                <td align=\"right\"><ol>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                     <li></li>\n");
      out.write("                    <li></li><br/>\n");
      out.write("                   Total Price\n");
      out.write("                   <input type=\"text\" name=\"total\">\n");
      out.write("</ol></td>       \n");
      out.write("        </tr>\n");
      out.write("                    \n");
      out.write("           <tr align=\"right\">\n");
      out.write("               <td> <input type=\"submit\" value=\"ORDER\"></td>\n");
      out.write("           </tr>\n");
      out.write("            \n");
      out.write("  </table>  \n");
      out.write(" </form>    \n");
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
