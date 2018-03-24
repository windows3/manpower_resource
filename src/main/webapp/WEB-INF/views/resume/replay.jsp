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
<form action="/resume/resume.updated" method="post">

    <table>
        <tr>
            <th>真实姓名:</th>
            <td><input name="trueName" type="text" value="${resume.trueName}"></td>
        </tr>
        <tr>
            <th>家庭地址:</th>
            <td><input name="familyAddress" type="text"  value="${resume.familyAddress}"></td>
        </tr>
        <tr>
            <th>现居住:</th>
            <td><input name="nowAddress" type="text" value="${resume.nowAddress}"></td>
        </tr>
        <tr>
            <th>头像:</th>
            <td><input name="headPicture" type="text"  value="${resume.headPicture}"></td>
        </tr>
        <tr>
            <th>毕业院校:</th>
            <td><input name="graduateInstitutions" type="text"  value="${resume.graduateInstitutions}"></td>
        </tr>
        <tr>
            <th>学历:</th>
            <td><input name="education" type="text"  value="${resume.education}"></td>
        </tr>
        <tr>
            <th>专业:</th>
            <td><input name="major" type="text" value="${resume.major}"></td>
        </tr>
        <tr>
            <th>个人简介:</th>
            <td><input name="synopsis" type="text" value="${resume.synopsis}"></td>
        </tr>


    </table>
    <input type="submit" value="确认修改">
</form>

</body>
</html>
