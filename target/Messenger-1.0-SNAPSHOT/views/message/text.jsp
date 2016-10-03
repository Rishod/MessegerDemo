<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 09.09.2016
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="mail-container">


    <div class="message-text-holder">
        <div class="message-text_theme" style="border-bottom:2px solid white">
            Від кого :
        </div>
        <div class="message-text_theme-title" style="border-bottom:2px solid white">
            &emsp; ${message.sender.username}
        </div>
        <div class="message-text_theme">
            Тема повідомлення :
        </div>
        <div class="message-text_theme-title">
            &emsp; ${message.theme}
        </div>
        <div class="message-text-holder_text">
            ${message.message}
        </div>
    </div>

<%--<div class="message-text-holder">--%>
    <%--<div class="message-text_theme">--%>
        <%--Відправник :--%>
    <%--</div>--%>
    <%--<div class="message-text_theme-title">--%>
        <%--&emsp; ${message.sender.username}--%>
    <%--</div>--%>
    <%--<div class="message-text-holder_text">--%>
        <%--${message.message}--%>
    <%--</div>--%>
<%--</div>--%>

</div>