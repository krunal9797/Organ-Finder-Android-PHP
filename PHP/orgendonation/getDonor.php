<?php

 	include "config.php";
	
	function getDonor()
	{
    $db = new DbConnect();
    // array for json response
    $response = array();
    $response["donor"] = array();
     
    // Mysql select query
    $result = mysql_query("SELECT * FROM  donorreg");
     
    while($row = mysql_fetch_array($result))
	{
        // temporary array to create single category
        $tmp = array();
        $tmp["id"] = $row["id"];
        $tmp["d_name"] = $row["d_name"];
        $tmp["d_bloodgroup"] = $row["d_bloodgroup"];
        $tmp["d_disease"] = $row["d_disease"];
        $tmp["d_name"] = $row["d_name"];
         
        // push category to final json array
        array_push($response["donor"], $tmp);
    }
     
    // keeping response header to json
    header('Content-Type: application/json');
     
    // echoing json result
    echo json_encode($response);
}
 
getDonor();
?>