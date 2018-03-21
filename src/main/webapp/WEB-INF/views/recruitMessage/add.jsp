<%--
  Created by IntelliJ IDEA.
  User: 3
  Date: 2018/3/9
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<h1>${info}</h1>
<form action="/recruitMessage/recruit.add" method="post">
    职位：<input type="text" name="postName"><br>
   基本薪资:<input type="number" name="recruitSalary"><br>
   招聘人数:<input type="number" name="recruitNumber"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
