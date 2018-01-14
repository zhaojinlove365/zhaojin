<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="/style/basic_layout.css" rel="stylesheet" type="text/css">
    <link href="/style/common_style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/js/jquery/jquery.js"></script>
    <script type="text/javascript" src="/js/plugins/artDialog/jquery.artDialog.js?skin=blue"></script>
    <script type="text/javascript" src="/js/commonAll.js"></script>
    <title>PSS-账户管理</title>
    <style>
        .alt td{ background:black !important;}
    </style>
    <script type="text/javascript">
        $(function(){

            //删除操作
            $(".btn_redirect").click(function(){
                window.location.href=$(this).data("url");
            });

            //加载权限操作
            $(".btn_reload").click(function(){
                var deleteUrl = $(this).data("url");
                $.dialog({
                    title: "温馨提示",
                    content: "亲,重新加载权限可能耗费较长时间，您确定要加载吗?",
                    icon: "face-smile",
                    cancel: true,
                    ok: function () {

                        var dg = $.dialog({
                            title: "温馨提示",
                            icon: "face-smile"
                        });

                        //发送Ajax请求
                        $.get(deleteUrl, {}, function (data) {
                            if (data.success) {
                                dg.content("权限加载成功!").button({
                                    name: "本王知道了",
                                    callback: function () {
                                        window.location.reload();
                                    }
                                });
                            }
                        }, "json");
                    }

                });
            })

        })
    </script>
</head>
<body>
<form id="searchForm" action="/permission/list.do" method="post">
    <div id="container">
        <div class="ui_content">
            <div class="ui_text_indent">
                <div id="box_border">
                    <div id="box_top">搜索</div>
                    <div id="box_bottom">
                        <input type="button" value="加载权限" class="ui_input_btn01 btn_reload" data-url="/permission/reload.do"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="ui_content">
            <div class="ui_tb">
                <table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
                    <tr>
                        <th width="30"><input type="checkbox" id="all" /></th>
                        <th>ID</th>
                        <th>权限名称</th>
                        <th>权限表达式</th>
                        <th>操作</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${result.listData}" var="item">
                    <tr>
                        <td><input type="checkbox" name="IDCheck" class="acb" /></td>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.expression}</td>
                        <td>
                            <a href="/permission/delete.do?id=${item.id}">删除</a>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <%--包含分页条--%>
        <%@include file="/WEB-INF/views/commons/common_page.jsp" %>
    </div>
</form>
</body>
</html>
