<?php
class Database{

    public $connection;
    public function __construct(){
        $dsn = "mysql:host=localhost;port=3306;dbname=regform;user=root;charset=utf8mb4";

        $this->connection = new PDO($dsn);
    }

    public function query($query, $array = []){
        $statement = $this->connection->prepare($query);
        $statement->execute($array);
    }

}

