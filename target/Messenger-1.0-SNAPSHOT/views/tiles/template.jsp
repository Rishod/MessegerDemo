<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 07.09.2016
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="/resources/css/normalize.css">
    <link rel="stylesheet" href="/resources/css/style.css">
    <script src="/resources/js/do.js"></script>
    <script src="/resources/js/jquery-3.1.0.min.js"></script>
    <script src="/resources/js/mail.js"></script>


</head>
<body>
    <div class="container">
        <div><tiles:insertAttribute name="header"/></div>
        <sec:authorize access="isAuthenticated()">
            <div><tiles:insertAttribute name="menu"/></div>
        </sec:authorize>
        <div><tiles:insertAttribute name="body"/></div>
    </div>

</body>
</html>
