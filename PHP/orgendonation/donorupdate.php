<?php
	
	include "config.php";
	
	$d_id = $_POST['d_id'];
	$d_name=$_POST['d_name'];
	$d_email=$_POST['d_email'];
	$d_disease=$_POST['d_disease'];
	$d_category = $_POST['d_category'];
	$d_contact = $_POST['d_contact'];
	$result =array();

	$update_query = "UPDATE donorreg SET d_name= '$d_name', d_email = '$d_email', d_contact='$d_contact', d_category = '$d_category',d_disease = '$d_disease' WHERE d_id = '$d_id'";
	$result=mysqli_query($conn,$update_query); 
	
	if($result>0)
	{
		$fetchuser = mysqli_query($conn,"SELECT d_id,d_name,d_email,d_contact,d_category,d_disease FROM donorreg WHERE d_email='$d_email'");
		
		if(mysqli_num_rows($fetchuser)>0)
		{
			while($row=$fetchuser->fetch_assoc())
			{
				$response["donorreg"]=$row;
			}
				$response['error'] = "200";
				$response['message']="user update sucess";
			
		}
			else
			{
				$response["donorreg"]=(object)[];
				$response['error']="400";
				$response['message']="user update but details not fetch";
			}
		}
		else
		{
			$response["donorreg"]=(object)[];
			$response['error']="400";
			$response['message']="user update but detail not fetch";
		}
	
		

echo json_encode($response);
		
	mysqli_close($conn);
	
	?>
	
	