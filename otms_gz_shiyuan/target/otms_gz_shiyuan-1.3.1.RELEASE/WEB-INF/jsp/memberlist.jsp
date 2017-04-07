<%--
  Created by IntelliJ IDEA.
  User: 1002428
  Date: 15. 12. 17.
  Time: 오후 5:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${members}" var="member">
        <tr>
            <td>${member.id}</td>
            <td>${member.name}</td>
            <td>${member.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
