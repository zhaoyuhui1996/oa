<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<c:set var="ctx" value="${pageContext.request.contextPath}"/>--%>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Login Form</title>
    <link rel="stylesheet" href="static_resource/login_admin/css/style.css">
    <script type="text/javascript" src="static_resource/login_admin/js/jquery.min.js"></script>
    <script type="text/javascript">
        function loginSubmit() {
            $.ajax({
                type: 'POST',
                async: false,
                data: $("#adminLogin").serialize(),
                dataType: 'text',
                url: 'login/loginCheck?permission=00A',
                success: function (data) {
                    if (data == 'LS') {
                        window.location.href = '${pageContext.request.contextPath}/#';
                    } else {
                        alert(data);
                    }
                },
                error: function (e) {
                    alert(e);
                }
            })
        }
    </script>
</head>

<body>
<div class="login">
    <div class="login-triangle"></div>
    <h2 class="login-header">Log in</h2>
    <form id="adminLogin" class="login-container" action="#" method="post">
        <p><input type="text" name="userid" placeholder="UserName"></p>
        <p><input type="password" name="pwd" placeholder="Password"></p>
        <p><input type="text" name="verifyCode" placeholder="Verify Code"></p>
        <p>${loginMessage}</p>
        <p><input type="button" value="Log in" onclick="loginSubmit()"></p>
    </form>
    <div><a href="${pageContext.request.contextPath}/user">用户登录</a></div>
</div>
</body>
</html>
