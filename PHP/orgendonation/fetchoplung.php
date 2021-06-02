<?php
include "config.php";

$query = "SELECT * FROM donorreg WHERE d_bloodgroup='O+' AND d_category='Lung' "; 

$res = mysqli_query($conn,$query);

$result = array();
 
while($row=mysqli_fetch_array($res))
{
	
array_push($result,
      array
	  (
	  'd_name'=>$row[1],
	  'd_email'=>$row[2],
	  'd_dob'=>$row[4],
	  'd_bloodgroup'=>$row[6],
	  'd_disease'=>$row[7],
	  'd_category'=>$row[9],
	  'd_contact'=>$row[11],
	  'd_state'=>$row[8],
	  'd_city'=>$row[10]
	));
}
 
echo json_encode(array("result"=>$result));
mysqli_close($conn);

?>