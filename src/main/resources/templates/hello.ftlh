<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>hello mafaka</h2>
<#list students as student>
    <div>
        <p><b>${student.firstName}</b> ${student.email} руб. |
    </div>
<#else>
    <h3>Товаров нет</h3>
</#list>
<h3>Создать новый </h3>
    <form action="/sex/addStudent" method="post">
        Название объявления: <input type="text" name="firstName"/><br><br>
        Описание объявления: <input type="text" name="email"/><br><br>
        <input type="submit" value="Добавить товар"/>
    </form>
</body>
</html>