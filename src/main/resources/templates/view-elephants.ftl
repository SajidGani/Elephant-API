<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Elephants</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
<h1>All Elephants</h1>

<table>
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
                <a href="/elephants/update/${elephant.id}">Update</a>
                <a href="/elephants/delete/${elephant.id}">Delete</a>
            </td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
