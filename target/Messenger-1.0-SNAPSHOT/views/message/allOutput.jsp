<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<fmt:formatDate value="${message.date}" var="dateString" pattern="dd/MM/yyyy" />--%>
<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 02.10.2016
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="mail-container">

    <div class="messages-panel">

        <c:forEach  items="${messages}" var="m">

            <a href="/message/text/${m.id}">
            <div class="messages-panel_message message-unreaded">
                <div class="message-panel_message__photo">
                    <img src="/resources/imgs/User_Circle.png" alt="user">
                </div>
                <div class="message-panel_message__info">
                    <div class="message-panel_message__info___author">
                        Кому :
                    </div>
                    <div class="message-panel_message__info___text">
                        ${m.recipient.username}
                    </div>
                    <%--<div class="message-panel_message__info___date">--%>
                        <%--Дата : ${dateString}--%>
                    <%--</div>--%>
                </div>
            </div>
            </a>
        </c:forEach>

    </div>
</div>
