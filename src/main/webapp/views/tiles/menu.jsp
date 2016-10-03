<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 01.10.2016
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="messages-switcher">
    <a href="/message/input">
        <div class="messages messages-getted">Вхідні
            <%--<div class="unreaded-counter">8</div>--%>
         </div>
    </a>
    <a href="/message/output"><div class="messages messages-sended">Вихідні</div></a>
    <div class="messages messages-send" id="show_modal">Надіслати</div>


    <div id="modal_form">
        <span id="modal_close">X</span>
        <form action="/send" id="send-mail-form" name="send-mail">
            <div class="m_name">
                Message
            </div>
            <input type="text" placeholder="Кому : " name="name">
            <input type="text" placeholder="Тема : " name="theme">
            <textarea cols="30" rows="9" placeholder="Введіть текст повідомлення..." name="text"></textarea>
            <input type="submit" value="Send message">
        </form>
    </div>
    <div id="overlay"></div>



</div>


