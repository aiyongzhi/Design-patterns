<%--
  Created by IntelliJ IDEA.
  User: 11425
  Date: 2022/4/14
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery.min.js"></script>
    <title>Title</title>
    <style>
        table{
            border: 3px solid blue;
            width: 50%;
            margin: 0px auto;
        }
        td{
            border: 2px solid green;

        }
        div{
            font-size: 50px;
        }
        input{
            font-size: 20px;
        }
        select{
            margin-left: 180px;
        }
        option{
            text-align: center;
            font-size: 30px;
        }
    </style>
    <script>
        function getInfo(){
            return [$("#goodName").val(), $("#price").val(), $("#数目").val()];
        }
        function commit(){
            var info=getInfo();
            name=info[0];
            oneMoney=info[1];
            count=info[2]
            var total=$("#total").text();
            $.ajax({
                type: "GET",
                url: "moneyController.do",
                data:{oneMoney:oneMoney,count:count},
                success: function (price){
                    $("#manifest").append(`<li>商品名称:`+name+' 单价:'+oneMoney+` 数量:`+count+' 总计:'+price+`</li>`);
                    $("#goodName").val("");
                    $("#price").val("0.00");
                    $("#数目").val("0");
                    var cur=parseFloat(total)+parseFloat(price);
                    $("#total").text(cur);
                }
            })
        }
        /*写一个重置方法*/
        function remark(){
            $("#goodName").val("");
            $("#price").val("0.00");
            $("#数目").val("0");
            $("#manifest").text("");
            $("#discountWay").val("正常收费");
            $("#total").text("");
        }

        function Cash(){
            if(!confirm("确定要结算吗?")){
                return;
            }
            var totalPrice = $("#total").text();
            var type=$("#discountWay").val();
            $.ajax({
                type: "GET",
                url: "finallyCashController.do",
                data:{Type:type,totalPrice:totalPrice},
                success: function (result){
                    $("#manifest").append('<li>商品总价:'+totalPrice+" 优惠后:"+result+`</li>`);
                    $("#goodName").val("");
                    $("#price").val("0.00");
                    $("#数目").val("0");
                }
            })
        }
    </script>
</head>
<body>
<table>
<tr>
    <td>商品名称:</td>
    <td colspan="2"><input type="text" name="goodName" id="goodName"></td>
</tr>
<tr>
    <td>单价</td>
    <td><input type="text" name="price" id="price" value="0.00"></td>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <td><input type="button" value="确定" onclick="commit()"></td>
</tr>
<tr>
    <td>数量:</td>
    <td><input name="total" type="text" id="数目" value="0"></td>
    <td><input name="repeat" type="button" value="重置" onclick="remark()"></td>
</tr>
<tr style="height: 300px">
    <td colspan="3">
        <ul id="manifest">
        </ul>
    </td>
</tr>
    <%--增加一个可以折扣优惠的选项--%>
<tr>
<td colspan="3" style="height: 50px">
    <select id="discountWay" style="width: 50%;">
        <option selected value="正常收费">正常收费</option>
        <option value="打八折">打八折</option>
        <option value="打九折">打九折</option>
        <option value="满100减10">满100减10</option>
        <option value="满200减30">满200减30</option>
    </select>
</td>
</tr>
<tr>
    <td colspan="3" style="align-content: center">
        <input type="button" value="计价" style="margin-left: 250px;width: 20%" onclick="Cash()">
    </td>
</tr>
<tr>
    <td>总计</td>
    <td colspan="2">
        <div align="center" id="total">0</div>
    </td>
</tr>
</table>
</body>
</html>
