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
    <title>注册</title>
</head>
<body>
${info}
<form action="/customer/reg.do" method="post">
    用户名:<input type="text" name="customerName"  required/>*<br>
    密码:<input type="password" name="customerPassword"  required/>*<br>
    邮箱:<input type="email" name="customerEmail"/><br>
    手机号:<input type="text" name="customerPhone"/><br>
    <input type="submit" value="提交">
    <h6>*为必填项</h6>
</form>
</body>
</html>
