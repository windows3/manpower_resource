<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="row">
    <div class="col-md-12" id="content">
        <table class="table table-bordered">

            <tr class="success">
                <th>部门名</th>
                <th>招聘薪资</th>
                <th>招聘人数</th>
                <th>招聘创建时间</th>
                <th>操作</th>

            </tr>
            <c:forEach items="${recruitMessageList}" var="recruitMessage">
                <tr id="recruit">
                    <td><c:out value="${recruitMessage.post.postName}"></c:out></td>
                    <td><c:out value="${recruitMessage.recruitSalary}"></c:out></td>
                    <td><c:out value="${recruitMessage.recruitNumber}"></c:out></td>
                    <td><c:out value="${recruitMessage.recruitCreateTime}"></c:out></td>
                    <td><a class="btn btn-success" href="/applyForMessage/apply.do?id=${recruitMessage.id}">投递</a>
                            <%--<input type="button" onclick="addApply(${recruitMessage.id})" value="投递">--%>
                        <span id="abc"></span></td>
                </tr>
                <tr><a class="btn btn-success" href="/recruitMessage/query.all?id=${util.id}">下一页</a></tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
