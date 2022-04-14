
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<form id="form1">
    <input name="uname" id="uname">
    <input name="upwd" id="upwd">
    <button type="button" id="btnSave">save</button>
</form>

</body>
</html>

<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        // $.ajax({
        //     url:"list",
        //    // data:$("#form1").serialize(),
        //     success:function (data) {
        //
        //         alert(data)
        //     }
        // });

        $("#btnSave").click(function () {
            var jsonStr = {"uname":$("#uname").val(),"upwd":$("#upwd").val()};
            $.ajax({
                url:"save",
                type:"post",
                contentType:"application/json",
                data:JSON.stringify(jsonStr),
                success:function (date) {
                    alert(date)
                }
            });
        });
    });


</script>