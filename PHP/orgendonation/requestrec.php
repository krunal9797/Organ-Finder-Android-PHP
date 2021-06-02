<?php
	
	include "config.php";
	
	$r_name=$_GET['r_name'];
	$r_cnum=$_GET['r_cnum'];
	$r_orgen=$_GET['r_orgen'];
	$r_bloodgroup=$_GET['r_bloodgroup'];
	$r_disease=$_GET['r_disease'];
	$r_description=$_GET['r_description'];
	$result2 =array();

	$query ="SELECT * FROM request"; 
	$res = mysqli_query($conn,$query);
	if(mysqli_num_rows($res) > 0)
	{
			array_push($result2, array("status" => "false", "msg" => "user already exist"));
		}
		else
		{
			$sql="insert into request(r_name,r_cnum,r_orgen,r_bloodgroup,r_disease,r_description)values('$r_name','$r_cnum','$r_orgen','$r_bloodgroup','$r_disease','$r_description')";

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