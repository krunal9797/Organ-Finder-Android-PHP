<?php

	include "config.php";
	
	$breakfast1 = $_GET['breakfast'];
	$lunch1 = $_GET['lunch'];
	$evening1 = $_GET['evening'];
	$dinner1 = $_GET['dinner'];
	
	$sql = "insert into schedule(breakfast,lunch,evening,dinner) values ('$breakfast1','$lunch1','$evening1','$dinner1')";
	
	$res = mysqli_query($conn,$sql);
	$result = array();
	
	if($res)
	{
		array_push($result,
							array('status'=>1,
							'msg'=>"Schedule Updated"));
	}
	else
	{
		array_push($result,array('status'=>0,'msg'=>"Error updating schedule"));
	}
	
	echo json_encode(array("result"=>$result));
	
?>