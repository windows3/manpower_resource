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
<a  class="btn  btn-primary" href="/customer/reg.view">注册</a>
<a  class="btn  btn-primary" href="/customer/login.view">登录</a>
<a  class="btn  btn-primary" href="/customer/customer.info">我的信息</a>
<a href="/product/allproduct">json显示商品</a>
<a href="/admin/login.view">管理员登录</a>
</body>
</html>
