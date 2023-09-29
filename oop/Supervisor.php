<?php
require_once("Person.php");
class Supervisor extends Person{

    function jobDescription(){
        echo "To supervise";
    }
}