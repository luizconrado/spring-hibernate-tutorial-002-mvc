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
    <title>Hello World - Input Form V1</title>


    <style>
        form.form-example {
            display: table;
        }

        div.form-example {
            display: table-row;
        }

        label,
        input {
            display: table-cell;
            margin-bottom: 10px;
        }

        label {
            padding-right: 10px;
        }

        .button {
            margin-top: 10px;
            margin-right: 10px;
        }
    </style>

</head>
<body>

<h2>Hello World - Input Form V1</h2>

<form action="${pageContext.request.contextPath}/hello/processForm" method="get">

    <div class="form-example">
        <label for="name">Enter your name: </label>
        <input id="name" name="studentName" required type="text">
    </div>

    <div class="form-example">
        <label for="email">Enter your email: </label>
        <input id="email" name="studentEmail" required type="email">
    </div>

    <div class="form-example">
        <label for="message">Your Message:</label>
        <textarea cols="39" id="message" name="message" placeholder="Enter your message here" required
                  rows="8"></textarea>
    </div>

    <input id="prodId" name="prodId" type="hidden" value="xm234jq">

    <div class="form-example" dir="ltr">
        <input class="button" type="submit" value="Subscribe!">
        <input class="button" type="reset" value="Reset">
    </div>

</form>


</body>
</html>
