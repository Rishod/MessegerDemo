<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 09.09.2016
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="profile-holder">
    <div class="profile-name">
        USER
    </div>
    <div class="user-photo">
        <img src="/resources/imgs/User_Circle.png" alt="">
        <%--<div class="load-img">--%>
            <%--<form action="">--%>
                <%--<input type="file" value="Change avatar" id="file-s">--%>
                <%--<input type="submit">--%>
            <%--</form>--%>
        <%--</div>--%>
    </div>

    <div class="user-info">
        <div class="user-field-label">Login : ${user.username}</div>
        <div class="user-field-label">E-mail : ${user.email}</div>
    </div>
</div>
