<?php
class Pen{
    private $color;
    private $brand;
    private $size;
    private $type;

    function write(){
        return "This can write";
    }
    function draw(){
        return "This can draw";
    }
}

class Pencil extends Pen {

    function set_color($color){
        $this->color = $color;
    }
    function get_color(){
        return $this->color;
    }
}

//instance of pencil class
$pencil1 = new Pencil();
$pencil1->set_color("Yellow");

echo $pencil1->get_color();
echo "<br>";
echo $pencil1->write();
echo "<br>";
echo $pencil1->draw();