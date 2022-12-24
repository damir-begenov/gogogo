<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>RUDA NEWS INFO</title>
</head>
<body>
<h1>News info</h1>
<b>Инфо : </b>${newss.company}<br>
<b>Инфо : </b>${newss.description}<br>
<b>Инфо : </b>${newss.industry}<br>
<b>Инфо : </b>${newss.time}<br>
<b>Инфо : </b>${newss.salary}<br>
<b>Author: <a href="/user/${newss.user.id}">${newss.user.email}</a><b></b></b>
<b>Phone number: <#if user.numberPhone??>${user.numberPhone}<#else>-</#if></b>
</form>



<hr>
</body>
</html>