<?php

$favcolor = "purple";

switch($favcolor){
    case "red":
        echo "The dress is $favcolor";
        break;
    case "purple":
        echo "The dress is $favcolor";
        break;
    default: //similar to else
        echo "What to do?";
}
echo "<br>";
//loops
$x = 1;
while ($x < 10){
    echo"$x<br>";
    $x++;
}
var_dump($x);

do{
    echo "do while loop: $x<br>";
    $x++;
}while ($x <= 10);
var_dump($x);