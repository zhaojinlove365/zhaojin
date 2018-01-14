<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <script type="text/javascript" src="/js/commonAll.js"></script>
	<script type="text/javascript">
		$(function(){
			//===========================分配权限==========================================
			$("#selectAll").click(function(){
				$(".all_permissions option").appendTo($(".select_permissions"));
			})

			$("#deselectAll").click(function(){
				$(".select_permissions option").appendTo($(".all_permissions"));
			})

			$("#select").click(function(){
				$(".all_permissions option:selected").appendTo($(".select_permissions"));
			})

			$("#deselect").click(function(){
				$(".select_permissions option:selected").appendTo($(".all_permissions"));
			})

			$("#editForm").submit(function(){
				//发送表单前 选中已选权限选项
				$(".select_permissions option").prop("selected",true);
			})

			//从左边库删除已经分配的权限选项
			var ids=[]; //已经分配权限的id
			$.each($(".select_permissions option"),function(index,item){
				ids[index]=item.value;
			});

			//迭代所有权限的选项
			$.each($(".all_permissions option"),function(index,item){
				//判断该权限的id是否在ids数组中
				if($.inArray(item.value,ids)>=0){
					$(item).remove(); //删除自己
				}
			});


			//===========================分配菜单==========================================
			$("#mselectAll").click(function(){
				$(".all_menus option").appendTo($(".select_menus"));
			})

			$("#mdeselectAll").click(function(){
				$(".select_menus option").appendTo($(".all_menus"));
			})

			$("#mselect").click(function(){
				$(".all_menus option:selected").appendTo($(".select_menus"));
			})

			$("#mdeselect").click(function(){
				$(".select_menus option:selected").appendTo($(".all_menus"));
			})

           $("#editForm").submit(function(){
               //发送表单前 选中已选权限选项
               $(".select_menus option").prop("selected",true);
           })

			//从左边库删除已经分配的权限选项
			var ids=[]; //已经分配权限的id
			$.each($(".select_menus option"),function(index,item){
				ids[index]=item.value;
			});

			//迭代所有权限的选项
			$.each($(".all_menus option"),function(index,item){
				//判断该权限的id是否在ids数组中
				if($.inArray(item.value,ids)>=0){
					$(item).remove(); //删除自己
				}
			});

		});

	</script>
</head>
<body>
<form namespace="/" action="/role/saveOrUpdate.do" method="post" id="editForm" theme="simple">
	<div id="container">
	<input type="hidden" name="id" value="${role.id}"/>
		<div id="nav_links">
			<span style="color: #1A5CC6;">角色编辑</span>
			<div id="page_close">
				<a>
					<img src="/images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="140">名称</td>
					<td class="ui_text_lt">
						<input name="name"  class="ui_input_txt02" value="${role.name}"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="140">编码</td>
					<td class="ui_text_lt">
						<input name="sn" class="ui_input_txt02" value="${role.sn}"/>
					</td>
				</tr>

				<%--分配权限--%>
				<tr>
					<td class="ui_text_rt" width="140">分配权限</td>
					<td class="ui_text_lt">
						<table>
							<tr>
								<td>
									<select multiple="true" class="ui_multiselect01 all_permissions">
										<c:forEach items="${permissions}" var="p">
											<option value="${p.id}">${p.name}</option>
										</c:forEach>

									</select>

								</td>
								<td align="center">
									<input type="button" id="select" value="-->" class="left2right"/><br/>
									<input type="button" id="selectAll" value="==>" class="left2right"/><br/>
									<input type="button" id="deselect" value="<--" class="left2right"/><br/>
									<input type="button" id="deselectAll" value="<==" class="left2right"/>
								</td>
								<td>
									<select multiple="true" class="ui_multiselect01 select_permissions" name="permissionIds">
										<c:forEach items="${role.permissions}" var="p">
											<option value="${p.id}">${p.name}</option>
										</c:forEach>
									</select>
								</td>
							</tr>
						</table>
					</td>
				</tr>



				<tr>
                    <td class="ui_text_rt" width="140">分配菜单</td>
                    <td class="ui_text_lt">
                        <table>
                            <tr>
                                <td>
									<select multiple="true" class="ui_multiselect01 all_menus">
										<c:forEach items="${menus}" var="m">
											<option value="${m.id}">${m.name}</option>
										</c:forEach>

									</select>

                                </td>
                                <td align="center">
                                    <input type="button" id="mselect" value="-->" class="left2right"/><br/>
                                    <input type="button" id="mselectAll" value="==>" class="left2right"/><br/>
                                    <input type="button" id="mdeselect" value="<--" class="left2right"/><br/>
                                    <input type="button" id="mdeselectAll" value="<==" class="left2right"/>
                                </td>
                                <td>
									<select multiple="true" class="ui_multiselect01 select_menus" name="menuIds">
										<c:forEach items="${role.menus}" var="m">
											<option value="${m.id}">${m.name}</option>
										</c:forEach>
									</select>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>

				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input type="submit" value="确定编辑" class="ui_input_btn01 btn_submit"/>
						&nbsp;<input id="cancelbutton" type="button" value="重置" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>
</body>
</html>