 <?php

if(isset($_POST['search']))
{
    $valueToSearch = $_POST['valueToSearch'];
    // search in all table columns
    // using concat mysql function
    $query = "SELECT * FROM `donorreg` WHERE CONCAT(`id`, `d_name`, `d_email`, `d_pass`) LIKE '%".$valueToSearch."%'";
    $search_result = filterTable($query);
    
}

 else 
 {
    $query = "SELECT * FROM `donorreg`";
    $search_result = filterTable($query);
}

// function to connect and execute the query
function filterTable($query)
{
    $connect = mysqli_connect("localhost", "root", "", "orgendonation");
    $filter_Result = mysqli_query($connect, $query);
    return $filter_Result;
}

?>

<!DOCTYPE html>
<html>
    <head>
	 <link rel="stylesheet" type="text/css" href="css/main.css">
  
        <title>PHP HTML TABLE DATA SEARCH</title>
       
    </head>
    <body>
        
		<div class="container">
        <form action="view.php" method="post">
            <input type="text" name="valueToSearch" placeholder="Value To Search"><br><br>
            <input type="submit" name="search" value="Filter"><br><br>
            
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Password</th>
                </tr>

      <!-- populate table from mysql database -->
                <?php while($row = mysqli_fetch_array($search_result)):?>
                <tr>
                    <td><?php echo $row['id'];?></td>
                    <td><?php echo $row['d_name'];?></td>
                    <td><?php echo $row['d_email'];?></td>
                    <td><?php echo $row['d_pass'];?></td>
					<td><a class="btn btn-danger" href="deleteorgens.php?id=<?php echo $row['id']; ?>">Delete</a></td>
					<td><a class="btn btn-danger" href="generatepdfrow.php?id=<?php echo $row['id']; ?>">Report</a></td>
                </tr>
                <?php
				endwhile;
				?>
            </table>
        </form>
        </div>
    </body>
</html>