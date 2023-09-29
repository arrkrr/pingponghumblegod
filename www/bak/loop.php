<?php
$row = 5;

for ($i=1; $i<=$row; $i++){
    for ($j=1; $j<=$i; $j++){
        echo $j . " ";
    }
    echo "<br />";
}

for ($i=$row-1; $i>=1; $i--){
    for ($j=1; $j<=$i; $j++) {
        echo $j . " ";
    }
    echo "<br />";
}