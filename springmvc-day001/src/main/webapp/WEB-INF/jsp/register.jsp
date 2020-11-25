<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/registerForUserAndDate" method="post">
    用户名:<input type="text" name="username"><br/>
    密码: <input type="password" name="pwd"><br/>
    年龄: <input type="text" name="age"><br/>
    出生日期：<input type="text" name="born"/> <br/>

    省份1: <input type="text" name="addressMap['key1'].province"/><br/>
    城市1: <input type="text" name="addressMap['key1'].city"/> <br/>

    省份2: <input type="text" name="addressMap['key2'].province"/><br/>
    城市2: <input type="text" name="addressMap['key2'].city"> <br/>

    <input type="submit" value="注册">
</form>
</body>
</html>
