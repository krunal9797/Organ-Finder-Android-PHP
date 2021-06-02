<?php 
		include 'config.php';

		if(isset($_POST['submit']))
		{
			$email = $_POST[email];
			$password = $_POST[password];

			$sql = "insert into login (email,password) values('$email','$password')";

			mysqli_query($conn,$sql);
			echo "Data inserted";
		}

	?>