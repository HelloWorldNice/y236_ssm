<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script>
        $(function () {
            $("#registerBtn").click(function () {
                // 异步方式提交表单
                var username = $("input[name=username]").val();
                var password = $("input[name=password]").val();
                var age = $("input[name=age]").val();

                // 构造一个json对象
                var formData = {"username": username, "password": password, "age": age};
                $.post(
                    "${pageContext.request.contextPath}/person/login3",
                    JSON.stringify(formData),
                    function (respData) {
                        // 响应的数据
                        var code = respData.code;
                        if (code == 200) {
                            // 登录成功
                            alert(respData.message);
                            window.location.href = "https://www.baidu.com";
                        } else {
                            alert(respData.message);
                        }
                    },
                    contentType: "application/json;charset=utf-8"
                    "json"
                );
            });
        });
    </script>
</head>
<body>
<form id="form" method="post" enctype="application/x-www-form-urlencoded">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="button" id="registerBtn" value="注册"/>
</form>
</body>
</html>
