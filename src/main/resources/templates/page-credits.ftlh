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
<h2>Кредиты</h2>
<hr>
<#list credits as credit>
<div>
    <p><${credit} </p>
</div>
<hr>
</#list>
<hr>

</body>
</html>