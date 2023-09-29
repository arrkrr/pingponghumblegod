<?php

require_once("Person.php");
require_once("Staff.php");
require_once("Faculty.php");
require_once("Director.php");
require_once("Supervisor.php");

//create an instance of Staff class

$staff1 = new Staff();
$staff1->setName("Arkar");
$staff1->setBirthday("March 28");
$staff1->setSize("M");
$staff1->setSex("Hetero");

$staff2 = new Staff();
$staff2->setName("Luna");
$staff2->setBirthday("May 2");
$staff2->setSize("S");
$staff2->setSex("Non-binary");

$dir1 = new Director();
$dir1->setName("Ko Chit KO");
$dir1->setBirthday("Nov 21");
$dir1->setSize("XL");
$dir1->setSex("Homo");

$sup1 = new Supervisor();
$sup1->setName("Rindra");
$sup1->setBirthday("Feb 21");
$sup1->setSize("L");
$sup1->setSex("Pan");

$faculty1 = new Faculty;
$faculty1->setName("Damien");
$faculty1->setBirthday("Nov 6");
$faculty1->setSize("M");
$faculty1->setSex("Sapio");

$faculty2 = new Faculty;
$faculty2->setName("Alex");
$faculty2->setBirthday("Sept 1");
$faculty2->setSize("M");
$faculty2->setSex("Bi");

echo $staff1->display();
echo "<br>";
$staff1->jobDescription();
echo "<br>";

echo $staff2->display();
echo "<br>";
$staff2->jobDescription();
echo "<br>";

echo $dir1->display();
echo "<br>";
$dir1->jobDescription();
echo "<br>";

echo $sup1->display();
echo "<br>";
$sup1->jobDescription();
echo "<br>";

echo $faculty1->display();
echo "<br>";
$faculty1->jobDescription();
echo "<br>";

echo $faculty2->display();
echo "<br>";
$faculty2->jobDescription();