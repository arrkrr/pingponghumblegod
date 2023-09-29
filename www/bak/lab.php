<?php

$strng = "Catcher in the Rye";
//echo $strng;

$picked = 6;
$num = 45.67;

switch($picked){
    case 1:
        echo strlen($strng);
        break;
    case 2:
        echo str_word_count($strng);
        break;
    case 3:
        echo strrev($strng);
        break;
    case 4:
        echo (sqrt($num));
        break;
    case 5:
        echo (round($num));
        break;
    case 6:
        echo (intval($num));
        break;
    default:
        echo"Choose your function.";
}
