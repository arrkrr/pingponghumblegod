<?php

    require("./classes/User.php");

    //creation of three users
    $user1 = new User("rindra", "D-10 Saraburi");
    $user1->setPassword("rindra");

    $user2 = new User("admin", "Thailand");
    $user2->setPassword("admin");


    $user3 = new User("supervisor", "Bangkok");
    $user3->setPassword("supervisor");

    //array of users
    $persons = [
        "user" => $user1,
        "admin" => $user2,
        "supervisor" => $user3
    ];

