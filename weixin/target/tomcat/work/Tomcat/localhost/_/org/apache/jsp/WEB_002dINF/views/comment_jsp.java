/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-07 08:58:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\">\r\n");
      out.write("    <meta name=\"Generator\" content=\"ECSHOP v2.7.3\"/>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <title>用户中心_心点芯官网 </title>\r\n");
      out.write("    <meta name=\"Keywords\" content=\"\"/>\r\n");
      out.write("    <meta name=\"Description\" content=\"\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.0, user-scalable=0\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../comment/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("    <link href=\"../../comment/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link href=\"../../comment/AmazeUI-2.4.2/assets/css/amazeui.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link href=\"../../comment/basic/css/demo.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link type=\"text/css\" href=\"../../comment/css/optstyle.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../comment/basic/js/jquery-1.7.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../comment/js/list.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        *{ padding:0; margin:0; list-style:none; border:0;}\r\n");
      out.write("        .all{ width: 380px; height: 300px; padding: 7px; position: relative; }\r\n");
      out.write("        .screen{\r\n");
      out.write("            width:380px;\r\n");
      out.write("            height:300px;\r\n");
      out.write("            overflow:hidden;\r\n");
      out.write("            position:relative;\r\n");
      out.write("        }\r\n");
      out.write("        .screen li{ width:380px; height:300px; overflow:hidden; float:left;}\r\n");
      out.write("        .screen ul{ position:absolute; left:0; top:0px; width:6000px;}\r\n");
      out.write("        .all ol{ position:absolute; right:10px; bottom:10px; line-height:20px; text-align:center;}\r\n");
      out.write("        .all ol li{ float: left; width: 15px; height: 10px; background: #fff;  margin-left: 5px;\r\n");
      out.write("            cursor: pointer; font-size: 0px; font-family: Verdana; line-height: 15px; border-radius: 15px; }\r\n");
      out.write("        .all ol li.current{ background:#2bb4e8;}\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../../comment/picRun/picRun.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- head 中 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdn.bootcss.com/weui/1.1.1/style/weui.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdn.bootcss.com/jquery-weui/1.0.1/css/jquery-weui.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"js/shopping_flow.js\"></script>-->\r\n");
      out.write("<!-- 引入微信的js  sdk  接口 中 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://res.wx.qq.com/open/js/jweixin-1.2.0.js\"></script>\r\n");
      out.write("<!--通过config接口注入权限验证配置-->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <input id=\"productId\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <div class=\"tab_nav\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"h-left\">\r\n");
      out.write("                <a class=\"sb-back\" href=\"javascript:history.back(-1)\" title=\"返回\"> < </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"h-mid\"> </div>\r\n");
      out.write("            <div class=\"h-right\">\r\n");
      out.write("                <aside class=\"top_bar\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <a id=\"mc-menu-hd\" href=\"#\" target=\"_top\">\r\n");
      out.write("                        <i class=\"am-icon-shopping-cart  am-icon-fw\"></i>\r\n");
      out.write("                        <!--<span>购物车</span>-->\r\n");
      out.write("                        <strong id=\"J_MiniCartNum\" class=\"h\">0</strong>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--<div onClick=\"show_menu();$('#close_btn').addClass('hid');\" id=\"show_more\">-->\r\n");
      out.write("                    <!--<a href=\"javascript:;\">...</a>-->\r\n");
      out.write("                    <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("                </aside>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p style=\"height: 20px\"></p>\r\n");
      out.write("<div class=\"all\" id='all' style=\"left: -7px;top:-27px;\">\r\n");
      out.write("    <div class=\"screen\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.imageURL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" width=\"380\" height=\"300\" /></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.secondImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" width=\"380\" height=\"300\" /></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.imageURL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" width=\"380\" height=\"300\" /></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ol>\r\n");
      out.write("    </ol>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"tbh5v0\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"item-inform\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"clearfixRight\" style=\"clear:both;\">\r\n");
      out.write("\r\n");
      out.write("        <!--规格属性-->\r\n");
      out.write("        <!--名称-->\r\n");
      out.write("        <div class=\"tb-detail-hd\">\r\n");
      out.write("            <hr style=\"height:1px;border:none;border-top:1px dashed rgba(202,202,202,0.36);\"/>\r\n");
      out.write("            <h1 style=\"color: #379cbe\">\r\n");
      out.write("                <span style=\"color: #fafafa\">xx</span>\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("            </h1>\r\n");
      out.write("            <span style=\"color: #fafafa\">xx</span>\r\n");
      out.write("            <input type=\"text\" style=\"color:#cacaca;\" value=\"产品类型:&nbsp;奶油类\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tb-detail-list\">\r\n");
      out.write("            <!--价格-->\r\n");
      out.write("            <div class=\"price\">\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <b class=\"sys_item_price\">\r\n");
      out.write("                        <h1 style=\"color: #379cbe\">\r\n");
      out.write("                            <span style=\"color: #fafafa\">xx</span>\r\n");
      out.write("                            <span class=\"J_Price price-now\">¥</span>\r\n");
      out.write("                            <span id=\"money\" class=\"J_Price price-now\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.salePrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                            <span style=\"color: #fafafa\">xx</span>\r\n");
      out.write("                            重量:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.weight}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("磅\r\n");
      out.write("                            <span style=\"color: #fafafa\">xx</span>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </dd>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("            <div class=\"theme-popbod dform\">\r\n");
      out.write("                <form class=\"theme-signin\" name=\"loginform\" action=\"\" method=\"post\">\r\n");
      out.write("                    <div class=\"theme-signin-left\">\r\n");
      out.write("                        <div class=\"theme-options\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"theme-options\">\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <span style=\"color: #fafafa\">x</span>\r\n");
      out.write("                                <input id=\"min\" class=\"am-btn am-btn-default\" name=\"\" type=\"button\" value=\"-\"/>\r\n");
      out.write("                                <input id=\"text_box\" name=\"\" type=\"text\" value=\"1\" style=\"width:20px;left:80px\"/>\r\n");
      out.write("                                <input id=\"add\" class=\"am-btn am-btn-default\" name=\"\" type=\"button\" value=\"+\"/>\r\n");
      out.write("                            </dd>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--<div class=\"theme-signin-right\">-->\r\n");
      out.write("                    <!--<div class=\"img-info\">-->\r\n");
      out.write("                    <!--<img src=\"../images/songzi.jpg\"/>-->\r\n");
      out.write("                    <!--</div>-->\r\n");
      out.write("                    <!--<div class=\"text-info\">-->\r\n");
      out.write("                    <!--<span class=\"J_Price price-now\">¥39.00</span>-->\r\n");
      out.write("                    <!--</div>-->\r\n");
      out.write("                    <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"clear:both;\">\r\n");
      out.write("                <span style=\"color: #fafafa\">x</span>\r\n");
      out.write("                <spen style=\"color: #aba8a8;\"></spen>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("            <!--活动\t-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"weui-cells weui-cells_form\">\r\n");
      out.write("    <div class=\"weui-cell\">\r\n");
      out.write("        <div class=\"weui-cell__bd\">\r\n");
      out.write("            <textarea class=\"weui-textarea\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.introduce}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" rows=\"3\"></textarea>\r\n");
      out.write("            <div class=\"weui-textarea-counter\"><span>0</span>/200</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"introduce\">\r\n");
      out.write("    <div class=\"introduceMain\">\r\n");
      out.write("        <div class=\"am-tabs\" data-am-tabs>\r\n");
      out.write("            <ul class=\"am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs\"></ul>\r\n");
      out.write("            <div class=\"am-tabs-bd\">\r\n");
      out.write("                <div class=\"am-tab-panel am-fade am-in am-active\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"details\">\r\n");
      out.write("                        <div class=\"twlistNews\">\r\n");
      out.write("                            <img src=\"../../comment/image2/0.png\" width=\"280\" height=\"100\"/>\r\n");
      out.write("                            <!--<img src=\"image2/3.png\"/>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('input[type=text],input[type=password]').bind({\r\n");
      out.write("            focus: function () {\r\n");
      out.write("                $(\".global-nav\").css(\"display\", 'none');\r\n");
      out.write("            },\r\n");
      out.write("            blur: function () {\r\n");
      out.write("                $(\".global-nav\").css(\"display\", 'flex');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<a href=\"javascript:;\" class=\"weui-btn weui-btn_default\" onclick=\"addCart()\">加入购物车</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!-- body 最后 -->\r\n");
      out.write("<script src=\"//cdn.bootcss.com/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"//cdn.bootcss.com/jquery-weui/1.0.1/js/jquery-weui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function addCart() {\r\n");
      out.write("        var amount = $(\"#text_box\").val();\r\n");
      out.write("        var productId = $(\"#productId\").val();\r\n");
      out.write("        $.post(\"/product_addCart.do\", {productId: productId,amount:amount}, function (data) {\r\n");
      out.write("            $.messager.alert(\"温馨提示\", data.msg, \"info\");\r\n");
      out.write("        });\r\n");
      out.write("        alert(\"添加成功\");\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
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
