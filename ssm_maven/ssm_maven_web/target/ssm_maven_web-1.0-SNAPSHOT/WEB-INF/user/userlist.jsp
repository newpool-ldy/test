
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>用户列表</h2>
<table border="1" style="border-collapse: collapse;">
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
            <td>
                <a onclick="updateuser()" href="javascript:void(0)">修改</a>&nbsp;&nbsp;
                <a onclick="deleteuser(${user.id})" href="javascript:void(0)">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
<script>
    function deleteuser(id) {
        if(confirm('确定要删除吗？')){
            window.location.href="${pageContext.request.contextPath}/user/deleteuser.do?id="+id;
        }
    }
</script>
</html>
