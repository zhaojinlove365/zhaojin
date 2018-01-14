
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $(function () {
        //翻页
        $(".btn_page").click(function () {
            var pageNum = $(this).data("page") || $("input[name=currentPage]").val(); //得到跳转页面
            $("input[name=currentPage]").val(pageNum);//把跳转的页码设置到currentPage文本框中
            $("#searchForm").submit();//提交高级查询表单
        });
        //pageSize的onChange事件
        $(":input[name=pageSize]").change(function () {
            $("input[name=currentPage]").val(1);
            $("#searchForm").submit(); //提交高级查询表单
        });

        //选中选中的pageSize选项
        $(":input[name=pageSize] option[value='${result.pageSize}']").prop("selected", true);

        //跳到input页面
        $(".btn_redirect").click(function () {
            window.location.href = $(this).data("url");
        });
    })
</script>
<div class="ui_tb_h30">
    <div class="ui_flt" style="height: 30px; line-height: 30px;">
        共有
        <span class="ui_txt_bold04">${result.totalCount}</span>
        条记录，当前第
        <span class="ui_txt_bold04">${result.currentPage}/${result.totalPage}</span>
        页
    </div>
    <div class="ui_frt">
        <input type="button" value="首页" class="ui_input_btn01 btn_page" data-page="1"/>
        <input type="button" value="上一页" class="ui_input_btn01 btn_page" data-page="${result.prePage}"/>
        <input type="button" value="下一页" class="ui_input_btn01 btn_page" data-page="${result.nextPage}"/>
        <input type="button" value="尾页" class="ui_input_btn01 btn_page" data-page="${result.totalPage}"/>

        <select list="{10,20,50}" name="pageSize" value="${result.pageSize}" class="ui_select02">
            <option value="5">5</option>
            <option value="10">10</option>
            <option value="20">20</option>
            <option value="30">30</option>
        </select>
        转到第<input type="text" name="currentPage" value="${result.currentPage}" class="ui_input_txt01" />页
        <input type="submit" class="ui_input_btn01" value="跳转"/>
    </div>
</div>
