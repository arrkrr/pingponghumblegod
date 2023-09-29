<?php

class Fruit{
    //properties
    public $name;
    public $color;
    public $weight;


    function __construct($name, $color){
        $this->name = $name;
        $this->color = $color;
}


    //Methods
    function setName($name){
        $this->name = $name;
    }
    function setColor($color){
        $this->color = $color;
    }
    function getColor(){
        return $this->color;
    }

}

$sweet = new Fruit("Mango", "Yellow");
//$notsweet = new Fruit();
//$sweet->setName("Coconut");
//$sweet->setColor("Pink");
//
//echo $sweet->name . "<br>";
//echo $sweet->getColor();
echo $sweet->color;