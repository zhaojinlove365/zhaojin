<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="/style/basic_layout.css" rel="stylesheet" type="text/css">
<link href="/style/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/js/jquery/jquery.js"></script>
<script type="text/javascript" src="/js/plugins/form/jquery.form.min.js"></script>
<script type="text/javascript" src="/js/plugins/artDialog/jquery.artDialog.js?skin=blue"></script>
	<script type="text/javascript" src="/js/plugins/fancyBox/jquery.fancybox.pack.js"></script>
	<script type="text/javascript" src="/js/commonAll.js"></script>
</head>
<body>
<form namespace="/" action="/product/saveOrUpdate.do" method="post" id="editForm" enctype="multipart/form-data" theme="simple">
	<div id="container">
	<input type="hidden" name="id" value="${product.id}"/>
		<div id="nav_links">
			<span style="color: #1A5CC6;">商品编辑</span>
			<div id="page_close">
				<a>
					<img src="/images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="140">货品编码</td>
					<td class="ui_text_lt">
						<input name="sn"  class="ui_input_txt02" value="${product.sn}"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="140">货品名称</td>
					<td class="ui_text_lt">
						<input name="name"  class="ui_input_txt02" value="${product.name}"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="140">成本价格</td>
					<td class="ui_text_lt">
						<input name="costPrice" class="ui_input_txt02" value="${product.costPrice}"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="140">销售价格</td>
					<td class="ui_text_lt">
						<input name="salePrice" class="ui_input_txt02" value="${product.salePrice}"/>
					</td>
				</tr>
				<%--货品品牌--%>
				<tr>
					<td class="ui_text_rt" width="140">货品品牌</td>
					<td class="ui_text_lt">
						<select id="brandId" name="brandId" class="ui_select01">
							<option value="-1">所有品牌</option>
							<c:forEach items="${brands}" var="b">
								<option value=${b.id}>${b.name}</option>
							</c:forEach>
						</select>
						<script type="text/javascript">
							$(function () {
								$("#brandId option[value=${product.brandId}]").prop("selected",true);
							});
						</script>
					</td>
				</tr>

				<tr>
					<td class="ui_text_rt" width="140">货品图片</td>
					<td class="ui_text_lt">
						<input type="file" name="pic" class="ui_file"/>
						<c:if test="${not empty product.imagePath}">
							<img src="${product.smallImagePath}" class="list_img">
							<input type="hidden" name="imagePath" value="${product.imagePath}">
						</c:if>
					</td>
				</tr>

				<tr>
					<td class="ui_text_rt" width="140">货品简介</td>
					<td class="ui_text_lt">
						<textarea name="intro" class="ui_input_txtarea">${product.intro}</textarea>
					</td>
				</tr>

				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input type="submit" value="确定编辑" class="ui_input_btn01 btn_submit"/>
						&nbsp;<input id="cancelbutton" type="button" value="重置" class="ui_input_btn01"/>
					</td>
				</tr>
				<script type="text/javascript">
					$(function(){
						$("#editForm").ajaxForm(function(data){
							if(data.success){
								$.dialog({
									title: "温馨提示",
									content:"操作成功",
									icon: "face-smile",
									ok:function(){
										window.location.href = "/product/list.do";
									}
								});

							}
						})
					})

				</script>
			</table>
		</div>
	</div>
</form>
</body>
</html>