<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 07.09.2016
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="mail-header">
    <div class="mail-header_logo"><img src="/resources/imgs/Windows-Live-Messenger-icon.png" alt=""></div>
    <div class="mail-header_company-name">
        Messages
    </div>
    <sec:authorize access="isAuthenticated()">
        <a href="/profile">
            <div class="mail-header_profile">
                <img src="/resources/imgs/User_Circle.png" alt="">
            </div>
        </a>
        <div class="btn-exit">
            <form action="/logout"><input type="submit" name="exit" value="Exit" id="exit-btn"></form>
        </div>
    </sec:authorize>
</div>
