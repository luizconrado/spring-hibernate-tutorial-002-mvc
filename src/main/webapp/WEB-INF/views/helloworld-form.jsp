<%--
  Created by IntelliJ IDEA.
  User: felipe
  Date: 31/07/2020
  Time: 03:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>
<body>

<h2>Hello World - Input Form</h2>

<form action="${pageContext.request.contextPath}/hello/processForm" method="get">

    <input type="text" name="studentName" placeholder="What's your name?"><br>
    <input type="submit" value="Submit!">

</form>


</body>
</html>
