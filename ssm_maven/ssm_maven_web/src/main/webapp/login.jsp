
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>登录页面</h3>
<form method="post" action="${pageContext.request.contextPath}/user/login.do">
    用户名：<input name="username"><br/>
    密 码：<input type="password" name="password"><br/>

    <button type="submit">提交</button>
</form>
<span style="color: red">${errorMsg}</span>
</body>
</html>
