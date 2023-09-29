<?php
////define database variables
//DEFINE ('DB_USER','root');
//DEFINE ('DB_PASSWORD','');
//DEFINE ('DB_HOST', 'localhost');
//DEFINE ('DB_NAME', 'regform');
//
//$dbcon = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME);

//if ($dbcon->connect_error){
//    die("Connection failed: " . $dbcon->connect_error);
//}else{
//    echo "You are connected to the database";
//}

class Database{

    public $connection;
    public function __construct(){
        $dsn = "mysql:host=localhost;port=3306;dbname=regform;user=root;charset=utf8mb4";

        $this->connection = new PDO($dsn);
    }

    public function query($query){
        $statement = $this->connection->prepare($query);
        $statement->execute();
    }

}

//$c = new Database();
//$c->query("INSERT INTO info (Firstname) VALUES ('MikMik')");