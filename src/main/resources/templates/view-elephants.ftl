<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Elephants</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .card {
            transition: transform 0.3s;
        }
        .card:hover {
            transform: scale(1.05);
        }
        .navbar {
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
        }
        .container {
            padding-top: 50px;
        }
        table {
            width: 100%;
            margin-top: 30px;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f8f9fa;
        }
        td a {
            margin-right: 10px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="/index.html">Animal Gallery</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="/index.html">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="/add-elephant.html">Add Elephant</a></li>
                <li class="nav-item"><a class="nav-link" href="/about.html">About</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container text-center">
    <h1 class="mb-4">All Elephants</h1>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Breed</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <#list elephants as elephant>
            <tr>
                <td>${elephant.id}</td>
                <td>${elephant.name}</td>
                <td>${elephant.age}</td>
                <td>${elephant.breed}</td>
                <td>${elephant.description}</td>
                <td>
                    <a href="/elephants/update/${elephant.id}" class="btn btn-warning btn-sm">Update</a>
                    <a href="/elephants/delete/${elephant.id}" class="btn btn-danger btn-sm">Delete</a>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>

<footer class="text-center mt-5 py-3 bg-dark text-light">
</footer>

</body>
</html>
