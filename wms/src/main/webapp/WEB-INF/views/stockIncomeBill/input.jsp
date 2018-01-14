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
            //日期处理
            $("input[name=vdate]").addClass("Wdate").click(function(){
                WdatePicker({
                    maxDate:new Date()
                });

            });

            //统一时间绑定
            $("#edit_table_body").on("click",".searchproduct",function () {
                var url="/product/selectProductList.do";
               var currentTr=$(this).closest("tr");//找到放大镜所在行
                $.dialog.open(url,{
                    id:'xxxx',
                    title:'选择货品列表',
                    width:900,
                    height:700,
                    close:function(){ //当对话框关闭时
                        var json=$.dialog.data("jsonString");
                        if(json){//把数据回显到当前行
                            currentTr.find("[tag=name]").val(json.name);
                            currentTr.find("[tag=pid]").val(json.id);
                            currentTr.find("[tag=costPrice]").val(json.costPrice);
                            currentTr.find("[tag=number]").val(json.number);
                            currentTr.find("[tag=remark]").val(json.remark);
                            currentTr.find("[tag=brand]").text(json.brandName);
                            currentTr.find("[tag=amount]").text(json.amount);
                        }
                    }
                });
            }).on("blur","[tag=costPrice],[tag=number]",function(){ //给采购价格和采购数量文本框绑定失去焦点事件，去计算金额小计
                var currentTr=$(this).closest("tr");//找到放大镜所在行
                var costPrice=parseFloat(currentTr.find("[tag=costPrice]").val()) || 0;
                var number=parseFloat(currentTr.find("[tag=number]").val()) || 0;
                var amount=(costPrice*number).toFixed(2);
                currentTr.find("[tag=amount]").text(amount);
            }).on("click",".removeItem",function(){ //删除当前行明细
                var currentTr=$(this).closest("tr");//找到放大镜所在行
                    if($("#edit_table_body tr").size()>1){
                        currentTr.remove(); //删除自己
                    }else{
                        //清空当前拷贝tr中的数据
                        currentTr.find("[tag=pid]").val("");
                        currentTr.find("[tag=name]").val("");
                        currentTr.find("[tag=costPrice]").val("");
                        currentTr.find("[tag=number]").val("");
                        currentTr.find("[tag=remark]").val("");
                        currentTr.find("[tag=brand]").text("");
                        currentTr.find("[tag=amount]").text("");
                    }
            });
            //添加明细操作
            $(".appendRow").click(function(){
                var copy=$("#edit_table_body tr:first").clone();
                copy.find("[tag=pid]").val("");
                copy.find("[tag=name]").val("");
                copy.find("[tag=costPrice]").val("");
                copy.find("[tag=number]").val("");
                copy.find("[tag=remark]").val("");
                copy.find("[tag=brand]").text("");
                copy.find("[tag=amount]").text("");
                copy.appendTo($("#edit_table_body"));
            });

            //在提交表单前，去计算明细的索引
            $("#editForm").submit(function(){
                $.each($("#edit_table_body tr"),function (index, item) {
                    $(item).find("[tag=pid]").prop("name","items["+index+"].product.id");
                    $(item).find("[tag=costPrice]").prop("name","items["+index+"].costPrice");
                    $(item).find("[tag=number]").prop("name","items["+index+"].number");
                    $(item).find("[tag=remark]").prop("name","items["+index+"].remark");
                });
            });

            $("#editForm").ajaxForm(function (data) {
                if(data.success){
                    $.dialog({
                        title: "温馨提示",
                        content: "操作成功",
                        icon: "face-smile",
                        ok: function(){
                            window.location.href="/stockIncomeBill/list.do";
                        }
                    });
                }
            });



        });

    </script>

</head>
<body>
<form name="editForm" action="/stockIncomeBill/saveOrUpdate.do" method="post" id="editForm">
    <input type="hidden" name="id" value="${stockIncomeBill.id}"/>
    <div id="container">
        <div id="nav_links">
            <span style="color: #1A5CC6;">采购入库单编辑</span>
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
                        <input name="sn" value="${stockIncomeBill.sn}" class="ui_input_txt02"/>
                    </td>
                </tr>

                <tr>

                    <td class="ui_text_rt" width="140">仓库</td>
                    <td class="ui_text_lt">
                        <select name="depot.id" class="ui_select03" id="depotSelect">
                            <c:forEach items="${depots}" var="s">
                                <option value="${s.id}">${s.name}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="ui_text_rt" width="140">业务时间</td>
                    <td class="ui_text_lt">
                        <input type="text" name="vdate" class="ui_input_txt02" value="<fmt:formatDate value="${stockIncomeBill.vdate}" pattern="yyyy-MM-dd"/>"/>
                    </td>
                </tr>
                <script type="text/javascript">
                    //选中仓库
                    $("#depotSelect option[value=${stockIncomeBill.depot.id}]").prop("selected",true);

                </script>

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
                              <c:if test="${empty stockIncomeBill}">
                            <tr>
                                <td></td>
                                <td>
                                    <input disabled="true" readonly="true" class="ui_input_txt02" tag="name" />
                                    <img src="/images/common/search.png" class="searchproduct"/>
                                    <input type="hidden" name="items[0].product.id" tag="pid" />
                                </td>
                                <td><span tag="brand">${product.brandName}</span></td>
                                <td><input tag="costPrice" name="items[0].costPrice"
                                           class="ui_input_txt01"/></td>
                                <td><input tag="number" name="items[0].number"
                                           class="ui_input_txt01"/></td>
                                <td><span tag="amount">${item.amount}</span></td>
                                <td><input tag="remark" name="items[0].remark"
                                           class="ui_input_txt02"/></td>
                                <td>
                                    <a href="javascript:;" class="removeItem">删除明细</a>
                                </td>
                            </tr>
                              </c:if>
                              <%--更改--%>
                            <c:if test="${not empty stockIncomeBill}">
                                <c:forEach items="${stockIncomeBill.items}" var="item">
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
                        &nbsp;<input type="submit" value="确定保存" class="ui_input_btn01"/>
                        &nbsp;<input id="cancelbutton" type="button" value="重置" class="ui_input_btn01"/>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    </form>
</body>
</html>