<html>
<head>
    <title>For Each Loop</title>
</head>
<body>

<?php
$carBrand = ["Toyota", "Honda", "Isuzu", "BMW"];
?>
<h1>Car Brands</h1>
<ul>
<?php
foreach($carBrand as $brand){
    if($brand == "Honda"){
        continue;
    }else{
        echo"<li>$brand</li>";
    }
}
?>

<?php foreach ($carBrand as $brand):
    if($brand == "Honda"){
     continue;
    }else{
    ?>
    <li><?php echo $brand;
    }?></li>

    <?php endforeach; ?>
</ul>
<body>
</html>