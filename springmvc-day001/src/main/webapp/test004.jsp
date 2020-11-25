<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-1.12.4.js"></script>
    <script>
        alert($);
    </script>
</head>
<body>
<form id="form" method="post" enctype="">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="button" id="registerBtn" value="注册"/>
</form>
</body>
</html>
