<?php
include "config.php";

$query = "SELECT * FROM state"; 

$res = mysqli_query($conn,$query);

$result = array();
 
while($row=mysqli_fetch_array($res)){
	
array_push($result,
      array(

			'state_name'=>$row[1],
			));
}
 
echo json_encode(array("result"=>$result));
mysqli_close($conn);

?>