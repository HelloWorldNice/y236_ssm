<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${accounts}" var="account">
        ${account.id}--${account.name} -- ${account.age}--${account.balance}--<br/>
    </c:forEach>
</body>
</html>
