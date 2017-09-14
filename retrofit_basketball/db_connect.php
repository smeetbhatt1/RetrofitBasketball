<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "basketball";
// Create connection
$con= mysqli_connect($servername, $username, $password,$dbname);

// Check connection
if (!$con) {
die("Connection failed: ");
}
?>