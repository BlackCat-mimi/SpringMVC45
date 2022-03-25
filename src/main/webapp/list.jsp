<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/03/24
  Time: 下午 7:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--欢迎${user.uname}登录--%>
    <ul>
    <c:forEach items="${userList}" var="user">
        <li>${user.uname}</li>
    </c:forEach>
    </ul>
</body>
</html>
