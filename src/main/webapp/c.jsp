<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/03/26
  Time: 下午 7:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c.jsp</title>
</head>
<body>
<h3>传递参数到controller</h3>
<form action="save1" method="post">
    <input name="name"/>
    <input name="pwd"/>
    <button>submit</button>
</form>

<hr/>

<h3>传递整型到controller</h3>
<form action="save2" method="post">
    <input name="age"/>
    <button>submit</button>
</form>

<hr>

<h3>传递对象到controller</h3>
<form action="save3" method="post">
    <input name="uname"/>
    <input name="age"/>
    <button>submit</button>
</form>

<hr>

<h3>模拟数据自动封装</h3>
<form action="userServlet" method="post">
    <input name="uname"/>
    <input name="age"/>
    <button>submit</button>
</form>

<hr>

<h3>传递复选框数据</h3>
<form action="save4" method="post">
    <input type="checkbox" name="ids" value="1"/>
    <input type="checkbox" name="ids" value="2"/>
    <input type="checkbox" name="ids" value="3"/>
    <button>submit</button>
</form>

</body>
</html>
