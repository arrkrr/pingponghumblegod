<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Associative Array</title>
</head>
<body>
<?php
//key => value pair
$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43", "Paul"=>"51", "Bong"=>"25", "Pilate"=>"33");
foreach($age as $x => $val){
    if (strlen($x) >= 5){
        continue;
    }else{
        echo $x . ", " . $val . "<br>";
    }
}
?>
</body>
</html>