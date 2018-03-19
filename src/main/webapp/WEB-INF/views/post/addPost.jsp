<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/3/9
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加职位</title>
</head>
<body>
<h1>${info}</h1>
<form action="/post/post.add">
    部门名称:<input type="text" name="departmentName" required><br/>
    职位名称:<input type="text" name="postName" required><br/>
    <%--是否记住密码<input type="checkbox" value="on" name="isremember">--%>
    <input type="submit" value="增加">

</form>
</body>
</html>
