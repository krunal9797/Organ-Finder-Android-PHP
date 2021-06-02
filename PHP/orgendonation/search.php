<?php 
	include "config.php";
	
	$sql = "SELECT * FROM donorreg WHERE id='$id' ";
	$r = mysqli_query($conn,$sql);
	$result = array();

	while($row = mysqli_fetch_array($r))
	{
		
		array_push($result,array(
        'd_name'=>$row['d_name'],
        'd_email'=>$row['d_email'],
        'd_bloodgroup'=>$row['d_bloodgroup'],
        'd_state'=>$row['d_state']
		));
		
	}

echo json_encode(array('result'=>$result));

mysqli_close($conn);

?>