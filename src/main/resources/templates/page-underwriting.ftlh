<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Панель администратора</title>
</head>
<body>
<div>
    <ul>
        <li><a href="/">Все заявки</a></li>
        <li><a href="/credits">Кредиты</a></li>
        <li><a href="/clients">Клиенты</a></li>
        <li><a href="/photos">Фотографии клиентов</a></li>
        <li><a href="/underwriting">Андеррайтинг</a></li>
    </ul>
</div>
<h2>Андеррайтинг</h2>
<hr>
<#list applications as application>
    <div>
        <p> ${application} | <a href="">Ссылка на фотографии</a> | <a href="">Данные пользователя</a></p>
    </div>
    <hr>
    <form action="/underwriting/change_status_approve/${application.id}" method="post">
        <input type="submit" value = "Одобрить"/>
    </form>
    <form action="/underwriting/change_status_decline/${application.id}" method="post">
        <input type="submit" value = "Отказать"/>
        Причина отказа: <input type = "text" name = "reject_reason"/><br><br>
    </form>
    <form action="/underwriting/change_status_cancel/${application.id}" method="post">
        <input type="submit" value = "Отменить"/>
        Причина отмены: <input type = "text" name = "reject_reason"/><br><br>
    </form>
    <form action="/underwriting/change_employee/${application.id}" method="post">
        <input type="submit" value = "Назначить ответственного"/>
        Сотрудник: <input type = "text" name = "employee_id"/><br><br>
    </form>
</#list>
<hr>


</body>
</html>