<?php

	include "config.php";
	
	$d_email=$_GET['d_email'];
	$d_pass=$_GET['d_pass'];

	
	$result1 = array();

	//$query = SELECT * FROM `donorreg` WHERE `d_email`  = '$d_email';
	$query = "SELECT * FROM donorreg WHERE d_email = '$d_email' ";
	$res = mysqli_query($conn,$query);

	if(mysqli_num_rows($res) > 0)
	{
		$query = "SELECT * FROM donorreg where d_email = '$d_email' and d_pass = '$d_pass' ";
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

