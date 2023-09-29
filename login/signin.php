<?php 
session_start();
include "data/data.php";

    if (isset($_POST['submit'])){

        //look for the pseudo and the password
        $key = $_POST['pseudo'];
        $password = $_POST['password'];
                
        $result = isset($persons[$key]) ? $persons[$key] : null;
        
        if ($result != null){
            if ($result->getPassword() == $password){
                $_SESSION['ok'] = 1;
                header("location:home.php");
            }
        }        
    }
?>