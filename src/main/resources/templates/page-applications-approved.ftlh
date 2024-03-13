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
<h2>Все одобренные заявки</h2>
<#list application as application>
<div>
    <p><b>${application.state}</b> ${application} | <a href="">Ссылка на фотографии</a> | <a href="">Данные пользователя</a></p>
</div>
<hr>
</#list>

<!--<form action="/application/create" method="post">
    <h3>Создать заявку</h3>
    Имя: <input type = "text" name = "first_name"/><br><br>
    Фамилия: <input type = "text" name = "second_name"/><br><br>
    <input type="submit" value = "Отправить заявку"/>
</form>-->

</body>
</html>