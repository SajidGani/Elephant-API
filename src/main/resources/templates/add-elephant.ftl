<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Elephant</title>
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
                <li class="nav-item"><a class="nav-link" href="/about.html">About</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container text-center">
    <h1 class="mb-4">Add a New Elephant</h1>

    <form action="/add-elephant" method="POST" class="mx-auto" style="max-width: 600px;">
        <div class="mb-3">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required><br>
        </div>

        <div class="mb-3">
            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required><br>
        </div>

        <div class="mb-3">
            <label for="breed">Breed:</label>
            <input type="text" id="breed" name="breed" required><br>
        </div>

        <div class="mb-3">
            <label for="description">Description:</label>
            <textarea id="description" name="description" required></textarea><br>
        </div>

        <div class="mb-3">
            <label for="activeDate">Active Date:</label>
            <input type="date" id="activeDate" name="activeDate" required><br>
        </div>

        <button type="submit" class="btn btn-primary">Add Elephant</button>
    </form>

    <div class="mt-4">
        <a href="/index.html" class="btn btn-secondary">Back to Home</a>
    </div>
</div>

<footer class="text-center mt-5 py-3 bg-dark text-light">
</footer>

</body>
</html>

<script>
    document.getElementById('activeDate').value = new Date().toISOString().split('T')[0];
</script>
