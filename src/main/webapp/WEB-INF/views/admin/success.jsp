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
<a href="/product/add.view">增加商品</a>
<c:forEach items="${products}" var="prodcut">
   <c:out value="${prodcut.productName}"></c:out></br>
</c:forEach>


</body>
</html>
