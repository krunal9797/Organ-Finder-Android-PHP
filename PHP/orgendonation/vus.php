<?php 
if(isset($_POST['search']))
{
    $valueToSearch = $_POST['valueToSearch'];
    // search in all table columns
    // using concat mysql function
    $query = "SELECT * FROM `donorreg` WHERE CONCAT(`id`, `d_name`, `d_email`, `d_pass`,'d_bloodgroup') LIKE '%".$valueToSearch."%'";
    $search_result = filterTable($query);
    
}
 else {
    $query = "SELECT * FROM `donorreg`";
    $search_result = filterTable($query);
}

// function to connect and execute the query
function filterTable($query)
{
	include 'config.php';
    $filter_Result = mysqli_query($conn, $query);
    return $filter_Result;
}
?>

<!DOCTYPE html>
<html lang="en">


<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:site" content="@pratikborsadiya">
    <meta property="twitter:creator" content="@pratikborsadiya">
    <!-- Open Graph Meta-->
    <meta property="og:type" content="website">
    <meta property="og:site_name" content="Vali Admin">
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme">
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin">
    <meta property="og:image" content="../blog/vali-admin/hero-social.png">
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <title>Donor User</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <!-- Font-icon css-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="../../maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>

  <body class="app sidebar-mini rtl">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="index.html">Organ Finder</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
        <li class="app-search">
          <input class="app-search__input" type="search" placeholder="Search">
          <button class="app-search__button"><i class="fa fa-search"></i></button>
        </li>

    </header>
    <!-- Sidebar menu-->

    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
      <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="../../s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg" alt="User Image">
        <div>

          <p class="app-sidebar__user-designation">Developer</p>
        </div>
      </div>
      <ul class="app-menu">
        <li><a class="app-menu__item" href="index.html"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">Dashboard</span></a></li>
        <li><a class="app-menu__item active" href="indexs.html" ><i class="app-menu__icon fa fa-pencil-square-o"></i><span class="app-menu__label">Manage State</span></a>
        <ul class="treeview-menu">
            <li><a class="treeview-item" href="index.html"><i class="icon fa fa-circle-o"></i>Add State</a></li>
			 <li><a class="treeview-item" href="index.html"><i class="icon fa fa-circle-o"></i>Seller List</a></li>
			 </ul>

        <li><a class="app-menu__item" href="index.html"><i class="app-menu__icon fa fa-comments"></i><span class="app-menu__label">Manage Organs</span></a>
        </li>
        
        <li class="treeview"><a class="app-menu__item" href="index.html" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage User</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="Userprofile.php"><i class="icon fa fa-caret-right"></i> User Profile</a></li>
            <li><a class="treeview-item" href="#"><i class="icon fa fa-caret-right"></i> Payment History</a></li>
          </ul>
        </li>
        
      </ul>
    </aside>
    <main class="app-content">
      <div class="app-title">
        <div>
          <h1><i class="fa fa-edit"></i>Donor User</h1>
        
        </div>
        <ul class="app-breadcrumb breadcrumb">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item"><a href="#">Manage Schedule</a></li>
        </ul>
      </div>
      <div class="row">
        <div class="col-md-12">
          <div class="tile">
            <div class="row">
              <div class="col-lg-6">
			  <div class="container">
			  <form action="vus.php" method="post">

			  <ul class="app-nav">
        <li class="app-search">
          <input class="app-search__input"type="text" name="valueToSearch" placeholder="Search">
          <button class="app-search__button" type="submit" name="search" value="Filter"><i class="fa fa-search"></i></button>
        </li>
		</ul>
		 <label><h4>Doner</h4></label>		
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Mobile No.</th>
                    <th>BirthDate</th>
                    <th>Gender</th>
                    <th>BloodGroup</th>
					<th>Organs</th>
                    <th>Disease</th>
                    <th>City</th>
                    <th>State</th>
                    <th></th>
                    <th></th>
                </tr>

      <!-- populate table from mysql database -->
                <?php while($row = mysqli_fetch_array($search_result)):?>
                <tr>
                    <td><?php echo $row['id'];?></td>
                    <td><?php echo $row['d_name'];?></td>
                    <td><?php echo $row['d_email'];?></td>
                    <td><?php echo $row['d_contact'];?></td>
                    <td><?php echo $row['d_dob'];?></td>
                    <td><?php echo $row['d_gender'];?></td>
                    <td><?php echo $row['d_bloodgroup'];?></td>
                    <td><?php echo $row['d_category'];?></td>
                    <td><?php echo $row['d_disease'];?></td>
                    <td><?php echo $row['d_city'];?></td>
                    <td><?php echo $row['d_state'];?></td>
					<td><a class="btn btn-danger" href="deletedonoruser.php?id=<?php echo $row['id']; ?>">Delete</a></td>
				
                </tr>
                <?php
				endwhile;
				?>
            </table>
        </form>
        </div>
				  
                </div>
            </div>
          </div>
        </div>
      </div>
    </main>
    
</html>