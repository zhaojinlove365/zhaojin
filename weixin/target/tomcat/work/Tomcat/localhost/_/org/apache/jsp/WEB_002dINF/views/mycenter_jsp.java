/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-07 07:02:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mycenter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"Generator\" content=\"ECSHOP v2.7.3\"/>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <title>用户中心_心点芯蛋糕官网_24小时在线订购_当日新鲜送达 </title>\r\n");
      out.write("    <meta name=\"Keywords\" content=\"\"/>\r\n");
      out.write("    <meta name=\"Description\" content=\"\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.0, user-scalable=0\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"themesmobile/68ecshopcom_mobile/css/user.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"themesmobile/68ecshopcom_mobile/css/public.css\"/>\r\n");
      out.write("    <script src=\"themesmobile/68ecshopcom_mobile/js/modernizr.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"themesmobile/68ecshopcom_mobile/js/jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.json.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/transport.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/utils.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"/static/css/mycenter.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- 引入微信的js  sdk  接口 中 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://res.wx.qq.com/open/js/jweixin-1.2.0.js\"></script>\r\n");
      out.write("<!--通过config接口注入权限验证配置-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"v_nav\">\r\n");
      out.write("    <div class=\"vf_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"/product_index.do\">\r\n");
      out.write("                    <i class=\"vf_1\"><img height=\"20px\" src=\"/static/image/index.png\"></i>\r\n");
      out.write("                    <span>首页</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"/indevidal.do\">\r\n");
      out.write("                    <i class=\"vf_5\"><img height=\"20px\" src=\"/static/image/individual.png\"></i>\r\n");
      out.write("                    <span>个人中心</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"/shoppingCart.do\">\r\n");
      out.write("                    <em id=\"ECS_CARTINFO\" class=\"global-nav__nav-shop-cart-num\"\r\n");
      out.write("                        style=\"right:9px;\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.productNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </em>\r\n");
      out.write("                    <i class=\"vf_4\"><img height=\"20px\" src=\"/static/image/shoppingCart.png\"></i>\r\n");
      out.write("                    <span>购物车</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"v_nav_1\" style=\"background: #67b6ba;position: fixed;top: 0;width: 100%;height: 45px;background-color: #67b6ba;\r\n");
      out.write("z-index: 97;padding: 0px;margin: 0px;padding-bottom: 4px;padding-top: 4px;max-width: 640px;display:none;\">\r\n");
      out.write("    <div style=\"width: 100%;height: 45px;margin: auto;padding: 0px;margin: 0px;max-width: 640px;\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li style=\"width:10%;float:left;text-align: center;\" class=\"close1\">\r\n");
      out.write("                <img src=\"themesmobile/68ecshopcom_mobile/images/flow/c_cancel_1.png\"\r\n");
      out.write("                     style=\" width: 16px;height: 16px;margin-top: 16px;\">\r\n");
      out.write("            </li>\r\n");
      out.write("            <li style=\"width:15%;float:left;text-align: center;\" class=\"close1\">\r\n");
      out.write("                <img src=\"themesmobile/68ecshopcom_mobile/images/flow/weixin.png\"\r\n");
      out.write("                     style=\" width: 36px;height: 36px;margin-top: 5px;border-radius: 10px;\">\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li style=\"width:75%; float:left;\">\r\n");
      out.write("                <h4 style=\"font-size:10px;color:#fff;margin-top: 8px;line-height: 12px;\">微信关注“心点芯”公众号</h4>\r\n");
      out.write("                <h4 style=\"font-size:12px;color:#fff;margin-top: 8px;line-height: 12px;\">更流畅的购物体验</h4>\r\n");
      out.write("\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function checkPlatform() {\r\n");
      out.write("                if (/android/i.test(navigator.userAgent)) {\r\n");
      out.write("                    if (/MicroMessenger/i.test(navigator.userAgent)) {\r\n");
      out.write("                        $(\".v_nav_1\").css(\"display\", \"none\");\r\n");
      out.write("                    }\r\n");
      out.write("                    else {\r\n");
      out.write("                        $(\".v_nav_1\").css(\"display\", \"block\");\r\n");
      out.write("                        $(\".v_nav\").css(\"top\", \"52px\");\r\n");
      out.write("                        $(\".showpage\").css(\"margin-top\", \"114px\");\r\n");
      out.write("                        $(\".com_top\").css(\"top\", \"54px\");\r\n");
      out.write("                        $(\".border-bt\").css(\"margin-top\", \"50px\");\r\n");
      out.write("                        $(\".close1\").click(function () {\r\n");
      out.write("                            $(\".v_nav_1\").css(\"display\", \"none\");\r\n");
      out.write("                            $(\".border-bt\").css(\"margin-top\", \"0px\");\r\n");
      out.write("                            $(\".v_nav\").css(\"top\", \"0px\");\r\n");
      out.write("                            $(\".com_top\").css(\"top\", \"0px\");\r\n");
      out.write("                            $(\".showpage\").css(\"margin-top\", \"62px\");\r\n");
      out.write("                        })\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {\r\n");
      out.write("                        if (/MicroMessenger/i.test(navigator.userAgent)) {\r\n");
      out.write("                            $(\".v_nav_1\").css(\"display\", \"none\");\r\n");
      out.write("                        }\r\n");
      out.write("                        else {\r\n");
      out.write("                            $(\".v_nav_1\").css(\"display\", \"block\");\r\n");
      out.write("                            $(\".v_nav\").css(\"top\", \"52px\");\r\n");
      out.write("                            $(\".showpage\").css(\"margin-top\", \"114px\");\r\n");
      out.write("                            $(\".com_top\").css(\"top\", \"54px\");\r\n");
      out.write("                            $(\".border-bt\").css(\"margin-top\", \"50px\");\r\n");
      out.write("                            $(\".close1\").click(function () {\r\n");
      out.write("                                $(\".v_nav_1\").css(\"display\", \"none\");\r\n");
      out.write("                                $(\".border-bt\").css(\"margin-top\", \"0px\");\r\n");
      out.write("                                $(\".v_nav\").css(\"top\", \"0px\");\r\n");
      out.write("                                $(\".com_top\").css(\"top\", \"0px\");\r\n");
      out.write("                                $(\".showpage\").css(\"margin-top\", \"62px\");\r\n");
      out.write("                            })\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                checkPlatform();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"tbh5v0\">\r\n");
      out.write("    <div class=\"user_com\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"com_top\">\r\n");
      out.write("            <!--<h2 style=\"display:none;\"><a href=\"user.php?act=profile\">设置</a></h2>-->\r\n");
      out.write("            <dl>\r\n");
      out.write("                <dt><img src=\"/static/image/user68.jpg\"> <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.CLIENT_IN_SESSION.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("                    <span><a href=\"security.php\"\r\n");
      out.write("                             style=\"color:#fff;background: #67b6ba;padding: 1% 5%;border-radius: 6px;\">账户管理</a></span>\r\n");
      out.write("\r\n");
      out.write("                </dt>\r\n");
      out.write("\r\n");
      out.write("            </dl>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"Wallet\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"bain1\"><strong>￥0.00</strong><span>余额</span></li>\r\n");
      out.write("                <li class=\"bain2\"><strong>0</strong><span>卡券</span></li>\r\n");
      out.write("                <!--<li><strong>0第郎</strong><span>第郎</span></li>--></ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"Wallet\">\r\n");
      out.write("            <a href=\"\"><em class=\"Icon Icon2\"></em>\r\n");
      out.write("                <dl class=\"b\">\r\n");
      out.write("                    <dt>全部订单</dt>\r\n");
      out.write("                    <dd>查看订单</dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </a>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <a href=\"/\"><em class=\"Icon Icon5\"></em>\r\n");
      out.write("                <dl class=\"b\">\r\n");
      out.write("                    <dt>地址管理</dt>\r\n");
      out.write("                    <dd>查看地址</dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </a>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <!--<a onClick=\"bindPhone()\" href=\"javascript:return false;\"><em class=\"Icon Icon10\"></em><dl class=\"b\"><dt>生日提醒</dt><dd>生日提醒</dd></dl></a>-->\r\n");
      out.write("            <!--<a href=\"user.php?act=profile\" style='display:none;opacity:0;'><em class=\"Icon Icon11\"></em><dl class=\"b\"><dt>修改资料</dt><dd>修改资料</dd></dl></a>-->\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Wallet\" style=\"display:none;opacity:0;\">\r\n");
      out.write("            <!--<a href=\"user.php?act=affiliate\"><em class=\"Icon Icon6\"></em><dl class=\"b\"><dt>我的推荐</dt><dd>&nbsp;</dd></dl></a>-->\r\n");
      out.write("            <a href=\"user.php?act=message_list\"><em class=\"Icon Icon7\"></em>\r\n");
      out.write("                <dl class=\"b\">\r\n");
      out.write("                    <dt>我的留言</dt>\r\n");
      out.write("                    <dd>&nbsp;</dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"user.php?act=my_comment\"><em class=\"Icon Icon4\"></em>\r\n");
      out.write("                <dl class=\"b\">\r\n");
      out.write("                    <dt>我的评价</dt>\r\n");
      out.write("                    <dd>查看评价</dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"user.php?act=collection_list\"><em class=\"Icon Icon10\"></em>\r\n");
      out.write("                <dl>\r\n");
      out.write("                    <dt>我的收藏</dt>\r\n");
      out.write("                    <dd>&nbsp;</dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Wallet\" style=\"display:none;opacity:0;\">\r\n");
      out.write("            <a href=\"javascript:void(0)\" onClick=\"window.location.href='user.php?act=logout'\"><em\r\n");
      out.write("                    class=\"Icon Icon8\"></em>\r\n");
      out.write("                <dl>\r\n");
      out.write("                    <dt>注销登录</dt>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"bindPhonebg\"\r\n");
      out.write("         style=\"width:100%;height:100%;position:fixed;top:0px;left:0px;background-color:rgba(0,0,0,0.4);z-index:100000;display:none;\"></div>\r\n");
      out.write("    <div id=\"bindPhone\"\r\n");
      out.write("         style=\"position:fixed;top:10%;left:0%;z-index:100000;background-color:rgba(19, 38, 69,0.9);width:280px;height:260px;border-radius:8px;overflow:hidden;font-size:16px;line-height:20px;display:none;\">\r\n");
      out.write("        <div style=\"width:100%;height:100%;position:relative;\">\r\n");
      out.write("            <div id='close_bindPhone'\r\n");
      out.write("                 style='width:16px;line-height:22px;font-size:18px;color:#ddd;position:absolute;top:0px;right:3px;cursor:pointer;'>\r\n");
      out.write("                ×\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"font-size:14px;line-height:18px;color:#dfdfdf;text-align:center;padding-top:30px;\"\r\n");
      out.write("                 id=\"bindtitle\">您还没有绑定您的手机号</br>请您绑定后设置生日提醒\r\n");
      out.write("            </div>\r\n");
      out.write("            <form style=\"width:100%;margin-top:10px;\" id=\"eventBox\">\r\n");
      out.write("                <div style=\"width:65%;margin:0 auto;\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div style=\"font-size:12px;color:#dfdfdf;\">手机号码：</div>\r\n");
      out.write("                        <div><input type=\"text\" name=\"bindphone\"\r\n");
      out.write("                                    style=\"width:100%;border:none;height:24px;border-radius:6px;font-size:14px;text-align:center;\"\r\n");
      out.write("                                    placeholder=\"请输入手机号码\"/></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div style=\"font-size:12px;color:#dfdfdf;\">滑块验证：</div>\r\n");
      out.write("                        <div style=\"width:100%;height:26px;border-radius:6px;background-color:#c6ff00;position:relative;line-height:26px;color:#666;font-size:14px;text-align:center;\"\r\n");
      out.write("                             id=\"sliderBox\">\r\n");
      out.write("\r\n");
      out.write("                            <span>拖动滑块验证</span>\r\n");
      out.write("                            <div style=\"position:absolute;left:1px;top:2px;height:22px;border-radius:6px;width:40px;background-color:#3ea13d;color:#c6ff00;text-align:center;line-height:22px;\"\r\n");
      out.write("                                 id=\"bindslider\">>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"yzmBox\" style=\"position:relative;display:none;\">\r\n");
      out.write("                        <div style=\"font-size:12px;color:#dfdfdf;\">获取验证码：</div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"text\" name=\"bindphoneyzm\" id=\"bindphoneyzm\"\r\n");
      out.write("                                   style=\"width:40%;border:none;text-align:center;height:24px;border-radius:6px;font-size:12px;\"\r\n");
      out.write("                                   placeholder=\"验证码\"/>\r\n");
      out.write("                            <input id=\"yzmBtn\" type=\"button\"\r\n");
      out.write("                                   style=\"border: none; display:block;width:55%;background-color:#c6ff00;color:#666;font-size:12px;border-radius:6px;position:absolute;left:45%;top:20px;height:24px;line-height:24px;text-align:center;\"\r\n");
      out.write("                                   value=\"获取验证码\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"margin-top:20px;\">\r\n");
      out.write("                        <span style=\"display:block;width:55%;background-color:#c6ff00;color:#666;font-size:12px;border-radius:6px;height:24px;line-height:24px;text-align:center;margin:0 auto;\"\r\n");
      out.write("                              id=\"bindbtn\">绑定手机号</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        var wait = 60;\r\n");
      out.write("        function countdown(obj, msg) {\r\n");
      out.write("            obj = $(obj);\r\n");
      out.write("\r\n");
      out.write("            if (wait == 0) {\r\n");
      out.write("                obj.removeAttr(\"disabled\");\r\n");
      out.write("                obj.val(msg);\r\n");
      out.write("                wait = 60;\r\n");
      out.write("            } else {\r\n");
      out.write("                if (msg == undefined || msg == null) {\r\n");
      out.write("                    msg = obj.val();\r\n");
      out.write("                }\r\n");
      out.write("                obj.attr(\"disabled\", \"disabled\");\r\n");
      out.write("                obj.val(wait + \"秒\");\r\n");
      out.write("                wait--;\r\n");
      out.write("                setTimeout(function () {\r\n");
      out.write("                    countdown(obj, msg)\r\n");
      out.write("                }, 1000)\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $(\"#yzmBtn\").bind('click', function () {\r\n");
      out.write("            var mobile_phone = $(\"#bindphone\").val();\r\n");
      out.write("            if (!/^1\\d{10}/.test(mobile_phone)) {\r\n");
      out.write("                alert(\"手机号格式不正确\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            var url = 'user.php?act=send_mobile_code';\r\n");
      out.write("            $.post(url, {\r\n");
      out.write("                mobile_phone: mobile_phone,\r\n");
      out.write("            }, function (result) {\r\n");
      out.write("                if (result == 'ok') {\r\n");
      out.write("                    // 倒计时\r\n");
      out.write("                    countdown($('#yzmBtn'));\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(result);\r\n");
      out.write("                }\r\n");
      out.write("            }, 'text');\r\n");
      out.write("\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        function bindPhone() {\r\n");
      out.write("            var time = new Date().getTime();\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: 'user.php?act=ajax_check_bind',\r\n");
      out.write("                data: {\r\n");
      out.write("                    time: time\r\n");
      out.write("                },\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                dataType: 'JSON',\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    console.log(data);\r\n");
      out.write("                    if (data.status) {\r\n");
      out.write("                        location.href = \"user.php?act=birthday_reminder\";\r\n");
      out.write("                        return false;\r\n");
      out.write("                    } else {\r\n");
      out.write("                        //位置定位\r\n");
      out.write("                        $(\"#bindPhone\").css({\r\n");
      out.write("                            top: parseInt(($(window).height() - 300) / 2) + \"px\",\r\n");
      out.write("                            left: parseInt(($(window).width() - 280) / 2) + \"px\",\r\n");
      out.write("                        });\r\n");
      out.write("                        $(\"#bindPhone\").fadeIn(200);\r\n");
      out.write("                        $(\"#bindPhonebg\").fadeIn(200);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        (function (e) {\r\n");
      out.write("            var iscomplete = true;\r\n");
      out.write("            var sliderIsOpen = false;\r\n");
      out.write("            var startPosX = 0, movePosX = 0;\r\n");
      out.write("            $(\"#close_bindPhone\").bind(\"click\", function () {\r\n");
      out.write("                $(\"#bindPhone\").fadeOut(100);\r\n");
      out.write("                $(\"#bindPhonebg\").fadeOut(100);\r\n");
      out.write("                $(\"#bindslider\").css({left: \"1px\"});\r\n");
      out.write("                $(\"#sliderBox\").find(\"span\").html(\"拖动滑块验证\");\r\n");
      out.write("                $(\"#bindslider\").html(\">\");\r\n");
      out.write("                $(\"#yzmBox\").hide();\r\n");
      out.write("                iscomplete = true;\r\n");
      out.write("            })\r\n");
      out.write("            $(\"#bindslider\").bind(\"touchstart\", function () {\r\n");
      out.write("                if (iscomplete) {\r\n");
      out.write("                    sliderIsOpen = true;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("            $(\"#eventBox\").bind(\"touchend\", function () {\r\n");
      out.write("                if (sliderIsOpen) {\r\n");
      out.write("                    var length = movePosX - startPosX;\r\n");
      out.write("                    if (length < ($(\"#sliderBox\").width() - $(\"#bindslider\").width() - 3)) {\r\n");
      out.write("                        $(\"#bindslider\").css({left: \"1px\"});\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                sliderIsOpen = false;\r\n");
      out.write("            })\r\n");
      out.write("            $(\"#eventBox\").bind(\"touchstart\", function () {\r\n");
      out.write("                var event = window.event;\r\n");
      out.write("                startPosX = event.touches[0].pageX;\r\n");
      out.write("            })\r\n");
      out.write("            $(\"#eventBox\").bind(\"touchmove\", function () {\r\n");
      out.write("                var event = window.event;\r\n");
      out.write("                event.preventDefault();\r\n");
      out.write("                movePosX = event.touches[0].pageX;\r\n");
      out.write("                if (sliderIsOpen) {\r\n");
      out.write("                    var length = movePosX - startPosX;\r\n");
      out.write("                    if (length > 0) {\r\n");
      out.write("                        if (length < ($(\"#sliderBox\").width() - $(\"#bindslider\").width() - 3)) {\r\n");
      out.write("                            $(\"#bindslider\").css({left: (1 + length) + \"px\"});\r\n");
      out.write("                        } else if (length >= ($(\"#sliderBox\").width() - $(\"#bindslider\").width() - 3)) {\r\n");
      out.write("                            $(\"#bindslider\").css({left: ($(\"#sliderBox\").width() - $(\"#bindslider\").width() - 2) + \"px\"});\r\n");
      out.write("                            $(\"#sliderBox\").find(\"span\").html(\"验证成功\");\r\n");
      out.write("                            $(\"#bindslider\").html(\"√\");\r\n");
      out.write("                            $(\"#bindtitle\").css(\"padding-top\", \"10px\");\r\n");
      out.write("                            $(\"#yzmBox\").show();\r\n");
      out.write("                            iscomplete = false;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("            $(\"#bindbtn\").bind(\"click\", function () {\r\n");
      out.write("                var event = window.event;\r\n");
      out.write("                event.preventDefault();\r\n");
      out.write("                // $(this).css({backgroundColor:\"#5F7B00\",color:\"#333\"});\r\n");
      out.write("                var mobile_phone = $(\"#bindphone\").val();\r\n");
      out.write("                var mobile_code = $(\"#bindphoneyzm\").val();\r\n");
      out.write("                if (!/^1\\d{10}/.test(mobile_phone)) {\r\n");
      out.write("                    alert(\"手机号格式不正确\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if (mobile_code.length == 0) {\r\n");
      out.write("                    alert(\"验证码不能为空\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                var url = 'user.php?act=ajax_bing_phone';\r\n");
      out.write("                $.post(url, {\r\n");
      out.write("                    mobile_phone: mobile_phone,\r\n");
      out.write("                    mobile_code: mobile_code\r\n");
      out.write("                }, function (data) {\r\n");
      out.write("                    if (data.status) {\r\n");
      out.write("                        alert(data.info);\r\n");
      out.write("                        location.href = \"user.php?act=birthday_reminder\";\r\n");
      out.write("                        return false;\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(data.info);\r\n");
      out.write("                    }\r\n");
      out.write("                }, 'JSON');\r\n");
      out.write("            })\r\n");
      out.write("            // $(\"#bindbtn\").bind(\"touchend\",function(){\r\n");
      out.write("            // \t$(this).css({backgroundColor:\"#c6ff00\",color:\"#666\"});\r\n");
      out.write("            // })\r\n");
      out.write("            $(\"input[name='bindphone']\").bind(\"blur\", function () {\r\n");
      out.write("                if (!$(this).val().match(/^1[3|4|5|7|8][0-9]{9}$/g) || $(this).val() == \"\") {\r\n");
      out.write("                    alert(\"请输入正确的手机号码！\")\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        })();\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <div class=\"footertext\"><img src=\"/static/image/dianhua.png\" width=\"24px\" height=\"24px\"><a\r\n");
      out.write("                href=\"tel:4006585776\">400 800 110</a></div>\r\n");
      out.write("        <div class=\"links\" id=\"ECS_MEMBERZONE\">\r\n");
      out.write("            <a href=\"user.php\">\r\n");
      out.write("                <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.CLIENT_IN_SESSION.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                </span></a>\r\n");
      out.write("            <a href=\"http://www.dijoncake.com/mobile/article.php?id=119\" style=\"color:#132545;\">关于我们</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"mf_o4\">&copy; 2017/9/3 - 2017/9/8 心点芯蛋糕 版权所有，并保留所有权利</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        var _hmt = _hmt || [];\r\n");
      out.write("        (function () {\r\n");
      out.write("            var hm = document.createElement(\"script\");\r\n");
      out.write("            hm.src = \"//hm.baidu.com/hm.js?389ca79cd8d5a1e62eb22a02b68fbfa7\";\r\n");
      out.write("            var s = document.getElementsByTagName(\"script\")[0];\r\n");
      out.write("            s.parentNode.insertBefore(hm, s);\r\n");
      out.write("        })();\r\n");
      out.write("    </script>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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