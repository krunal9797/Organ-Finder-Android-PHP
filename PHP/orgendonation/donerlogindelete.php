<?php 
include "config.php";

// if the 'id' variable is set in the URL, we know that we need to edit a record
if (isset($_GET['id'])) 
{
	$id = $_GET['id'];

	// write delete query
	$sql = "DELETE FROM `donorlogin` WHERE `id`='$id'";

	// Execute the query

	$result = $conn->query($sql);

	if ($result == TRUE) {
		echo "Record deleted successfully.";
		header('Location: donorloginprofile.php');
	}else{
		echo "Error:" . $sql . "<br>" . $conn->error;
	}
}

?>