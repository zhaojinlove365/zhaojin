/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-07 06:43:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/static/common/common.jsp", Long.valueOf(1504140159000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>用户信息管理</title>\r\n");
      out.write("    ");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"/static/plugins/insdep/reset.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/static/plugins/insdep/easyui_full.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/static/plugins/insdep/icon.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/plugins/easyui/jquery.min.js\"></script><!-- jQueryæ ¸å¿å -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/plugins/easyui/jquery.easyui.min.js\"></script><!-- EaysUIæ ¸å¿å -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/plugins/easyui/locale/easyui-lang-zh_CN.js\"></script><!-- ä¸­æå -->\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/js/client.js\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .btn_01 {\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            border: none\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #preview, .img, img {\r\n");
      out.write("            width: 160px;\r\n");
      out.write("            height: 160px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #preview {\r\n");
      out.write("            border: 1px solid #000;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"mass_dialog\">\r\n");
      out.write("    <form action=\"\" method=\"post\" id=\"editForm\">\r\n");
      out.write("        请输入素材ID:<input id=\"media_id\" type=\"text\" name=\"media_id\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"masstext_dialog\">\r\n");
      out.write("    <form action=\"\" method=\"post\" id=\"teditForm\">\r\n");
      out.write("        请输入文本:<input id=\"content\" type=\"text\" name=\"content\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<table id=\"client_datagrid\"></table>\r\n");
      out.write("<div id=\"client_tb\">\r\n");
      out.write("    状态:\r\n");
      out.write("    <select id=\"ss\" class=\"easyui-combobox\" name=\"status\" data-options=\"width:110,panelHeight:'auto'\">\r\n");
      out.write("        <option value=\"\">全部</option>\r\n");
      out.write("        <option value=\"1\">已关注</option>\r\n");
      out.write("        <option value=\"0\">取消关注</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    关注时间<input type=\"text\" name=\"beginConcernTime\" class=\"easyui-datebox\"/>--><input\r\n");
      out.write("        type=\"text\" name=\"endConcernTime\" class=\"easyui-datebox\"/><a class=\"easyui-linkbutton\"\r\n");
      out.write("                                              data-options=\"iconCls:'icon-search',plain:true\"\r\n");
      out.write("                                              data-cmd=\"searchContent\">查询</a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search',plain:true\"\r\n");
      out.write("       data-cmd=\"massMessage\">群发图文消息</a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search',plain:true\"\r\n");
      out.write("       data-cmd=\"massTextMessage\">群发文本消息</a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-reload',plain:true\"\r\n");
      out.write("       data-cmd=\"rload\">刷新</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mass_bt\">\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save',plain:true\" data-cmd=\"save\">确认</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"masstext_bt\">\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save',plain:true\" data-cmd=\"tsave\">确认</a>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
