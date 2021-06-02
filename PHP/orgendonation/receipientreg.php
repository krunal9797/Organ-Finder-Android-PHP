<?php
	
	include "config.php";
	
	$r_name=$_GET['r_name'];
	$r_email=$_GET['r_email'];
	$r_pass=$_GET['r_pass'];
	$r_dob=$_GET['r_dob'];
	$r_gender=$_GET['r_gender'];
	$r_bloodgroup=$_GET['r_bloodgroup'];
	$r_disease=$_GET['r_disease'];
	$r_state = $_GET['r_state'];
	$r_category = $_GET['r_category'];
	$r_city = $_GET['r_city'];
	$r_contact = $_GET['r_contact'];
	$result2 =array();

		$query ="SELECT * FROM recreg WHERE r_email='$r_email' ";
		$res = mysqli_query($conn,$query);
		if(mysqli_num_rows($res) > 0)
		{

			array_push($result2, array("status" => "false", "msg" => "user already exist"));
		}
		else
		{
			$sql="insert into recreg(r_name,r_email,r_pass,r_dob,r_gender,r_bloodgroup,r_disease,r_state,r_category,r_city,r_contact)values('$r_name','$r_email','$r_pass','$r_dob','$r_gender','$r_bloodgroup','$r_disease','$r_state','$r_category','$r_city','$r_contact')";

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