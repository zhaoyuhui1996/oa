<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Login Form</title>
    <link rel="stylesheet" href="static_resource/login_user/css/style.css">
</head>
<body>
<div class="login">
    <div class="login-screen">
        <div class="app-title">
            <h1>Login</h1>
        </div>

        <div class="login-form">
            <div class="control-group">
                <input type="text" class="login-field" value="" placeholder="username" id="login-name" name="userid">
                <label class="login-field-icon fui-user" for="login-name"></label>
            </div>

            <div class="control-group">
                <input type="password" class="login-field" value="" placeholder="password" id="login-pass" name="pwd">
                <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

            <a class="btn btn-primary btn-large btn-block" href="login/loginCheck?permission=00U">login</a>
            <a class="login-link" href="#">Lost your password?</a>
        </div>
    </div>
</div>
</body>
</html>