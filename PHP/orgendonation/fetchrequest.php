<?php
include "config.php";

$query = "SELECT * FROM request"; 

$res = mysqli_query($conn,$query);

$result = array();
 
while($row=mysqli_fetch_array($res)){
	
array_push($result,
      array(
	  'r_name'=>$row[1],
			'r_bloodgroup'=>$row[2],
			'r_orgen'=>$row[3],
			'r_disease'=>$row[4],
			'r_description'=>$row[5],
			));
}
 
echo json_encode(array("result"=>$result));
mysqli_close($conn);

?>