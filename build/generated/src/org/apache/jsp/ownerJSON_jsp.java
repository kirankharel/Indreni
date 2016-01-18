package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.primecodes.indreni.dao.impl.DogDAOImpl;
import com.primecodes.indreni.beans.Dog;
import com.primecodes.indreni.dao.DogDAO;

public final class ownerJSON_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery-2.1.3.min.js\">            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World 123!</h1>\n");
      out.write("        \n");
      out.write("        <span id=\"contacts\"></span>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("            <select id=\"owner_id\">\n");
      out.write("                <option value=\"2\">2</option>\n");
      out.write("                <option value=\"1\">1</option>\n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <span id=\"dogs\"></span>\n");
      out.write("        <div>   </div>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            $(document).on('ready',function(){\n");
      out.write("                \n");
      out.write("//                $(\"#owner_id\").on('change',function(){\n");
      out.write("//                    var id = $(\"#owner_id\").val();\n");
      out.write("//                    $('#contacts').html(id);\n");
      out.write("//                   $.get(\"api/ownerService\",function(data){\n");
      out.write("//                        var output=\"\";\n");
      out.write("//                       /*for(i=0;i<data.length;i++){\n");
      out.write("//                           output+= data[i].name + \"<br/>\";\n");
      out.write("//                       }*/\n");
      out.write("//                       $.each(data,function(i,o){\n");
      out.write("//                           if(o.id == id){\n");
      out.write("//                                output+= o.fname + \" \" +o.mname +\" \"+o.lname + \" \"+o.address+ o.houseNumber + o.primaryPhoneNumber; \n");
      out.write("//                            }\n");
      out.write("//                       });\n");
      out.write("//\n");
      out.write("//                       $('#contacts').html(output);\n");
      out.write("//                       $('#dogs').html(output);\n");
      out.write("//                    },\"json\"); \n");
      out.write("//                });\n");
      out.write("                $('#dogs').html(\"What UP\");\n");
      out.write("                $.get(\"api/dogService\",function(data){\n");
      out.write("                    var output=\"\";\n");
      out.write("                    $.each(data,function(i,o)){\n");
      out.write("                        output += o.name + o.id;\n");
      out.write("                    }\n");
      out.write("                   $('#dogs').html(output);\n");
      out.write("                },\"json\");\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        ");

            DogDAO dDAO = new DogDAOImpl();
            out.print(dDAO.getAll());
        
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
