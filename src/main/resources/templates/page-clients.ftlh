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
<h2>Все клиенты</h2>
<#list clients as client>
<div>
    <p><b>${client}</b> | <a href="">Ссылка на фотографии</a> </p>
</div>
<hr>
</#list>


<!--<form action="/creditApplication/create" method="post">
    <h3>Создать заявку</h3>
    Имя: <input type = "text" name = "first_name"/><br><br>
    Фамилия: <input type = "text" name = "second_name"/><br><br>
    <input type="submit" value = "Отправить заявку"/>
</form>-->

</body>
</html>