<%--
  Created by IntelliJ IDEA.
  User: LuizFelipe
  Date: 19/08/2020
  Time: 03:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
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

    <style>

        input[type="radio"]{
            margin: 0 0 0 10px;
        }

        input[type="checkbox"]{
            margin: 0 0 0 10px;
        }

        input[name="operatingSystem"]{
            margin: 0 10px 0 0;
        }

        input[name="integratedDevelopmentEnvironment"], input[name="laptopScreenSize"]{
            margin-right:3px;
        }

        #laptopScreenSize1 {
            margin: 0 3px 0 0;
        }

        #favoriteProgramingLanguageId {
            margin: 0 0 0 0;
        }

        #integratedDevelopmentEnvironment1 {
            margin-left: 0;
        }

    </style>

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

            <form:label path="laptopScreenSize">Favorite Programming Language:</form:label>
            <br>
            <form:label path="favoriteProgramingLanguage" for="favoriteProgramingLanguageId">PHP</form:label>
            <form:radiobutton id="favoriteProgramingLanguageId" path="favoriteProgramingLanguage" value="PHP"
                              htmlEscape="true"/>
            &nbsp;&nbsp;&nbsp;
            <form:label path="favoriteProgramingLanguage" for="favoriteProgramingLanguageId">Java</form:label>
            <form:radiobutton id="favoriteProgramingLanguageId" path="favoriteProgramingLanguage" value="Java"
                              htmlEscape="true"/>
            &nbsp;&nbsp;&nbsp;
            <form:label path="favoriteProgramingLanguage" for="favoriteProgramingLanguageId">C++</form:label>
            <form:radiobutton id="favoriteProgramingLanguageId" path="favoriteProgramingLanguage" value="C++"
                              htmlEscape="true"/>
            &nbsp;&nbsp;&nbsp;
            <form:label path="favoriteProgramingLanguage" for="favoriteProgramingLanguageId">C#</form:label>
            <form:radiobutton id="favoriteProgramingLanguageId" path="favoriteProgramingLanguage" value="C#"
                              htmlEscape="true"/>
            &nbsp;&nbsp;&nbsp;
            <form:label path="favoriteProgramingLanguage" for="favoriteProgramingLanguageId">Python</form:label>
            <form:radiobutton id="favoriteProgramingLanguageId" path="favoriteProgramingLanguage" value="Python"
                              htmlEscape="true"/>

            <br>
            <br>

            <form:label path="laptopScreenSize">Favorite Laptop Screen Size:</form:label>
            <br>
            <form:radiobuttons path="laptopScreenSize" items="${laptopScreenSizeOptions}"/>

            <br>
            <br>

            <form:label path="operatingSystem">Favorite Operating Systems:</form:label>
            <br>
            <form:label path="operatingSystem" for="operatingSystemWindowsId">Windows</form:label>
            <form:checkbox id="operatingSystemWindowsId" path="operatingSystem" value="Windows" htmlEscape="true" />

            <form:label path="operatingSystem" for="operatingSystemMacOSId">Mac OS</form:label>
            <form:checkbox id="operatingSystemMacOSId" path="operatingSystem" value="MacOS" htmlEscape="true" />

            <form:label path="operatingSystem" for="operatingSystemLinuxId">Linux</form:label>
            <form:checkbox id="operatingSystemLinuxId" path="operatingSystem" value="Linux" htmlEscape="true" />

            <form:label path="operatingSystem" for="operatingSystemChromeOSId">Chrome OS</form:label>
            <form:checkbox id="operatingSystemChromeOSId" path="operatingSystem" value="ChromeOS" htmlEscape="true" />

            <form:label path="operatingSystem" for="operatingSystemUNIXId">UNIX</form:label>
            <form:checkbox id="operatingSystemUNIXId" path="operatingSystem" value="UNIX" htmlEscape="true" />

            <br>
            <br>

            <form:label path="operatingSystem">Favorite IDE:</form:label>
            <br>
            <form:checkboxes path="integratedDevelopmentEnvironment" items="${integratedDevelopmentEnvironments}"/>

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
