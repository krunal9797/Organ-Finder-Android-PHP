<?php 

	include "config.php";

    $id=$_POST['id'];
    $d_name=$_POST['d_name'];
    $d_email=$_POST['d_email'];
    $d_disease=$_POST['d_disease'];
    $d_contact=$_POST['d_contact'];

    $update_query="UPDATE donorreg SET d_name='$d_name', d_email='$d_email',d_disease=$d_disease,d_contact=$d_contact WHERE id='$id'";
    $result=mysqli_query($conn,$update_query);
    

    if($result>0){

      $fetchuser=mysqli_query($con,"SELECT id, d_name, d_email,d_disease,d_contact FROM user WHERE email='$email'");

    if(mysqli_num_rows($fetchuser)>0)
	{

      while($row=$fetchuser->fetch_assoc())
	  {
        $response["user"]=$row;
        }
        $response['error']="200";
        $response['message']="user update success";
      }
    else{
      $response["user"]=(object)[];
      $response['error']="400";
      $response['message']="user update but detail not fetch";

    }

    }
    else{
      $response["user"]=(object)[];
      $response['error']="400";
      $response['message']="user update failed";
    }
  	


  	echo json_encode($response);

 ?>