<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script>
        $(function () {
            $("#registerBtn").click(function () {
                // 异步方式提交表单

                var formData = $("#form").serialize();
                $.post(
                    "${pageContext.request.contextPath}/person/login",
                    formData,
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
                    "json"
                );
            });
        });
    </script>
</head>
<body>
<form id="form" method="post">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="text" name="password"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="button" id="registerBtn" value="注册"/>
</form>
</body>
</html>
