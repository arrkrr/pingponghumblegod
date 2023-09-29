<?php
class Car{
    private $color;
    private $model;
    public $brand;
    private $category;

    public function __construct($color, $brand){
        $this->color = $color;
        $this->brand = $brand;
        $this->category = "Race car";
        $this->model = 2013;
    }
    public function start(){

    }
    public function stop(){

    }
    public function airCon(){

    }
    public function gearUp(){

    }
    public function gearDown(){

    }
    public function information(){
        return "BRAND: " . $this->brand . "<br> COLOR: " . $this->color . "<br> CATEGORY: " . $this->category . "<br> MODEL: " .$this->model;
    }
    public function get_color(){
        return $this->color;
    }
    public function set_color($color){
        $array_color = ["white", "black", "gray", "red"];
        if($color == in_array($color, $array_color)){
            $this->color = $color;
        }else{
            $this->color = "Unknown";
        }
    }
    public function get_model(){
        return $this->model;
    }
    public function set_model($model){
        $this->model = $model;
    }
    public function get_category(){
        return $this->category;
    }
    public function set_category($category){
        $this->category = $category;
    }
}

$car1 = new Car("Red", "BMW");
$car1->set_category("Sedan");
$car1->set_model(2018);
echo $car1->information();

echo "<br>----------------------------<br>";

$car2 = new Car("White", "Chevrolet");
$car2->set_category("Pickup");
$car2->set_model(2023);
echo $car2->information();