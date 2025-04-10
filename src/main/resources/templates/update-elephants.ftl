<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Elephant</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
<h1>Update Elephant Information</h1>

<p>Form Action URL: /elephants/update/${elephant.id}</p>
<form action="/elephants/update/${elephant.id}" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${elephant.name}" required><br>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" value="${elephant.age}" required><br>

    <label for="breed">Breed:</label>
    <input type="text" id="breed" name="breed" value="${elephant.breed}" required><br>

    <label for="description">Description:</label>
    <textarea id="description" name="description" required>${elephant.description}</textarea><br>

    <label for="activeDate">Active Date:</label>
    <input type="date" id="activeDate" name="activeDate" value="${elephant.activeDate}" required><br>

    <button type="submit">Update Elephant</button>
</form>

<br>
<a href="/elephants/view">Back to Elephant List</a>
</body>
</html>
