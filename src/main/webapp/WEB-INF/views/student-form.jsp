<%--
  Created by IntelliJ IDEA.
  User: LuizFelipe
  Date: 19/08/2020
  Time: 03:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <meta charset="UTF-8">
    <!--    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>-->
    <!--    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>-->

    <!--    Bootstrap 4:-->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!--    Bootstrap 4:-->

    <meta name="author" content="Luiz Felipe Conrado">
    <meta name="description" content="Full Functional Form with Spring and Thymeleaf">
    <meta name="keywords" content="HTML, CSS, JavaScript, Spring, Thymeleaf">

    <!-- Normalize CSS -->
    <link rel="stylesheet" type="text/css" media="all"
          href="${pageContext.request.contextPath}/resources/css/444_css_normalize.css"/>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <title>Student Form</title>

</head>
<body>


<form:form action="${pageContext.request.contextPath}/student/processForm" modelAttribute="student" method="post">

    <div style="margin: auto; width: 67%; padding-top: 20px">
        <div>

            First Name: <form:input path="firstName"/>

            <br>
            <br>

            Last Name: <form:input path="lastName"/>

            <br>
            <br>

            Gender:
            <form:select path="gender">
                <form:option value="Male" label="Male"/>
                <form:option value="Female" label="Female"/>
            </form:select>

            <br>
            <br>

            Country:
            <form:select path="country">
                <%-- https://www.baeldung.com/spring-mvc-form-tags --%>
                <form:options items="${countries}"/>
            </form:select>

            <br>
            <br>

        </div>

        <div>
            <input type="submit" value="Submit"/>
        </div>

    </div>


</form:form>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>
</body>
</html>
