<%--
  Created by IntelliJ IDEA.
  User: 3
  Date: 2018/3/8
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h1>${info}</h1>
<a  class="btn  btn-primary" href="/resume/resume.index">我的简历</a>
<a  class="btn btn-primary" name="i" href="/recruitMessage/query.all?id=${util.id}">招聘信息</a>

</body>
</html>
