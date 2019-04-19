<%--
  Created by IntelliJ IDEA.
  User: ym
  Date: 2019-4-12
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户信息：

id:<%--<c:out value="${user}"></c:out>--%>
${user.id}<br>
name:${user.lastName}<br>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <c:forEach items="${users}" var="user">
    <tr>
        <td><%--<c:out value="${user.id}"></c:out>--%>${user.id}</td>
        <td><%--<c:out value="${user.lastName}"></c:out>--%>${user.lastName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
