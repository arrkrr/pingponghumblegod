<?php

abstract class Person{
    protected $name;
    protected $birthday;
    protected $size;
    protected $sex;

    function getName(){
        return $this->name;
    }
    function getBirthday(){
        return $this->birthday;
    }
    function getSize(){
        return $this->size;
    }
    function getSex(){
        return $this->sex;
    }
    function setName($name){
        $this->name = $name;
    }
    function setBirthday($birthday){
        $this->birthday = $birthday;
    }
    function setSize($size){
        $this->size = $size;
    }
    function setSex($sex){
        $this->sex = $sex;
    }
    function display(){
        return "INFORMATION <br>
        <br> Name: ".$this->name .
        "<br>Birthday: ".$this->birthday .
            "<br>Size: ".$this->size .
            "<br>Sex: ".$this->sex ;
    }
    //this abstract function must be implemented on each class that has extended the parent class called Person
    abstract function jobDescription();
}