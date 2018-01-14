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
        $(function(){
            //日期处理
            $("input[name=beginDate],input[name=endDate]").addClass("Wdate").click(function(){
                WdatePicker();
            });
            $(".btn_redirect").click(function(){
                window.location.href=$(this).data("url");
            });
        });
    </script>
</head>
<body>
<form id="searchForm" action="/chart/order.do" method="post">
    <div id="container">
        <div class="ui_content">
            <div class="ui_text_indent">
                <div id="box_border">
                    <div id="box_top">搜索</div>
                    业务时间
                    <input type="text" class="ui_input_txt02" name="beginDate" value="<fmt:formatDate value="${qo.beginDate}" pattern="yyyy-MM-dd"/>"/>~
                    <input type="text" class="ui_input_txt02" name="endDate" value="<fmt:formatDate value="${qo.endDate}" pattern="yyyy-MM-dd"/>"/>
                    货品<input type="text" class="ui_input_txt02" name="keyword" value="${qo.keyword}"/>
                    供应商
                    <select id="supplierSelect" class="ui_select01" name="supplierId" value="${qo.supplierId}">
                        <option value="-1">所有供应商</option>
                        <c:forEach items="${suppliers}" var="s">
                            <option value="${s.id}">${s.name}</option>
                        </c:forEach>
                    </select>
                    品牌
                    <select id="brandSelect" class="ui_select01" name="brandId" value="${qo.brandId}">
                        <option value="-1">所有品牌</option>
                        <c:forEach items="${brands}" var="b">
                            <option value="${b.id}">${b.name}</option>
                        </c:forEach>
                    </select>
                    分组
                    <select id="groupSelect" class="ui_select01" name="groupBy">
                        <c:forEach items="${groupByMap}" var="entry">
                            <option value="${entry.key}">${entry.value}</option>
                        </c:forEach>
                    </select>

                    <script type="text/javascript">
                        //选中供应商
                        $("#supplierSelect option[value=${qo.supplierId}]").prop("selected", true);
                        //选中状态
                        $("#brandSelect option[value=${qo.brandId}]").prop("selected", true);
                        $("#groupSelect option[value='${qo.groupBy}']").prop("selected", true);

                    </script>
                    <input type="submit" value="查询" class="ui_input_btn01"/>
                </div>
            </div>
        </div>
        <div class="ui_content">
            <div class="ui_tb">
                <table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
                    <tr>
                        <th>分组类型</th>
                        <th>采购总数量</th>
                        <th>采购总金额</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${result}" var="item"><%--遍历sql中别名--%>
                    <tr>
                        <td>${item.groupType}</td>
                        <td>${item.totalNumber}</td>
                        <td>${item.totalAmount}</td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

        </div>
    </div>
</form>
</body>
</html>
