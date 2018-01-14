<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>WMS管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="/style/basic_layout.css" rel="stylesheet" type="text/css">
    <link href="/style/common_style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/js/jquery/jquery.js"></script>
    <script type="text/javascript" src="/js/plugins/form/jquery.form.min.js"></script>
    <script type="text/javascript" src="/js/plugins/validate/jquery.validate.min.js"></script>
    <script type="text/javascript" src="/js/plugins/artDialog/jquery.artDialog.js?skin=blue"></script>
    <script type="text/javascript" src="/js/plugins/artDialog/iframeTools.js"></script>
    <script type="text/javascript" src="/js/plugins/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="/js/commonAll.js"></script>
    <script type="text/javascript">
        $(function(){
            $(":input").prop("readonly",true);
            //日期处理
            $("input[name=vdate]").addClass("Wdate").click(function(){
                WdatePicker({
                    maxDate:new Date()
                });

            });

        });
    </script>
</head>
<body>
<form name="editForm" action="/orderBill/saveOrUpdate.do" method="post" id="editForm">
    <input type="hidden" name="id" value="${orderBill.id}"/>
    <div id="container">
        <div id="nav_links">
            <span style="color: #1A5CC6;">采购订单编辑</span>
            <div id="page_close">
                <a>
                    <img src="/images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
                </a>
            </div>
        </div>
        <div class="ui_content">
            <table cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
                <tr>
                    <td class="ui_text_rt" width="140">订单编号</td>
                    <td class="ui_text_lt">
                        <input name="name" value="${orderBill.sn}" class="ui_input_txt02"/>
                    </td>
                </tr>

                <tr>
                    <td class="ui_text_rt" width="140">供应商</td>
                    <td class="ui_text_lt">
                        <input name="supplier.id" value="${orderBill.supplier.name}" class="ui_input_txt02"/>
                    </td>
                </tr>
                <tr>
                    <td class="ui_text_rt" width="140">业务时间</td>
                    <td class="ui_text_lt">
                        <input name="client.id" value="<fmt:formatDate value="${orderBill.vdate}" pattern="yyyy-MM-dd"/>" class="ui_input_txt02"/>
                    </td>
                </tr>


                <tr>
                    <td class="ui_text_rt" width="140">单据明细</td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="button" value="添加明细" class="ui_input_btn01 appendRow"/>
                        <table class="edit_table" cellspacing="0" cellpadding="0" border="0" style="width: auto">
                            <thead>
                            <tr>
                                <th width="10"></th>
                                <th width="200">货品</th>
                                <th width="120">品牌</th>
                                <th width="80">价格</th>
                                <th width="80">数量</th>
                                <th width="80">金额小计</th>
                                <th width="150">备注</th>
                                <th width="70"></th>
                            </tr>
                            </thead>
                            <tbody id="edit_table_body">

                            <%--新增--%>
                            <c:if test="${empty orderBill}">
                                <tr>
                                    <td></td>
                                    <td>
                                        <input disabled="true" readonly="true" class="ui_input_txt02" tag="name"/>
                                        <img src="/images/common/search.png" class="searchproduct"/>
                                        <input type="hidden" name="orderBill.items[0].product.id" tag="pid" value="items.product.id"/>
                                    </td>
                                    <td><span tag="brand">${product.brandName}</span></td>
                                    <td><input tag="costPrice" name="orderBill[0].items.costPrice" value="items.costPrice"
                                               class="ui_input_txt01"/></td>
                                    <td><input tag="number" name="orderBill[0].items.number" value="items.number"
                                               class="ui_input_txt01"/></td>
                                    <td><span tag="amount">${item.amount}</span></td>
                                    <td><input tag="remark" name="orderBill[0].items.remark" value="items.remark"
                                               class="ui_input_txt02"/></td>
                                    <td>
                                        <a href="javascript:;" class="removeItem">删除明细</a>
                                    </td>
                                </tr>
                            </c:if>
                            <%--更改--%>
                            <c:if test="${not empty orderBill}">
                                <c:forEach items="${orderBill.items}" var="item">
                                    <tr>
                                        <td></td>
                                        <td>
                                            <input disabled="true" readonly="true" class="ui_input_txt02" tag="name" value="${item.product.name}"/>
                                            <img src="/images/common/search.png" class="searchproduct"/>
                                            <input type="hidden" name="items[0].product.id" tag="pid" value="${item.product.id}"/>
                                        </td>
                                        <td><span tag="brand">${item.product.brandName}</span></td>
                                        <td><input tag="costPrice" name="items[0].costPrice" value="${item.costPrice}"
                                                   class="ui_input_txt01"/></td>
                                        <td><input tag="number" name="items[0].number" value="${item.number}"
                                                   class="ui_input_txt01"/></td>
                                        <td><span tag="amount">${item.amount}</span></td>
                                        <td><input tag="remark" name="items[0].remark" value="${item.remark}"
                                                   class="ui_input_txt02"/></td>
                                        <td>
                                            <a href="javascript:;" class="removeItem">删除明细</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </c:if>

                            </tbody>
                        </table>
                    </td>
                </tr>

                <tr>
                    <td>&nbsp;</td>
                    <td class="ui_text_lt">
                        &nbsp;<input type="button" value="返回列表" onclick="window.history.back();" class="ui_input_btn01"/>

                    </td>
                </tr>
            </table>
        </div>
    </div>
    </form>
</body>
</html>