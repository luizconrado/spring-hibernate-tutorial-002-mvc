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
    <title>JSP processForm - HelloWorld</title>
</head>
<body>

<h2>JSP - Confirmation Page V2</h2>

<p>Using URL Parameter directly from Thymeleaf:</p>
<p>Student Name: ${param.studentName}</p>
<br>
<p>Using the HttpServletRequest + Spring MVC Model:</p>
<p>Message: ${message}</p>
<br>

</body>
</html>
