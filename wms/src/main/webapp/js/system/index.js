//===============zTree菜单配置选项========================================================
var setting={
	data:{
		simpleData:{
			//启动简单json格式
			enable:true
		}
	},
	callback:{
		//节点单击事件
		onClick:function(event,treeId,treeNode){
			if(treeNode.action){
				$("#rightMain").prop("src",treeNode.action+".do");
				//设置菜单导航
				$("#here_area").html("当前位置:"+treeNode.getParentNode().name+"&nbsp;>&nbsp;"+treeNode.name);}}
	},
	//启动异步加载菜单树
	async: {
		enable: true,
		url:"/systemMenu/loadMenusByParentSn.do",
		autoParam:["sn=parentSn"]
	}
};

//要显示菜单的节点
var zNode1=[
	{id:1,pId:0,name:"业务模块",isParent:true,sn:"business"}];
var zNode2=[
	{id:2,pId:0,name:"系统模块",isParent:true,sn:"system"}];
var zNode3=[
	{id:3,pId:0,name:"报表模块",isParent:true,sn:"chart"}];

var zNodes={
	business:zNode1,
	system:zNode2,
	charts:zNode3
};

//加载菜单树
function loadMenus(sn){
	$.fn.zTree.init($("#dleft_tab1"), setting, zNodes[sn]);
};
//渲染菜单
$(function(){
	loadMenus("business");
});

//==============菜单面板切换=========================================================================
$(function(){
	$("#TabPage2 li").click(function(){
		//删除所有li样式 selected这是样式
		$.each($("#TabPage2 li"),function(index,item){
			$(item).removeClass("selected");
			$(item).children("img").prop("src","/images/common/"+(index+1)+".jpg");
		});

		//增加selected样式
		$(this).addClass("selected");

		//修改当前选中的图片
		var currentIndex=$(this).index();  //当前元素选择器中索引
		$(this).children("img").prop("src","/images/common/"+(currentIndex+1)+"_hover.jpg");

		//修改模块标题
		$("#nav_module").children("img").prop("src","/images/common/module_"+(currentIndex+1)+".png");

	//切换菜单面板，重新加载菜单对应节点
	loadMenus($(this).data("rootmenu"));
	});
});



//===============加载当前日期=================================================================
function loadDate(){
	var time = new Date();
	var myYear = time.getFullYear();
	var myMonth = time.getMonth() + 1;
	var myDay = time.getDate();
	if (myMonth < 10) {
		myMonth = "0" + myMonth;
	}
	document.getElementById("day_day").innerHTML = myYear + "." + myMonth + "."	+ myDay;
}

/**
 * 隐藏或者显示侧边栏
 * 
 **/
function switchSysBar(flag){
	var side = $('#side');
    var left_menu_cnt = $('#left_menu_cnt');
	if( flag==true ){	// flag==true
		left_menu_cnt.show(500, 'linear');
		side.css({width:'280px'});
		$('#top_nav').css({width:'77%', left:'304px'});
    	$('#main').css({left:'280px'});
	}else{
        if ( left_menu_cnt.is(":visible") ) {
			left_menu_cnt.hide(10, 'linear');
			side.css({width:'60px'});
        	$('#top_nav').css({width:'100%', left:'60px', 'padding-left':'28px'});
        	$('#main').css({left:'60px'});
        	$("#show_hide_btn").find('img').attr('src', 'images/common/nav_show.png');
        } else {
			left_menu_cnt.show(500, 'linear');
			side.css({width:'280px'});
			$('#top_nav').css({width:'77%', left:'304px', 'padding-left':'0px'});
        	$('#main').css({left:'280px'});
        	$("#show_hide_btn").find('img').attr('src', 'images/common/nav_hide.png');
        }
	}
}

$(function(){
	loadDate();
	
	// 显示隐藏侧边栏
	$("#show_hide_btn").click(function() {
        switchSysBar();
    });
});



/*下面是原生JS的电子时钟*/
var interval=setInterval(
	function(){
		var hEle=document.getElementById("h");
		var h=new Date().getHours();
		h=h<10? "0"+new Date().getHours() : new Date().getHours();
		hEle.innerHTML=h;
	}
	,0);

var interval=setInterval(
	function(){
		var mEle=document.getElementById("m");
		var m=new Date().getMinutes();
		m=m<10? "0"+new Date().getMinutes() : new Date().getMinutes();
		mEle.innerHTML=m;
	}
	,0);

var interval=setInterval(
	function(){
		var sEle=document.getElementById("s");
		var s=new Date().getSeconds();
		s=s<10? "0"+new Date().getSeconds() : new Date().getSeconds();
		sEle.innerHTML=s;
	},1000);
//===================================================================================