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
<form id="searchForm" action="/stockIncomeBill/list.do" method="post">
    <div id="container">
        <div class="ui_content">
            <div class="ui_text_indent">
                <div id="box_border">
                    <div id="box_top">搜索</div>
                    业务时间
                    <input type="text" class="ui_input_txt02" name="beginDate" value="<fmt:formatDate value="${qo.beginDate}" pattern="yyyy-MM-dd"/>"/>~
                    <input type="text" class="ui_input_txt02" name="endDate" value="<fmt:formatDate value="${qo.endDate}" pattern="yyyy-MM-dd"/>"/>
                    仓库
                    <select id="depotSelect" class="ui_select01" name="depotId" value="${qo.depotId}">
                        <option value="-1">所有仓库</option>
                        <c:forEach items="${depots}" var="s">
                            <option value="${s.id}">${s.name}</option>
                        </c:forEach>
                    </select>
                    审核状态
                    <select id="statusSelect" class="ui_select01" name="status">
                        <option value="-1">所有状态</option>
                        <option value="0">待审核</option>
                        <option value="1">已审核</option>
                    </select>
                    <script type="text/javascript">
                        //选中供应商
                        $("#depotSelect option[value=${qo.depotId}]").prop("selected", true);
                        //选中状态
                        $("#statusSelect option[value=${qo.status}]").prop("selected", true);

                    </script>
                    <input type="submit" value="查询" class="ui_input_btn01"/>
                    <div id="box_bottom">
                        <input type="button" value="新增" class="ui_input_btn01 btn_redirect" data-url="/stockIncomeBill/input.do"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="ui_content">
            <div class="ui_tb">
                <table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
                    <tr>
                        <th width="30"><input type="checkbox" id="all" /></th>
                        <th>订单编号</th>
                        <th>业务时间</th>
                        <th>仓库</th>
                        <th>总金额</th>
                        <th>总数量</th>
                        <th>录入人</th>
                        <th>审核人</th>
                        <th>状态</th>
                        <th>操作</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${result.listData}" var="item">
                    <tr>
                        <td><input type="checkbox" name="IDCheck" class="acb" /></td>
                        <td>${item.sn}</td>
                        <td><fmt:formatDate value="${item.vdate}" pattern="yyyy-MM-dd"/></td>
                        <td>${item.depot.name}</td>
                        <td>${item.totalAmount}</td>
                        <td>${item.totalNumber}</td>
                        <td>${item.inputUser.name}</td>
                        <td>${item.auditor.name}</td>
                        <td>
                             <span style='color:${item.status==0 ? "green":"red"}'>
                                     ${item.displayStatus}
                             </span>
                        </td>
                        <c:if test="${item.status==0}">
                        <td>
                            <a href="/stockIncomeBill/input.do?id=${item.id}&depotId=${depot.id}">编辑</a>
                            <a href="javascript:;" data-url="/stockIncomeBill/delete.do?id=${item.id}" class="btn_delete">删除</a>
                            <a href="javascript:;" data-url="/stockIncomeBill/audit.do?id=${item.id}" class="btn_audit">审核</a>
                        </td>
                        </c:if>
                        <td>
                        <c:if test="${item.status==1}">
                            <a href="/stockIncomeBill/view.do?id=${item.id}">查看</a>
                        </c:if>
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
