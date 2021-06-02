<?php
	
	include "config.php";
	
	$d_name=$_GET['d_name'];
	$d_email=$_GET['d_email'];
	$d_pass=$_GET['d_pass'];
	$d_dob=$_GET['d_dob'];
	$d_gender=$_GET['d_gender'];
	$d_bloodgroup=$_GET['d_bloodgroup'];
	$d_disease=$_GET['d_disease'];
	$d_state = $_GET['d_state'];
	$d_category = $_GET['d_category'];
	$d_city = $_GET['d_city'];
	$d_contact = $_GET['d_contact'];
	$result2 =array();

	$query ="SELECT * FROM donorreg WHERE d_email='$d_email' ";
	
	$res = mysqli_query($conn,$query);
		if(mysqli_num_rows($res) > 0)
		{

			array_push($result2, array("status" => "false", "msg" => "user already exist"));
		}
		else
		{
			$sql="insert into donorreg(d_name,d_email,d_pass,d_dob,d_gender,d_bloodgroup,d_disease,d_state,d_category,d_city,d_contact)values('$d_name','$d_email','$d_pass','$d_dob','$d_gender','$d_bloodgroup','$d_disease','$d_state','$d_category','$d_city','$d_contact')";

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