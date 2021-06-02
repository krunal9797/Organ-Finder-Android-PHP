<?php
	include "config.php";

	$email1 =$_GET['email'];
	$birthday1 =$_GET['birthday'];
	$gender1 =$_GET['gender'];
	$height1 =$_GET['height'];
	$weight1 =$_GET['weight'];
	$lifestyle1 =$_GET['lifestyle'];
	$medical_condition1 =$_GET['medical_condition'];
	
	$sql="UPDATE profile SET birthday = '$birthday1', gender = '$gender1',
	                         height = '$height1', weight = '$weight1',
	                         lifestyle = '$lifestyle1', medical_condition = '$medical_condition1'
			WHERE email = '$email1' ";
	
	$res =mysqli_query($conn,$sql);

	$result =array();
	
	if($res)
	{
		array_push($result,
							array('msg'=>"Profile successful"
						));
	}
	else
	{
		array_push($result,
							array('msg'=>"profile failed"
						));
	}

	echo json_encode(array("result"=>$result));
	mysqli_close($conn);

?>