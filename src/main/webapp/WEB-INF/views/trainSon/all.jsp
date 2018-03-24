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
                <th>员工工号</th>
                <th>培训id</th>
                <th>操作</th>

            </tr>
            <c:forEach items="${trainSonList}" var="trainSon">
                <tr id="recruit">
                    <td><c:out value="${trainSon.empId}"></c:out></td>
                    <td><c:out value="${trainSon.trainId}"></c:out></td>

                   <a class="btn btn-success" href="/trainSon/trainSon.create?id=${train.id}">增加员工</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
