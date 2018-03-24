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
<form method="post" action="/train/train.add">
开始时间：<input type="date" name="trainTime">
时长：<input type="text" name="trainLong">
地点：<input type="text" name="trainAddress">
主要内容：<input type="text" name="trainContent">

    <input type="submit" value="提交">
</form>
</body>
</html>
