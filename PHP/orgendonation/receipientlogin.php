<?php

	include "config.php";
	
	$r_email=$_GET['r_email'];
	$r_pass=$_GET['r_pass'];

	
	$result1 = array();

	//$query = SELECT * FROM `donorreg` WHERE `r_email`  = '$r_email';
	$query = "SELECT * FROM recreg WHERE r_email = '$r_email' ";
	$res = mysqli_query($conn,$query);

	if(mysqli_num_rows($res) > 0)
	{
		$query = "SELECT * FROM recreg where r_email = '$r_email' and r_pass = '$r_pass' ";
		$res = mysqli_query($conn,$query);

		if(mysqli_num_rows($res) >0)
		{
			array_push($result1, array("status" => "true", "msg" => "login success"));
		}
		else
		{
			array_push($result1, array("status" => "false", "msg" => "incorrect password"));
		}
	}

	else
	{
		array_push($result1, array("status" => "false", "msg" => "user not found"));
	}

	echo json_encode(array("result1"=>$result1));

	mysqli_close($conn);

		
?>

