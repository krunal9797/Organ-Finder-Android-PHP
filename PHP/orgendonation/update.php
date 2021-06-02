<?php 
include "config.php";

// if the form's update button is clicked, we need to process the form
	if (isset($_POST['update'])) 
	{
		$id = $_POST['id'];
		$d_name = $_POST['d_name'];
		$d_email  = $_POST['d_email '];
		$d_pass  = $_POST['d_pass'];
		$d_dob  = $_POST['d_dob '];
		$d_gender = $_POST['d_gender'];
		$d_bloodgroup = $_POST['d_bloodgroup'];
		$d_disease = $_POST['d_disease'];

		// write the update query
		$sql = "UPDATE `donorreg` SET `name`='$d_name',`email`='$d_email',`pass`='$pass',`dob`='$d_dob',`gender`='$d_gender',`blood`='$d_bloodgroup',`diseaase`='$d_disease'  WHERE `id`='$id'";

		// execute the query
		$result = $conn->query($sql);

		if ($result == TRUE) {
			echo "Record updated successfully.";
		}else{
			echo "Error:" . $sql . "<br>" . $conn->error;
		}
	}


// if the 'id' variable is set in the URL, we know that we need to edit a record
if (isset($_GET['id'])) {
	$id = $_GET['id'];

	// write SQL to get user data
	$sql = "SELECT * FROM `donorreg` WHERE `id`='$id'";

	//Execute the sql
	$result = $conn->query($sql);

	if ($result->num_rows > 0) {
		
		while ($row = $result->fetch_assoc())
			{
		$id = $_POST['id'];
		$d_name = $_POST['d_name'];
		$d_email  = $_POST['d_email '];
		$d_pass  = $_POST['d_pass'];
		$d_dob  = $_POST['d_dob '];
		$d_gender = $_POST['d_gender'];
		$d_bloodgroup = $_POST['d_bloodgroup'];
		$d_disease = $_POST['d_disease'];
		}

	?>
		<h2>User Update Form</h2>
		<form action="" method="post">
		  <fieldset>
		    <legend>Personal information:</legend>
		     Name:<br>
		    <input type="text" name="name" value="<?php echo $d_name; ?>">
		    <input type="hidden" name="id" value="<?php echo $id; ?>">
		    <br>
		    Email:<br>
		    <input type="text" name="email" value="<?php echo $d_email; ?>">
		    <br>
		    Password:<br>
		    <input type="text" name="pass" value="<?php echo $d_pass; ?>">
		    <br>
		    Birthdate:<br>
		    <input type="text" name="dob" value="<?php echo $d_dob; ?>">
		    <br>
		    Gender:<br>
		    <input type="radio" name="gender" value="Male" <?php if($d_gender == 'Male'){ echo "checked";} ?> >Male
		    <input type="radio" name="gender" value="Female" <?php if($d_gender == 'Female'){ echo "checked";} ?>>Female
		    <br><br>
			BloodGrouo:<br>
		    <input type="text" name="blood" value="<?php echo $d_bloodgroup; ?>">
		    <br>
		    
			Disease:<br>
		    <input type="text" name="diseaase" value="<?php echo $d_disease; ?>">
		    <br>
		    
		    <input type="submit" value="Update" name="update">
		  </fieldset>
		</form>

		</body>
		</html>


	<?php
	} else{
		// If the 'id' value is not valid, redirect the user back to view.php page
		header('Location: Userprofile.php');
	}

}
?>