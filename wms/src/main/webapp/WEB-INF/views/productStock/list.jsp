<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="/style/basic_layout.css" rel="stylesheet" type="text/css">
    <link href="/style/common_style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/js/jquery/jquery.js"></script>
    <script type="text/javascript" src="/js/plugins/artDialog/jquery.artDialog.js?skin=blue"></script>
    <script type="text/javascript" src="/js/plugins/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="/js/commonAll.js"></script>
    <title>WMS-账户管理</title>
    <style>
        .alt td{ background:black !important;}
    </style>
    <%--新增操作--%>
    <script type="text/javascript">

    </script>
</head>
<body>
<form id="searchForm" action="/productStock/list.do" method="post">
    <div id="container">
        <div class="ui_content">
            <div class="ui_text_indent">
                <div id="box_border">
                    <div id="box_top">搜索</div>
                    货品名称或编号
                    <input type="text" class="ui_input_txt02" name="keyword" value="${qo.keyword}"/>
                    所在仓库
                    <select id="depotSelect" class="ui_select01" name="depotId" value="${qo.depotId}">
                        <option value="-1">所有仓库</option>
                        <c:forEach items="${depots}" var="d">
                            <option value="${d.id}">${d.name}</option>
                        </c:forEach>
                    </select>
                    货品品牌
                    <select id="brandSelect" class="ui_select01" name="brandId">
                        <option value="-1">所有品牌</option>
                        <c:forEach items="${brands}" var="b">
                            <option value="${b.id}">${b.name}</option>
                        </c:forEach>
                    </select>
                    <script type="text/javascript">
                        //选中供应商
                        $("#depotSelect option[value=${qo.depotId}]").prop("selected", true);
                        //选中状态
                        $("#brandSelect option[value=${qo.brandId}]").prop("selected", true);
                    </script>
                    库存阈值<input type="text" class="ui_input_txt02" name="limitNumber" value="${qo.limitNumber}"/>
                    <input type="submit" value="查询" class="ui_input_btn01"/>
                </div>
            </div>
        </div>
        <div class="ui_content">
            <div class="ui_tb">
                <table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
                    <tr>
                        <th width="30"><input type="checkbox" id="all" /></th>
                        <th>仓库</th>
                        <th>货品编码</th>
                        <th>货品名称</th>
                        <th>品牌</th>
                        <th>库存数量</th>
                        <th>库存价格</th>
                        <th>库存总额</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${result.listData}" var="item">
                    <tr>
                        <td><input type="checkbox" name="IDCheck" class="acb" /></td>
                        <td>${item.depot.name}</td>
                        <td>${item.product.sn}</td>
                        <td>${item.product.name}</td>
                        <td>${item.product.brandName}</td>
                        <td>${item.storeNumber}</td>
                        <td>${item.price}</td>
                        <td>${item.amount}</td>
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
