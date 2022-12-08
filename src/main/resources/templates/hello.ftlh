<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/hello.css">
    <title>Title</title>
</head>
<body>
<h2>hello mafaka</h2>
<#list students as student>
    <div>
        <p class="tt"><b>${student.firstName}</b> ${student.email} руб. |
    </div>
<#else>
    <h3 class="tt">Товаров нет</h3>
</#list>
<br>
<hr>
<form action="/sex" method="get">
    Поиск по названию job: <input type="text" name="job"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list news as news>
    <div>
        <p ><b>${news.country}</b> ${news.salary} руб. |  <a href="/news/${news.id}">Подробнее</a>
            <img src="${news.image}" style="width: 150px;height: 150px" alt="">
    </div>
<#else>
    <h3 class="tt">Товаров нет</h3>
</#list>
<h3>Создать новый </h3>
    <form action="/sex/addStudent" method="post">
        Название объявления: <input type="text" name="firstName"/><br><br>
        Описание объявления: <input type="text" name="email"/><br><br>
        <input type="submit" value="Добавить товар"/>
    </form>
<br>
<hr>
<br>
<form action="/createvacancy" method="POST" class="regbox">
    <h1 class="tittle">Create an Employer Account</h1>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Country:</p>
        </div>
        <div class="col-8 ">
            <input type="text" id="country" name="country" required>
        </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Company:</p>
        </div>
        <div class="col-8 ">
            <input type="text" id="company" name="company" required>
        </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Industry:</p>
        </div>
        <div class="col-8 ">
            <input type="text" id="industry" name="industry" required>
        </div>
    </div>

    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Job:</p>
        </div>
        <div class="col-8 ">
            <select type="text" id="job" name="job" required>
                <option>Software</option>
                <option>Abuser</option>
                <option>Baker</option>
                <option>Seller-Consultant</option>
                <option>Selling</option>
                <option>CEO</option>
                <option>Professor</option>
                <option>Teaching</option>
                <option>Perfumer</option>
            </select>
        </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Time:</p>
        </div>
        <div class="col-8 ">
            <select name="time" id="time">
                <option>Part-time</option>
                <option>Full-time</option>
            </select>            </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Type:</p>
        </div>
        <div class="col-8 ">
            <select name="type" id="type">
                <option>Based</option>
                <option>Remote</option>
            </select>
        </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Salary:</p>
        </div>
        <div class="col-8 ">
            <input type="number" id="salary" name="salary">
        </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Image:</p>
        </div>
        <div class="col-8 ">
            <input type="text" id="image" name="image">
        </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Number of Employees:</p>
        </div>
        <div class="col-8 ">
            <input type="number" id="employees" name="employees">
        </div>
    </div>
    <div class="row ">
        <div class="col-3 ">
            <p class="labels">Describe the job:</p>
        </div>
        <div class="col-8 ">
            <input type="description" id="describe" name="description">
        </div>
    </div>
    <div class="confirm">
        <input type="submit" class="confirmbutton" onclick="alert('All information on DB!')" value="Submit">
    </div>

</form>
</body>
</html>