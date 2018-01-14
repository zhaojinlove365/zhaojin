<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="/style/basic_layout.css" rel="stylesheet" type="text/css">
    <link href="/style/common_style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/js/jquery/jquery.js"></script>
    <script type="text/javascript" src="/js/commonAll.js"></script>
    <title>PSS-账户管理</title>
    <style>
        .alt td{ background:black !important;}
    </style>
</head>
<body>
<form id="searchForm" action="/department/list.do" method="post">
    <div id="container">
        <div class="ui_content">
            <div class="ui_text_indent">
                <div id="box_border">
                    <div id="box_top">搜索</div>
                    <div id="box_bottom">
                        <input type="button" value="新增" class="ui_input_btn01 btn_redirect" data-url="/department/input.do"/>
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
                        <th>部门</th>
                        <th>编码</th>
                        <th>操作</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${departments}" var="item">
                    <tr>
                        <td><input type="checkbox" name="IDCheck" class="acb" /></td>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.sn}</td>
                        <td>
                            <a href="/department/input.do?id=${item.id}">编辑</a>
                            <a href="/department/delete.do?id=${item.id}">删除</a>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <script type="text/javascript">
            $(function(){
                $(".btn_redirect").click(function(){
                    window.location.href=$(this).data("url");
                });
            })
            </script>
        </div>
    </div>
</form>
</body>
</html>
