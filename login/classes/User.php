<?php 
    require_once("Person.php");
    class User extends Person {
        function display()
        {
            echo "NAME: " . $this->name . "<br>" .
            "ADDRESS: " . $this->address;
        }
    }