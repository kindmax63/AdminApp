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
        <li><a href="">Кредиты</a></li>
        <li><a href="/clients">Клиенты</a></li>
        <li><a href="">Фотографии клиентов</a></li>
        <li><a href="">Андеррайтинг</a></li>
    </ul>
</div>
<h2>Все заявки</h2>
<#list applications as application>
<div>
    <p><b>${application.state}</b> ${application} | <a href="">Ссылка на фотографии</a> | <a href="">Данные пользователя</a></p>
</div>
<hr>
<form action="/application/change_status_approve/${application.id}" method="post">
    <input type="submit" value = "Одобрить"/>
</form>
<form action="/application/change_status_decline/${application.id}" method="post">
    <input type="submit" value = "Отказать"/>
</form>
<form action="/application/change_status_cancel/${application.id}" method="post">
    <input type="submit" value = "Неподходящие фото"/>
</form>
</#list>
<hr>

<form action="/application/create" method="post">
    <h3>Создать заявку</h3>
    Статус: <input type = "text" name = "state"/><br><br>
    Запрашиваемая сумма: <input type = "number" name = "requested_amount"/><br><br>
    Запрашиваемый период: <input type = "number" name = "requested_period"/><br><br>
    Одобренная сумма: <input type = "number" name = "approved_amount"/><br><br>
    Одобренный период: <input type = "number" name = "approved_period"/><br><br>
    Сумма окончательная: <input type = "number" name = "amount"/><br><br>
    Период окончательный: <input type = "number" name = "period"/><br><br>
    Идентификатор счета: <input type = "text" name = "account_id"/><br><br>
    Идентификатор договора: <input type = "text" name = "offer_id"/><br><br>
    Идентификатор ответственного сотрудника: <input type = "text" name = "employee_id"/><br><br>
    Идентификатор тарифа: <input type = "text" name = "tariff_id"/><br><br>
    Причина отказа: <input type = "text" name = "reject_reason"/><br><br>
    Дата одобрения: <input type = "text" name = "approved_at"/><br><br>
    Идентификатор клиента: <input type = "text" name = "client"/><br><br>
    <input type="submit" value = "Отправить заявку"/>
</form>




</body>
</html>