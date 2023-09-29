<?php

//named function

//function printHello($name, $birthDate){
//    echo "Hello $name, you were born on $birthDate . <br />";
//}
//printHello("arkar", 28032004);
//printHello("minthant", "28th March 2004");
//printHello("kyaw", true);


//readline only works in terminal
$num1 = readline("PLease enter num1: ");
$num2 = readline("Please enter num2: ");
$ope = readline("Please enter your operator ie.+ - * /: ");

function add($num1, $num2){
    echo "The result of " . $num1 . " + " . $num2 . " is " . $num1+$num2;
}
function subtract($num1, $num2){
    echo "The result of " . $num1 . " - " . $num2 . " is " . $num1-$num2;
}
function multiply($num1, $num2){
    echo "The result of " . $num1 . " * " . $num2 . " is " . $num1*$num2;
}
function divide($num1, $num2){
    echo "The result of " . $num1 . " / " . $num2 . " is " . $num1/$num2;
}

switch ($ope){
    case "+":
        add($num1, $num2);
        break;
    case "-":
        subtract($num1, $num2);
        break;
    case "*":
        multiply($num1, $num2);
        break;
    case "/":
        divide($num1, $num2);
        break;
    default:
        echo "Invalid input";
}