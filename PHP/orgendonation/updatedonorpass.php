<?php
	
	include "config.php";

	$id = $_GET['id'];
	$d_email=$_GET['d_email'];
	$d_pass=$_GET['d_pass'];
	$result2 =array();

		$query ="SELECT * FROM donorreg WHERE d_email='$d_email' ";
		$res = mysqli_query($conn,$query);
		if(mysqli_num_rows($res) > 0)
		{

			array_push($result2, array("status" => "false", "msg" => "user already exist"));
		}
		else
		{
			$sql="UPDATE  donorreg SET 'id'='$id','d_pass'='$d_pass' WHERE 'd_email' = '$d_email' ";
			$res=mysqli_query($conn,$sql);
			$result=array();
			
			if($res)
			{
				array_push($result,
									array('status'=>1,
										'msg'=>"Registration Succesfully.."));
			}
			else
			{
				array_push($result,
									array('status'=>0,
									'msg'=>"Registration unsucces,TRY Again"));
			}
		}	
			
	
	echo json_encode(array("result"=>$result2));

	mysqli_close($conn);
	
	
?>