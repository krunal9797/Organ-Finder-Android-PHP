<?php
	include "config.php";
	
	$email1 =$_GET['email'];
	$password1 =$_GET['password'];
	$fname1 =$_GET['fname'];
	$lname1 =$_GET['lname'];

	$result2 =array();

	$query ="SELECT * FROM login WHERE email='$email1' ";
	$res = mysqli_query($conn,$query);

	if(mysqli_num_rows($res) > 0){

		array_push($result2, array("status" => "false", "msg" => "user already exist"));
	}

	else{
		$query="INSERT INTO login(email,password,fname,lname) 
			VALUES('$email1','$password1','$fname1','$lname1') ";
	
		$res =mysqli_query($conn,$query);

		if($res){

			$query= "INSERT INTO profile(email) VALUES('$email1') " ;
			$res =mysqli_query($conn,$query);

			array_push($result2, array("status" => "true", "msg" => "signup successful"));
		}
		else {
			array_push($result2, array("status" => "false", "msg" => "signup failed"));
		}
		
	}

	echo json_encode(array("result2"=>$result2));

	mysqli_close($conn);
?>