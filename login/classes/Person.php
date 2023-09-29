<?php

    abstract class Person{
        protected $name;
        protected $address;
        protected $password;

        function __construct($name, $address)
        {
            $this->name = $name;
            $this->address = $address;
        }

        function getPassword(){
            return $this->password;
        }

        function setPassword($pass){
            $this->password = $pass;
            return $this;
        }

        abstract function display();
    }