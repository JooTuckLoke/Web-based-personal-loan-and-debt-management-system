package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewAppt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("        <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.0/examples/cover/\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/cover.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <title>Appointment Details</title>\n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            th,td {\n");
      out.write("                font-size:x-large;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"d-flex h-100 text-center text-white bg-dark\">\n");
      out.write("        ");
            
            String info = (String)request.getAttribute("infoMsg");
            String alrt = (String)request.getAttribute("alertMsg");
            String updated = (String)request.getAttribute("updatedMsg");
            
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
      out.write("        \n");
      out.write("        <div class=\"cover-container d-flex w-100 h-100 p-3 mx-auto flex-column\">\n");
      out.write("        <header>\n");
      out.write("            <div>\n");
      out.write("                <h3 class=\"float-md-start mb-0\">Group 8</h3>\n");
      out.write("                <nav class=\"nav nav-masthead justify-content-center float-md-end\">\n");
      out.write("                    <a class=\"nav-link \" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Debt</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Loan</a>\n");
      out.write("                    <a class=\"nav-link active\" href=\"#\">Appointment</a>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    \n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n");
      out.write("                        <div class=\"navbar-nav\">\n");
      out.write("                            <a class=\"nav-link active\" id=\"subnav\"  aria-current=\"page\" href=\"makeAppt.jsp\">Make Appointment</a>\n");
      out.write("                            <a class=\"nav-link\" id=\"subnav\" href=\"viewAppt.jsp\">View Appointment</a>\n");
      out.write("                            <a class=\"nav-link\" id=\"subnav\" href=\"editAppt.jsp\">Update Appointment</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("            <main class=\"px-3\">\n");
      out.write("                <table class=\"table table-dark table-borderless\">\n");
      out.write("                    <thead>\n");
      out.write("                    <th>Appointment Details:</th>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Name: ");
      out.print(name);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Contact Number: ");
      out.print(telno);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Email Address: ");
      out.print(email);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date: ");
      out.print(date);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Time: ");
      out.print(time);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"editAppt.jsp\" class=\"btn btn-lg btn-secondary fw-bold border-white bg-white\">Update</a> <a onclick=\"myFunction()\" class=\"btn btn-lg btn-secondary fw-bold border-white bg-white\">Delete</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>   \n");
      out.write("            </main>\n");
      out.write("                        \n");
      out.write("        <br>\n");
      out.write("                    \n");
      out.write("        <footer class=\"mt-auto text-white-50\">\n");
      out.write("            <p>All copyright reserved &copy;2022 - Gabriel, Loke, See</p>                \n");
      out.write("        </footer>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("        <script>\n");
      out.write("            var msg = \"");
      out.print(info);
      out.write("\";\n");
      out.write("            if(msg === \"null\")\n");
      out.write("            { } \n");
      out.write("            else\n");
      out.write("            { alert(msg); }\n");
      out.write("            \n");
      out.write("            var msge = \"");
      out.print(alrt);
      out.write("\";\n");
      out.write("            if(msge === \"null\")\n");
      out.write("            { } \n");
      out.write("            else\n");
      out.write("            { alert(msge); }\n");
      out.write("            \n");
      out.write("            var msage = \"");
      out.print(updated);
      out.write("\";\n");
      out.write("            if(msage === \"null\")\n");
      out.write("            { } \n");
      out.write("            else\n");
      out.write("            { alert(msage); }\n");
      out.write("            \n");
      out.write("            function myFunction() {\n");
      out.write("                var text = confirm(\"Are you sure you want to delete the appointment?\");\n");
      out.write("                if (text) {\n");
      out.write("                    window.location.href = \"deleteAppt?name=");
      out.print(name);
      out.write("\";\n");
      out.write("                }   \n");
      out.write("            }\n");
      out.write("        </script>        \n");
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
