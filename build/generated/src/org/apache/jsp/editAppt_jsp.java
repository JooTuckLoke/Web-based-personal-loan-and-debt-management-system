package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class editAppt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Appointment</title>\n");
      out.write("        <style>\n");
      out.write("            label {\n");
      out.write("                display:inline-block;\n");
      out.write("                width:200px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String err = (String)request.getAttribute("errorMsg");
            String name = null;
            String telno = null;
            String email = null;
            String date = null;
            String time = null;
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/3502project","root","admin");
            Statement s = con.createStatement();
            String qry = "SELECT * FROM faappointment";
            ResultSet rs = s.executeQuery(qry);
            if(rs.next())
            {
                name = rs.getString("name");
                telno = rs.getString("telno");
                email = rs.getString("email");
                date = rs.getString("date");
                time = rs.getString("time");
            }
        
      out.write("\n");
      out.write("        <h1>Update Appointment Details:</h1>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"editAppt\">\n");
      out.write("            <label for=\"name\">Name:</label>\n");
      out.write("            <input type=\"text\" name=\"name\" id=\"name\" readonly=\"readonly\" style=\"width:250px\" value=\"");
      out.print(name);
      out.write("\">\n");
      out.write("            <br><br>\n");
      out.write("            <label for=\"telno\">Contact Number:</label>\n");
      out.write("            <input type=\"text\" name=\"telno\" id=\"telno\" value=\"");
      out.print(telno);
      out.write("\" placeholder=\"E.g. 016-6667777\" style=\"width:150px\" required autofocus/>\n");
      out.write("            <br><br>\n");
      out.write("            <label for=\"email\">Email Address:</label>\n");
      out.write("            <input type=\"email\" name=\"email\" id=\"email\" value=\"");
      out.print(email);
      out.write("\" placeholder=\"E.g. ali88@yahoo.com\" style=\"width:230px\" required/>\n");
      out.write("            <br><br>\n");
      out.write("            <label for=\"date\">Appointment date:</label>\n");
      out.write("            <input type=\"date\" name=\"date\" id=\"date\" value=\"");
      out.print(date);
      out.write("\" placeholder=\"E.g. 20/2/2022\" required/>\n");
      out.write("            <br><br>\n");
      out.write("            <label for=\"time\">Select a time: <br> (between 9 A.M. - 6 P.M.)</label>\n");
      out.write("            <input type=\"time\" name=\"time\" id=\"time\" value=\"");
      out.print(time);
      out.write("\" min=\"09:00\" max=\"18:00\" required/>\n");
      out.write("            <br><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Save changes\">\n");
      out.write("            <input type=\"reset\" value=\"Cancel\">\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("            var msg = \"");
      out.print(err);
      out.write("\";\n");
      out.write("            if(msg === \"null\")\n");
      out.write("            { } \n");
      out.write("            else\n");
      out.write("            { alert(msg); }\n");
      out.write("        </script>\n");
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
