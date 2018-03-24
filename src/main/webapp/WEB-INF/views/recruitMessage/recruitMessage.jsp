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
//        $(document).ready(function () {
//            $("#btn1").click(function (id) {
//                $.ajax({
//                    type: post,
//                    url: "/recruitMessage/release.do",
//
//                    data: {
//                        id: id
//                    },
//                    success: function (result) {
//                        each(function () {
//                            $("#recruit").html("<td>" + result.post.postName +
//                                    "</td>" + "<td>" + result.recruitSalary + "</td>" +
//                                    result.recruitNumber + "</td>" +
//                                    "<td>" + result.recruitCreateTime + "</td>")
//                        })
//                    }
//                });
//
//            })
//
//        })

        var xmlhttp;
        var mydate;
        var dele;
        function addRecruitMessage(id) {
            if (window.XMLHttpRequest) {
                xmlhttp = new XMLHttpRequest();
            } else {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");

            }
            xmlhttp.open("POST", "/recruitMessage/release.do?id=" + id, true);
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
                <th>部门名</th>
                <th>招聘薪资</th>
                <th>招聘人数</th>
                <th>招聘创建时间</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${recruitMessageList}" var="recruitMessage">
                <tr>
                    <td><c:out value="${recruitMessage.post.postName}"></c:out></td>
                    <td><c:out value="${recruitMessage.recruitSalary}"></c:out></td>
                    <td><c:out value="${recruitMessage.recruitNumber}"></c:out></td>
                    <td><c:out value="${recruitMessage.recruitCreateTime}"></c:out></td>
                    <td>
                        <button class="btn  btn-danger" id="btn1"
                                onclick="addRecruitMessage(${recruitMessage.id},this)">
                            >发布
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
