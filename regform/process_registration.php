<?php
//declare variables to catch errors
$fnameErr = $lnameErr = $statusErr = $companyErr = $emailErr = $areaCodeErr = $phoneErr = "";

//declare variables for the form data
$fname = $lname = $status = $company = $email = $areaCode= $phone = "";

if($_SERVER["REQUEST_METHOD"] == "POST") {
    if (empty($_POST["first_name"])) {
        $fnameErr = "Firstname is required.";
    } else {
        $fname = $_POST["first_name"];
    }

    $lname = $_POST["last_name"];
    $status = $_POST["status"];
    $company = $_POST["company"];
    $email = $_POST["email"];
    $areaCode = $_POST["area_code"];
    $phone = $_POST["phone"];
    $fullNumber = $areaCode . $phone;

    require_once('Database.php');
    $db = new Database();
    $db->query("INSERT INTO info (firstname, lastname, status, company, email, phone) VALUES (?, ?, ?, ?, ?, ?)", [$fname, $lname, $status, $company, $email, $fullNumber]);

    echo $fname . "<br />";
    echo $lname . "<br />";
    echo $status . "<br />";
    echo $company . "<br />";
    echo $email . "<br />";
    echo $areaCode . "<br />";
    echo $phone . "<br />";
}

function test_input($data)
{
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);
    return $data;
}