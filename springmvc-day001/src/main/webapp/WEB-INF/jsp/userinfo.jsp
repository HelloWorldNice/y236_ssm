<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户名：${user.username} <br/>
年龄： ${user.age} <br/>
密码： ${user.pwd}<br/>
出生日期：
<fmt:formatDate value="${user.born}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
<br/>
<c:forEach items="${user.addressesStrs}" var="address">
    ${address}---
</c:forEach>
</body>
</html>
