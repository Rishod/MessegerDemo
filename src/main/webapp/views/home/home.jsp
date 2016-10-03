<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 06.09.2016
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<sec:authorize access= "isAnonymous()">
<div class="log-reg-switcher">
    <div class="button button--login">Log in</div>
    <div class="button button--registry">Registry</div>
</div>
<div class="form-holder">
    <div class="login-form-holder">
        <form action="/login" id="log-form" method="post">
            <input type="text" placeholder="Enter login" name="username" id="test">
            <br>
            <input type="password" placeholder="Enter password" name="password">
            <input type="submit" value="Log in">
        </form>
    </div>
    <div class="registry-form-holder">
        <form:form action="/registration" method="post" id="reg-form" modelAttribute="u">
            <form:input type="text" placeholder="Enter login" path="username"/>
            <br>
            <form:input type="password" placeholder="Enter password" path="password"/>
            <br>
            <form:input type="text" placeholder="Enter e-mail" path="email"/>
            <br>
            <input type="submit" value="Registry">
        </form:form>
    </div>
</div>
</sec:authorize>
