//禁用jQuery对数组参数做的序列化操作,对数组参数名带上[]
jQuery.ajaxSettings.traditional = true;
/** table鼠标悬停换色* */
$(function () {
    // 如果鼠标移到行上时，执行函数
    $(".table tr").mouseover(function () {
        $(this).css({
            background: "#CDDAEB"
        });
        $(this).children('td').each(function (index, ele) {
            $(ele).css({
                color: "#1D1E21"
            });
        });
    }).mouseout(function () {
        $(this).css({
            background: "#FFF"
        });
        $(this).children('td').each(function (index, ele) {
            $(ele).css({
                color: "#909090"
            });
        });
    });

    //删除操作
    $(".btn_delete").click(function () {
        var deleteUrl = $(this).data("url");
        $.dialog({
            title: "温馨提示",
            content: "你确定要删除吗?",
            icon: "face-smile",
            cancel: true,
            ok: function () {

                var dg = $.dialog({
                    title: "温馨提示",
                    icon: "face-smile"
                });

                //发送Ajax请求
                $.get(deleteUrl, {}, function (data) {
                    if (data.success) {
                        dg.content("删除成功!").button({
                            name: "本王知道了",
                            callback: function () {
                                window.location.reload();
                            }
                        });
                    }
                }, "json");
            }

        });
    });

    //审核操作
    $(".btn_audit").click(function () {
        var deleteUrl = $(this).data("url");
        $.dialog({
            title: "温馨提示",
            content:"你确定要审核吗?",
            icon: "face-smile",
            cancel: true,
            ok: function () {

                var dg = $.dialog({
                    title: "温馨提示",
                    icon: "face-smile"
                });

                //发送Ajax请求
                $.get(deleteUrl, function (data) {
                    if (data.success) {
                        dg.content("审核成功!").button({
                            name: "本王知道了",
                            callback: function () {
                                window.location.reload();
                            }
                        });
                    }else{
                        dg.content(data.msg).button({
                            name: "本王知道了",
                            callback: function () {
                                window.location.reload();
                            }
                        });
                    }
                }, "json");
            }

        });
    });


});
