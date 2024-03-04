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
<#list creditApplications as creditApplication>
<div>
    <p><b>${creditApplication.status}</b> ${creditApplication} | <a href="">Ссылка на фотографии</a> | <a href="">Данные пользователя</a></p>
</div>
<hr>
<form action="/credit_application/change_status_approve/${creditApplication.id}" method="post">
    <input type="submit" value = "Одобрить"/>
</form>
<form action="/credit_application/change_status_decline/${creditApplication.id}" method="post">
    <input type="submit" value = "Отказать"/>
</form>
<form action="/credit_application/change_status_incorrect/${creditApplication.id}" method="post">
    <input type="submit" value = "Неподходящие фото"/>
</form>
</#list>



<!--<form action="/creditApplication/create" method="post">
    <h3>Создать заявку</h3>
    Имя: <input type = "text" name = "first_name"/><br><br>
    Фамилия: <input type = "text" name = "second_name"/><br><br>
    <input type="submit" value = "Отправить заявку"/>
</form>-->

</body>
</html>