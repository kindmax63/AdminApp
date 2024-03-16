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
<h2>Фотографии клиентов</h2>
<hr>
<#list photos as photo>
    <div>
        <p> ${photo} | <a href="/client_photos/${photo.id}">Ссылка на фотографию</a> </p>
    </div>
    <hr>
    <form action="/photos/change_status_approve/${photo.id}" method="post">
        <input type="submit" value = "Одобрить"/>
    </form>
    <form action="/photos/change_status_decline/${photo.id}" method="post">
        <input type="submit" value = "Отказать"/>
        Причина отмены: <input type = "text" name = "reason"/><br><br>
    </form>
</#list>
<hr>


</body>
</html>