<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<h1>${info}欢迎:${admin.adminName}</h1>
<%--<a href="/product/add.view">增加商品</a>--%>
<%--<c:forEach items="${products}" var="prodcut">--%>
   <%--<c:out value="${prodcut.productName}"></c:out></br>--%>
<%--</c:forEach>--%>
<a href="/department/department.create">增加部门</a>
<a href="/post/post.create">职位管理</a>
<a href="/recruitMessage/recruit.index">招聘信息管理</a>
<a href="/applyForMessage/apply.query">应聘信息管理</a>
<a href="/train/train.index">培训管理</a>

<%--<a  href="/post/post.create">增加职位</a>--%>

</body>
</html>
