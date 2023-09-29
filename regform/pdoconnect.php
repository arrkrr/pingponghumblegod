<?php
//data source name
$dsn = "mysql:host=localhost;port=3306;dbname=regform;user=root;charset=utf8mb4";

$pdo = new PDO($dsn);

$statement = $pdo->prepare("INSERT INTO info (firstname, lastname) VALUES (?, ?)");

$statement->execute(['Arkar', 'Mawthankyin']);
