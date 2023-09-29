<?php
$phone = array("arkar"=>"0809821647", "chan thar"=>"0807478345", "songnam"=>"0809314532", "jousha"=>"0804328124", "edward"=>"0905425189");
$name = readline("Please select a name from the list below: 
arkar
chan thar
songnam
jousha
edward");

foreach($phone as $name=>$val) {
    if (in_array($name, $phone, TRUE)){
        echo "You are calling $name with his phone number $val";
        $con = readline("Do you want to continue? enter: yes/no");
        if ($con == "yes"){
            echo "Dialing phone number $val";
        }elseif ($con = "no"){
            echo "Goodbye";
        }else{
            echo "invalid input";
        }
    }else{
        echo "The name you entered is not in the list";
    }

}
