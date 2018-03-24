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
<form method="post" action="/resume/resume.add">

    <table>
        <tr>
            <th>真实姓名</th>
            <td><input type="text" name="trueName"></td>
        </tr>
        <tr>
            <th>家庭地址</th>
            <td><input type="text" name="familyAddress"></td>
        </tr>
        <tr>
            <th>现居住</th>
            <td><input type="text" name="nowAddress">
            </td>
        </tr>
        <tr>
            <th>头像</th>
            <td><input type="text" name="headPicture">
            </td>
        </tr>
        <tr>
            <th>毕业院校</th>
            <td><input type="text" name="graduateInstitutions">
            </td>
        </tr>
        <tr>
            <th>学历</th>
            <td><input type="text" name="education">
            </td>
        </tr>
        <tr>
            <th>专业</th>
            <td><input type="text" name="major"></td>
        </tr>
        <tr>
            <th>个人简介</th>
            <td><input type="text" name="synopsis">
            </td>
        </tr>


    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
