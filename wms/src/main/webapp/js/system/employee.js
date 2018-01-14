$(function(){
   $("#editForm").validate({
        rules:{
            name:{
                required:true,
                minlength:4
            },
            password:{
                required:true,
                minlength:4
            },
            repassword:{
                equalTo:"#password"
            },
            email:{
                required:true,
                email:true
            },
            age:{
                range:[18,70]
            }
        },
       messages:{
           name:{
               required:"名字不能为空",
               minlength:"名字不能少于4位"
           },
           password:{
               required:"密码不能为空",
               minlength:"密码长度不能少于4位"
           },
           repassword:{
               equalTo:"两次密码不一致"
           },
           email:{
               required:"邮箱不能为空",
               email:"邮箱格式不正确"
           },
           age:{
               range:"年龄必须在{0}到{1}之间"
           }
       }
   });

    $("#selectAll").click(function(){
        $(".all_roles option").appendTo($(".select_roles"));
    })

    $("#deselectAll").click(function(){
        $(".select_roles option").appendTo($(".all_roles"));
    })

    $("#select").click(function(){
        $(".all_roles option:selected").appendTo($(".select_roles"));
    })

    $("#deselect").click(function(){
        $(".select_roles option:selected").appendTo($(".all_roles"));
    })

    $("#editForm").submit(function(){
        //发送表单前 选中已选权限选项
        $(".select_roles option").prop("selected",true);
    })

    //从左边菜单删除已经分配的权限选项
    var ids=[]; //已经分配权限的id
    $.each($(".select_roles option"),function(index,item){
        ids[index]=item.value;
    });

    //迭代所有权限的选项
    $.each($(".all_roles option"),function(index,item){
        //判断该权限的id是否在ids数组中
        if($.inArray(item.value,ids)>=0){
            $(item).remove(); //删除自己
        }
    });




});