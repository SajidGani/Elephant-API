<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New com.csc340.Elephants.API.Elephant</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
<h1>Add a New com.csc340.Elephants.API.Elephant</h1>

<form action="/elephants" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required><br>

    <label for="breed">Breed:</label>
    <input type="text" id="breed" name="breed" required><br>

    <label for="description">Description:</label>
    <textarea id="description" name="description" required></textarea><br>

    <label for="activeDate">Active Date:</label>
    <input type="date" id="activeDate" name="activeDate" required><br>

    <button type="submit">Add Elephant</button>
</form>
</body>
</html>
