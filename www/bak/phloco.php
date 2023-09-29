<?php

$pb = [
    [
        'name' => 'Edward',
        'number' => '0851295451'
    ],
    [
        'name' => 'Toto',
        'number' => '0612345678'
    ],
    [
        'name' => 'Pete',
        'number' => '12345678'
    ],

];

$line = readline("Enter firstname: ");

echo $result = filter($pb, $line);
//var_dump($result);


function filter ($items, $line){

    $filteredValue = [];

    foreach ($items as $item) {
        if (strtolower($item['name']) === strtolower($line)) {
            $filteredValue = strtolower($line);
            break;
        }
    }
    return $filteredValue;
}

function message ($pb, $line){
        echo "You are calling $line with his phone number $pb['number']";
        $con = readline("Do you want to continue? enter: yes/no");
        if ($con == "yes"){
            echo "Dialing phone number $pb['number']";
        }elseif ($con = "no"){
            echo "Goodbye";
        }else{
            echo "invalid input";
        }
}
