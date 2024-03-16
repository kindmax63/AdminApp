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
<h2>Все клиенты</h2>
<hr>
<#list clients as client>
<div>
    <p><b>${client}</b>  </p>
</div>
<hr>

<#--<form action="/client/edit/${client.id}" method="post">
    <h3>Изменить данные клиента</h3>
    Имя: <input type = "text" name = "first_name"/><br><br>
    Отчетство: <input type = "text" name = "patronymic"/><br><br>
    Фамилия: <input type = "text" name = "surname"/><br><br>
    Пол: <input type = "text" name = "sex"/><br><br>
    Дата рождения: <input type = "date" name = "birthday"/><br><br>
    Соц. статус: <input type = "text" name = "social_status"/><br><br>
    Зарплата: <input type = "number" name = "salary"/><br><br>
    Должность: <input type = "text" name = "employment_status"/><br><br>
    Место работы: <input type = "text" name = "job_position"/><br><br>
    Срок работы: <input type = "text" name = "length_of_work"/><br><br>
    Адрес работы: <input type = "text" name = "company_address"/><br><br>
    Направление работы: <input type = "text" name = "working_industry"/><br><br>
    Город: <input type = "text" name = "city"/><br><br>
    Область: <input type = "text" name = "district"/><br><br>
    Улица: <input type = "text" name = "street"/><br><br>
    Дом: <input type = "text" name = "house"/><br><br>
    Квартира: <input type = "text" name = "appartment"/><br><br>
    Состояние в браке: <input type = "text" name = "marriage_status"/><br><br>
    Тип договора: <input type = "text" name = "document_type"/><br><br>
    Номер договора: <input type = "text" name = "document_number"/><br><br>
    Количество детей: <input type = "number" name = "number_of_children"/><br><br>
    Серия паспорта: <input type = "text" name = "passport_series"/><br><br>
    Номер паспорта: <input type = "text" name = "passport_number"/><br><br>
    Кто выдал паспорт: <input type = "text" name = "passport_who_issued"/><br><br>
    Когда был выдан паспорт: <input type = "text" name = "passport_when_issued"/><br><br>
    Электронная почта (логин): <input type = "text" name = "email_address"/><br><br>
    Телефон: <input type = "text" name = "mobile_number"/><br><br>
    <input type="submit" value = "Изменить данные"/>
</form>-->
</#list>

</body>
</html>