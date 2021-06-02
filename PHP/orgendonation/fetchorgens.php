<?php
include "config.php";

$query = "SELECT * FROM orgens"; 

$res = mysqli_query($conn,$query);

$result1 = array();
 
while($row=mysqli_fetch_array($res)){
	
array_push($result1,
      array(

			'orgens_name'=>$row[1],
			
			));
}
 
echo json_encode(array("result"=>$result1));
mysqli_close($conn);

?>