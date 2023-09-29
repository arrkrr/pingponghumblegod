<?php
require_once("Person.php");
class Staff extends Person{
    function jobDescription(){
        echo "Work at office";
    }
}