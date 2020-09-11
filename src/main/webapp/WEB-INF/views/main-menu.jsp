<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" media="all"
          href="${pageContext.request.contextPath}/resources/css/444_css_normalize.css">
    <title>Main Menu</title>


    <%--    https://www.w3schools.com/howto/howto_css_two_columns.asp--%>
    <style>
        * {
            box-sizing: border-box;
        }

        /* Create two equal columns that floats next to each other */
        .column {
            float: left;
            width: 50%;
            padding: 10px;
            height: 300px; /* Should be removed. Only for demonstration */
        }

        .row {
            width: 90%;
            margin: 0 auto;
        }

        /* Clear floats after the columns */
        .row:after {
            content: "";
            display: table;
            clear: both;
        }
    </style>


</head>
<body>


<div>
    <h2>Spring MVC Demo - Home Page</h2>
</div>


<div class="row">
    <div class="column" style="background-color:#aaa;">
        <h2>Java Server Pages (JSP)</h2>

        <ul>
            <li><a href="${pageContext.request.contextPath}/">JSP - Main Menu</a></li>
            <li><a href="${pageContext.request.contextPath}/hello/showForm">JSP - Show Form V1</a></li>
            <li><a href="${pageContext.request.contextPath}/hello/showFormV2">JSP - Show Form V2</a></li>
            <li><a href="${pageContext.request.contextPath}/hello/showFormV3">JSP - Show Form V3</a></li>
            <li><a href="${pageContext.request.contextPath}/hello/showCompleteForm">JSP - Show Complete Form</a></li>
        </ul>

        <ul>
            <li>------ Student Exercises ------</li>
            <li><a href="${pageContext.request.contextPath}/student/showForm">JSP - Student - Show Form</a></li>
        </ul>

        <ul>
            <li>------ Customer Exercises ------</li>
            <li><a href="${pageContext.request.contextPath}/customer/showForm">JSP - Customer - Show Form</a></li>
        </ul>

    </div>
    <div class="column" style="background-color:#bbb;">
        <h2>Thymeleaf</h2>
        <ul>
            <li><a href="${pageContext.request.contextPath}/thymeleaf">Thymeleaf - Main Menu</a></li>
            <li><a href="${pageContext.request.contextPath}/thymeleaf/hello/showForm">Thymeleaf - Show Form V1</a></li>
            <li><a href="${pageContext.request.contextPath}/thymeleaf/hello/showFormV2">Thymeleaf - Show Form V2</a></li>
            <li><a href="${pageContext.request.contextPath}/thymeleaf/hello/showFormV3">Thymeleaf - Show Form V3</a></li>
            <li><a href="${pageContext.request.contextPath}/thymeleaf/hello/showCompleteForm">Thymeleaf - Show Complete Form</a></li>
        </ul>

        <ul>
            <li>------ Customer Exercises ------</li>
            <li><a href="${pageContext.request.contextPath}/thymeleaf/customer/showForm">Thymeleaf - Customer - Show Form</a></li>
        </ul>
    </div>
</div>


</body>
</html>