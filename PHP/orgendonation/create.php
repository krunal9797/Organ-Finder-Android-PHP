<?php 
include "config.php";

// if the form's submit button is clicked, we need to process the form
	if (isset($_POST['submit']))
		{
			// get variables from the form
			$id = $_POST['id'];
			$d_name = $_POST['d_name'];
			$d_email  = $_POST['d_email '];
			$d_pass  = $_POST['d_pass'];
			$d_dob  = $_POST['d_dob '];
			$d_gender = $_POST['d_gender'];
			$d_bloodgroup = $_POST['d_bloodgroup'];
			$d_disease = $_POST['d_disease'];

		//write sql query

//		$sql = "INSERT INTO `users`(`firstname`, `lastname`, `email`, `password`, `gender`) VALUES ('$first_name','$last_name','$email','$password','$gender')";
		$sql = "INSERT INTO `donorreg` (`name`,`email',`pass`,'dob','gender' ,'blood','diseaase') VALUES  ('$d_name',`$d_email','$pass', '$d_dob', '$d_gender', '$d_bloodgroup', '$d_disease' )";

		// execute the query

		$result = $conn->query($sql);

		if ($result == TRUE) {
			echo "New record created successfully.";
		}else{
			echo "Error:". $sql . "<br>". $conn->error;
		}

		$conn->close();

	}



?>

<!DOCTYPE html>
<html>
<body>

<h2>Signup Form</h2>

<form action="" method="POST">
  <fieldset>
    <legend>Personal information:</legend>
    First name:<br>
    <input type="text" name="firstname">
    <br>
    Last name:<br>
    <input type="text" name="lastname">
    <br>
    Email:<br>
    <input type="email" name="email">
    <br>
    Password:<br>
    <input type="password" name="password">
    <br>
    Gender:<br>
    <input type="radio" name="gender" value="Male">Male
    <input type="radio" name="gender" value="Female">Female
    <br><br>
    <input type="submit" name="submit" value="submit">
  </fieldset>
</form>

</body>
</html>