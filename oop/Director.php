<?php
require_once("Person.php");
class Director extends Person{

    function jobDescription(){
        echo "To make decisions";
    }
}