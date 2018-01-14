
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>柱状图</title>
    <script type="text/javascript" src="/js/jquery/jquery.js"></script>
    <script type="text/javascript" src="/js/plugins/echarts/echarts-all.js"></script>
    <script type="text/javascript">
        $(function(){
            var myChart = echarts.init(document.getElementById('main'));

            option = {
                title : {
                    text: '销售报表',
                    subtext: '${groupType}',
                    x:'center'

                },
                tooltip : {
                    trigger: 'axis'
                },
                legend: {
                    data:['销售总额'],
                    x:'left'
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType : {show: true, type: ['line', 'bar']},
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data : ${groupByList}
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'销售总额',
                        type:'bar',
                        data:${totalAmountList},
                        markPoint : {
                            data : [
                                {type : 'max', name: '最大值'},
                                {type : 'min', name: '最小值'}
                            ]
                        },
                        markLine : {
                            data : [
                                {type : 'average', name: '平均值'}
                            ]
                        }
                    }
                ]
            };


            // 为echarts对象加载数据
            myChart.setOption(option);
        });
    </script>
</head>
<body>
<div id="main" style="height:650px;width:820px;" ></div>

</body>
</html>
