<!DOCTYPE html>
<html lang="en">
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
</body>
</html>