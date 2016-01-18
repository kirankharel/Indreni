package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class marketting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("      <title>Marketting Page</title>\n");
      out.write("\t\t\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/basic-style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery-1.11.2.min.js\"></script>\n");
      out.write("    \t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/js/nepali.datepicker.js\"></script>\n");
      out.write("    \t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/nepali.datepicker.css\"/>\n");
      out.write("\t\t\n");
      out.write("            \t\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("                    body{\n");
      out.write("                        background: rgba(233,231,211,1);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    td{\n");
      out.write("                        text-align: left;\n");
      out.write("\n");
      out.write("                        padding: 7px;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    input[type=text]{\n");
      out.write("                        height: 36px;\n");
      out.write("                        font-size: 18px;\n");
      out.write("                    }\n");
      out.write("                    input[type=checkbox]{\n");
      out.write("                        width:20px; \n");
      out.write("                        height:25px;\n");
      out.write("                        text-align:left; \n");
      out.write("                        margin-right:10px;\n");
      out.write("                        padding: 0;\n");
      out.write("                    }\n");
      out.write("                    #tbox{\n");
      out.write("                        position: relative;\n");
      out.write("                        left: -105;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                    .box{\n");
      out.write("\n");
      out.write("                        display: none;\n");
      out.write("                        /*margin-top: 20px;*/\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                    td.Treatment{\n");
      out.write("                        display: none;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                </style>\n");
      out.write("                \n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("                    $(document).ready(function(){\n");
      out.write("                        \n");
      out.write("                        var id = $(\"#ownerSelected\").val(); //Gives value of Owner ID dropdownd\n");
      out.write("                     //Setting value on page load\n");
      out.write("                            $.get(\"api/ownerService\",function(data){\n");
      out.write("                                var output=\"\";\n");
      out.write("                               /*for(i=0;i<data.length;i++){\n");
      out.write("                                   output+= data[i].name + \"<br/>\";\n");
      out.write("                               }*/\n");
      out.write("                               $.each(data,function(i,o){\n");
      out.write("                                   if(o.id == id){\n");
      out.write("                                        output+= o.fname + \" \" +o.mname +\" \"+o.lname + \", \"+o.address+ \" - \" +o.houseNumber; \n");
      out.write("                                    }\n");
      out.write("                               });\n");
      out.write("\n");
      out.write("                               $('#contacts').html(output);\n");
      out.write("                            },\"json\");   \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            //Changing value on dropdown value change\n");
      out.write("                            $(\"#ownerSelected\").on('change',function(){\n");
      out.write("                            var id = $(\"#ownerSelected\").val();\n");
      out.write("                            $.get(\"api/ownerService\",function(data){\n");
      out.write("                                var output=\"\";\n");
      out.write("                               /*for(i=0;i<data.length;i++){\n");
      out.write("                                   output+= data[i].name + \"<br/>\";\n");
      out.write("                               }*/\n");
      out.write("                               $.each(data,function(i,o){\n");
      out.write("                                   if(o.id == id){\n");
      out.write("                                         output+= o.fname + \" \" +o.mname +\" \"+o.lname + \", \"+o.address+ \" - \" +o.houseNumber; \n");
      out.write("                                    }\n");
      out.write("                               });\n");
      out.write("\n");
      out.write("                               $('#contacts').html(output);\n");
      out.write("                            },\"json\");          \n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        \n");
      out.write("                    $('input[type=\"checkbox\"]').click(function(){\n");
      out.write("                        if($(this).attr(\"value\")==\"Rabies\"){\n");
      out.write("                            $(\".Rabies\").toggle();\n");
      out.write("                        }\n");
      out.write("                        if($(this).attr(\"value\")==\"Corona\"){\n");
      out.write("                            $(\".Corona\").toggle();\n");
      out.write("                        }\n");
      out.write("                        if($(this).attr(\"value\")==\"Diptheria\"){\n");
      out.write("                            $(\".Diptheria\").toggle();\n");
      out.write("                        }\n");
      out.write("                        if($(this).attr(\"value\")==\"Treatment\"){\n");
      out.write("                            $(\".Treatment\").toggle();\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("                    \n");
      out.write("                    $('.nepali-calendar').nepaliDatePicker();\n");
      out.write("\n");
      out.write("                });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t<div class=\"well well-sm\">\n");
      out.write("\t\t\t<div class=\"page-header\" id=\"title_text\">\n");
      out.write("  \t\t\t\t<h1><span id=\"indreni_heading\">Indreni</span> <small>Kennel and Vet Service</small></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"navigation_bar\">\n");
      out.write("\n");
      out.write("\t\t\t\t<ul class=\"nav nav-pills\">\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"client.html\">Client</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"dog.html\">Dog</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"  class=\"active\"><a href=\"marketting.html\">Marketting</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"technician.html\">Technician</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"dailyCase.html\">Daily Case</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"pendingCase.html\">Pending Case</a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"dogSale.html\">Dog Sale</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"mating.html\">Mating</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"training.html\">Training</a></li>\n");
      out.write("\t\t\t\t  <li role=\"navigation\"><a href=\"search.html\">Search for Client</a></li>\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"form_div\">\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("                                            <form id=\"marketting_form\" action=\"markettingCheck.jsp\" method=\"get\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Marketting personell  : </th>\t\n");
      out.write("                                                <td><select name=\"marketter\">\t\t\t\t\t\t\t\t\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Client ID  : </th>\t\n");
      out.write("                                                <td colspan=\"2\">\n");
      out.write("                                                    <select name=\"owner_id\" id=\"ownerSelected\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                                <th>\n");
      out.write("                                                    Client Details :\n");
      out.write("                                                </th>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <span id=\"contacts\"></span>\n");
      out.write("                                                </td>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Dog Name : </th>\n");
      out.write("                                            <td colspan=\"2\"><select name=\"dog_name\">\n");
      out.write("                                                    \n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </select></td>\n");
      out.write("                                        </tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th rowspan=\"4\">Vaccination Type  : </th>\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<input  type=\"checkbox\" name=\"r_vaccination\" class=\"custom_checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\tAnti-Rabies\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<td class=\"Rabies box\"> \n");
      out.write("                                                    <input id=\"Anti-Rabies\" type=\"text\" class=\"nepali-calendar\" name=\"r_vaccination_date\" id=\"r_vaccination_date\" placeholder=\"Enter Date\" style=\"position: inherit;\"/>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"d_vaccination\" class=\"custom_checkbox\">\n");
      out.write("\t\t\t\t\t\t\tDiptheria\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<td class=\"Diptheria box\">\n");
      out.write("\t\t\t\t\t\t\t<input  placeholder=\"Enter Date\" style=\"position:inherit;\" type=\"text\" class=\"nepali-calendar\" name=\"d_vaccination_date\" id=\"d_vaccination_date\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"c_vaccination\" class=\"custom_checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\tCorona\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<td class=\"Corona box\">\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"Enter Date\" style=\"position: inherit;\" type=\"text\" class=\"nepali-calendar\" name=\"c_vaccination_date\" id=\"c_vaccination_date\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Treatment : </th>\t\n");
      out.write("\t\t\t\t\t\t<td style=\"padding: 30px;padding-left: 7px;\"><input type=\"checkbox\" name=\"treatment_check\" id=\"treatment\"/></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"Treatment\">\n");
      out.write("\t\t\t\t\t\t<textarea style=\"position: relative;left:-200;\" placeholder=\"Enter Details\" name=\"treatment_details\" rows=\"3\" id=\"treatment_detail_box\"></textarea></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"Treatment\"><input style=\"position: relative;left:-150;\"type=\"text\" class=\"nepali-calendar\" name=\"treatment_date\" placeholder=\"Enter Date\" id=\"treatment_date\"/></td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Marketted Date  : </th>\t\n");
      out.write("                                                <td><input style=\"height:35px\" type=\"text\" id=\"nepaliDate\" name=\"marketting_date\" class=\"nepali-calendar\" placeholder=\"Enter Date\"/></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<td><Button style=\"position: relative; left: 141;\"type=\"Submit\" value=\"submit\" class=\"btn btn-success\">Submit</button></td>\n");
      out.write("\t\t\t\t\t\t<td><Button style=\"position: relative; left: 120;\"type=\"Reset\" class=\"btn btn-danger\">Reset</button></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("marketter");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.allMarketter}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${marketter.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${marketter.getFname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>                                                            \n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("ownerAll");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ownerAll}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ownerAll.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ownerAll.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("dog");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dog}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dog.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dog.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
