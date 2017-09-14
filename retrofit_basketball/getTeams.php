<?php

require "db_connect.php";

$type = $_GET['get_team'];

	if($type == 'lakers'){
		$sql = "select * from lakers";
		$response = array();
		$result = mysqli_query($con,$sql);
		while ($row = mysqli_fetch_array($result)) {
			array_push($response,array('name'=>$row['name'],
									'rank'=>$row['rank'],
										'image_path'=>$row['image_path']));

		}
		echo json_encode($response);
	}

	else if($type == 'cleveland'){
		$sql = "select * from cleveland";
		$response = array();
		$result = mysqli_query($con,$sql);
		while ($row = mysqli_fetch_array($result)) {
			array_push($response,array('name'=>$row['name'],'rank'=>$row['rank'],'image_path'=>$row['image_path']));

		}
		echo json_encode($response);
	}
	mysqli_close($con);

	?>