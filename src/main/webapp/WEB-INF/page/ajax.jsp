<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ajax更新数据</title>
    <script src="/resources/js/jquery.js"></script>
</head>
<body>
    <div>
        <select name="selectPerson" id="selectPerson">
            <option value="0" selected>请选择</option>
            <option value="1">张三</option>
            <option value="2">李四</option>
            <option value="3">王五</option>
        </select>
        <input type="button" class="btn" value="查询"/>
    </div>
    <br>
    <div class="content"></div>
</body>
<script type="text/javascript">
    $(document).ready(function(){
        $('.btn').click(function(){
            //获取下拉框的值
            var opt_values = $("#selectPerson  option:selected").val();
            if (opt_values == 0){
                alert("请选择要查询的选项！");
                return false;
            }
            $.ajax({
                type: "get",
                url: "/ajax",
                dataType: "json",
                data: {
                    opt_values:opt_values
                },
                success: function (data) {
                    var person = data["person"];
                    console.log("person:"+person);
                    $(".content").text(person);
                }
            });
        });
    });
</script>
</html>