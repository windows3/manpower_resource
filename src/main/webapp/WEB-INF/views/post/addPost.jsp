<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/3/9
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加职位</title>
    <%--<script>--%>
        <%--function change() {--%>
            <%--var x = document.getElementById("first");--%>
            <%--var y = document.getElementById("second");--%>
            <%--y.options.length = 0; // 清除second下拉框的所有内容--%>
            <%--if (x.selectedIndex == 0) {--%>
                <%--y.options.add(new Option("黄冈", "0"));--%>
                <%--y.options.add(new Option("武汉", "1", false, true));  // 默认选中省会城市--%>
            <%--}--%>

            <%--if (x.selectedIndex == 1) {--%>
                <%--y.options.add(new Option("深圳", "0"));--%>
                <%--y.options.add(new Option("广州", "1", false, true));  // 默认选中省会城市--%>
                <%--y.options.add(new Option("肇庆", "2"));--%>
            <%--}--%>
        <%--}--%>
    <%--</script>--%>
</head>
<body>
<form action="/post/post.add">
    <select id="first" onChange="change()">
        <c:forEach items="${departments}" var="department">
            部门名称:<option selected="selected">${department.departmentName}</option>
        </c:forEach>
    </select>
    职位名称:<input type="text" name="postName" required><br/>

        <%--是否记住密码<input type="checkbox" value="on" name="isremember">--%>
    <input type="submit" value="增加">


</form>
<h1>${info}</h1>
</body>
</html>