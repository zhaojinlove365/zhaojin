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
    <script type="text/javascript" src="/js/plugins/fancyBox/jquery.fancybox.pack.js"></script>
    <link href="/js/plugins/fancyBox/jquery.fancybox.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/js/plugins/artDialog/iframeTools.js"></script>
    <title>PSS-账户管理</title>
    <style>
        .alt td{ background:black !important;}
    </style>
    <%--新增操作--%>
    <script type="text/javascript">
        $(function(){
            //<a href="${item.imagePath}" class="fancybox-effects-a">
            //图片弹出层
            $(".pic").fancybox();

           $(".btn_select").click(function(){
               var json=$(this).data("json");
                $.dialog.data("jsonString",json); //子窗口中jsonString传递给父窗口用data("jsonString")接收
               $.dialog.close();
           });
        });

    </script>
</head>
<body>
<form id="searchForm" action="/product/selectProductList.do" method="post">
    <div id="container">
        <div class="ui_content">
            <div class="ui_text_indent">
                <div id="box_border">
                    <div id="box_top">选择货品列表</div>
                    <div id="box_center">
                        关键字
                        <input type="text" class="ui_input_txt02" name="keyword" value="${qo.keyword}"/>
                        货品品牌
                        <select id="brandSelect" class="ui_select01" name="brandId" value="${qo.brandId}">
                            <option value="-1">所有品牌</option>
                            <c:forEach items="${brands}" var="b">
                                <option value="${b.id}">${b.name}</option>
                            </c:forEach>
                        </select>
                        <script type="text/javascript">
                            //选中品牌
                            $("#brandSelect option[value=${qo.brandId}]").prop("selected", true);
                        </script>
                    </div>
                    <div id="box_bottom">
                        <input type="submit" value="查询" class="ui_input_btn01"/>
                    </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="ui_content">
            <div class="ui_tb">
                <table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
                    <tr>
                        <th width="30"><input type="checkbox" id="all" /></th>
                        <th>货品图片</th>
                        <th>货品名称</th>
                        <th>货品编号</th>
                        <th>货品品牌</th>
                        <th>成本价格</th>
                        <th>销售价格</th>
                        <th>操作</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${result.listData}" var="item">
                    <tr>
                        <td><input type="checkbox" name="IDCheck" class="acb" /></td>
                        <td>
                          <a href="${item.imagePath}" class="pic fancybox-effects-a"><img src="${item.smallImagePath}" class="list_img_min"></a>
                        </td>
                        <td>${item.name}</td>
                        <td>${item.sn}</td>
                        <td>${item.brandName}</td>
                        <td>${item.costPrice}</td>
                        <td>${item.salePrice}</td>
                        <td>
                            <input type="button" value="选择该货品" class="left2right btn_select" data-json='${item.jsonString}'/>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

            <%--包含分页条--%>
            <%@include file="/WEB-INF/views/commons/common_page.jsp" %>
        </div>
    </div>
</form>
</body>
</html>
