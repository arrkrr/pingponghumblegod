<?php
function urlIS($value){
    return $_SERVER['REQUEST_URI'] === $value;
}
