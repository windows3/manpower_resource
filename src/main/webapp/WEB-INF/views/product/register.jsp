<%--
  Created by IntelliJ IDEA.
  User: 3
  Date: 2018/3/9
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加商品</title>
</head>
<body>
${info}
<form action="/product/add.do" method="post">
    商品名:<input type="text" name="productName"/><br>
    类型:<input type="text" name="productType"/><br>
    价格:<input type="text" name="productPrice"/><br>

    <input type="submit" value="添加">
</form>
</body>
</html>
