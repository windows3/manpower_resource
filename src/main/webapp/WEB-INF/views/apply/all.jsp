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
    <script>

        var xmlhttp;
        var mydate;
        var dele;
        var abc;
        function addApply(id) {
            if (window.XMLHttpRequest) {
                xmlhttp = new XMLHttpRequest();
            } else {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");

            }
            xmlhttp.open("POST", "/applyForMessage/apply.do?id=" + id, true);
            xmlhttp.send()
            xmlhttp.onreadystatechange = result1;

        }
        function result1() {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
//                如果删除成功则返回 true
//                如果删除失败返回false
                mydate = xmlhttp.responseText;
                console.log(mydate);
                mydate = JSON.parse(mydate);
                console.log(mydate);
                showTab()
            }

        }
        function showTab() {
            var c = "<table class='table table-bordered'> " +
                    "<tr class='success'> " +
                    "<th>招聘薪资</th>" +
                    "<th>招聘人数</th>" +
                    "<th>招聘创建时间</th>" +
                    "<th>操作</th>" +

                    "</tr>"
            for (var i = 0; i < mydate.length; i++) {
                c += "<tr>";
                c += "<td>" + mydate[i].recruitSalary + "</td>"
                c += "<td>" + mydate[i].recruitNumber + "</td>"
                c += "<td>" + mydate[i].recruitCreateTime + "</td>"
                c += "</tr>"
            }
            var con = document.getElementById("content");
            con.innerHTML = c;
        }
    </script>
</head>
<body>
<h1>${info}</h1>
<div class="row">
    <div class="col-md-12" id="content">
        <table class="table table-bordered">

            <tr class="success">
                <th>职位</th>
                <th>投递时间</th>

                <th>查看</th>

                <th>操作</th>

            </tr>
            <c:forEach items="${applyForMessageList}" var="applyForMessage">
                <tr id="recruit">
                    <td><c:out value="${applyForMessage.recruitMessage.post.postName}"></c:out></td>
                    <td><c:out value="${applyForMessage.applyCreateTime}"></c:out></td>
                    <%--<td><c:out value="${applyForMessage.applyIsNormal}"></c:out></td>--%>
                    <td><c:if test="${applyForMessage.applyIsSee.toString().equals('0')}">未看</c:if><c:if test="${applyForMessage.applyIsSee.toString().equals('1')}">已看</c:if></td>

                    <td> <a class="btn btn-success" href="/applyForMessage/apply.queryById?id=${applyForMessage.id}">查看简历</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
