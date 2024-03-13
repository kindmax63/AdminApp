<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Панель администратора</title>
</head>
<body>
<div>
    <ul>
        <li><a href="">Все заявки</a></li>
        <li><a href="">Одобренные заявки</a></li>
        <li><a href="">Клиенты</a></li>
    </ul>
</div>
<h2>Все заявки</h2>
<#list applications as application>
<div>
    <p><b>${application.status}</b> ${application} | <a href="">Ссылка на фотографии</a> | <a href="">Данные пользователя</a></p>
</div>
<hr>
<form action="/application/change_status_approve/${application.id}" method="post">
    <input type="submit" value = "Одобрить"/>
</form>
<form action="/application/change_status_decline/${application.id}" method="post">
    <input type="submit" value = "Отказать"/>
</form>
<form action="/application/change_status_incorrect/${application.id}" method="post">
    <input type="submit" value = "Неподходящие фото"/>
</form>
</#list>



<!--<form action="/application/create" method="post">
    <h3>Создать заявку</h3>
    Имя: <input type = "text" name = "first_name"/><br><br>
    Фамилия: <input type = "text" name = "second_name"/><br><br>
    <input type="submit" value = "Отправить заявку"/>
</form>-->

</body>
</html>