/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-07 05:47:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script type=\"text/javascript\" src=\"/static/js/product.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"product_datagrid\"></table>\r\n");
      out.write("\r\n");
      out.write("<div id=\"product_dialog\">\r\n");
      out.write("    <form action=\"\" method=\"post\" id=\"editForm\" enctype=\"multipart/form-data\">\r\n");
      out.write("        <table align=\"center\" style=\"border-collapse:separate; border-spacing:0px 10px;\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td id=\"preview11\" align=\"center\" width=\"25px\">\r\n");
      out.write("                    主页第一张图<input type=\"file\" name=\"file\" onchange=\"preview(this)\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td id=\"preview21\" align=\"center\" width=\"25px\">\r\n");
      out.write("                    主页第二张图<input type=\"file\" name=\"file2\" onchange=\"preview(this)\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">重量:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"weight\" placeholder=\"磅\" size=\"35\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">商品名称:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"name\" size=\"35\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">售价:</td>\r\n");
      out.write("                <td><input type=\"number\" name=\"salePrice\" size=\"35\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">成本:</td>\r\n");
      out.write("                <td><input type=\"number\" name=\"costPrice\" size=\"35\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">简介:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"introduce\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"headProduct_dialog\">\r\n");
      out.write("    <form action=\"\" method=\"post\" id=\"addHeadProductForm\" enctype=\"multipart/form-data\">\r\n");
      out.write("        <table align=\"center\" style=\"border-collapse:separate; border-spacing:0px 10px;\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td id=\"preview1\" align=\"center\" width=\"25px\">\r\n");
      out.write("                    主页第一张图<input type=\"file\" name=\"file\" onchange=\"preview(this)\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td id=\"preview2\" align=\"center\" width=\"25px\">\r\n");
      out.write("                    主页第二张图<input type=\"file\" name=\"file2\" onchange=\"preview(this)\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td id=\"preview3\" align=\"center\" width=\"25px\">\r\n");
      out.write("                    主页第二张图<input type=\"file\" name=\"file3\" onchange=\"preview(this)\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">商品名称:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"name\" size=\"35\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">售价:</td>\r\n");
      out.write("                <td><input type=\"number\" name=\"salePrice\" size=\"35\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">成本:</td>\r\n");
      out.write("                <td><input type=\"number\" name=\"costPrice\" size=\"35\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <td align=\"right\">简介:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"introduce\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"product_tb\">\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add',plain:true\" data-cmd=\"add\">增加</a>\r\n");
      out.write("    <a id=\"product_editbtn\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit',plain:true\"\r\n");
      out.write("       data-cmd=\"edit\">编辑</a>\r\n");
      out.write("    <a id=\"product_chagestatebtn\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove',plain:true\"\r\n");
      out.write("       data-cmd=\"del\">删除</a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-reload',plain:true\" data-cmd=\"reload\">刷新</a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add',plain:true\" data-cmd=\"addHead\">增加主题商品</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"product_bt\">\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save',plain:true\" data-cmd=\"save\">确认</a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-cancel',plain:true\" data-cmd=\"cancel\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"headProduct_bt\">\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save',plain:true\" data-cmd=\"saveHead\">确认</a>\r\n");
      out.write("    <a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-cancel',plain:true\" data-cmd=\"cancel\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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