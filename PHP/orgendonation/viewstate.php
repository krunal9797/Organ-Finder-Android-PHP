<?php 
include "config.php";
$sql = "SELECT * FROM donorreg";
//execute the query
$result = $conn->query($sql);?>

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
    <title>View State</title>
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
    <header class="app-header"><a class="app-header__logo" href="dashboard.html">OrganFinder</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
   
<!-- Navbar Right Menu-->
      <ul class="app-nav">
        <li class="app-search">
          <input class="app-search__input" type="search" placeholder="Search">
          <button class="app-search__button"><i class="fa fa-search"></i></button>
          
        </li>
    			<li class="app-nav">
				<a class="treeview-item" href="logout.php"><i class="glyphicon glyphicon-log-out"></i> Logout</a>
	
				</li>
	    		  
    </header>
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
      <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="admin.png" alt="">
        <div>
          <p class="app-sidebar__user-name"><b>Admin</b></p>
        </div>
      </div>
      
      <ul class="app-menu">
        <li><a class="app-menu__item active" href="dashboard.php"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">Dashboard</span></a></li>

	<li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-user">
    
      </i><span class="app-menu__label">Manage Request</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="viewrequestrec.php"><i class="icon fa fa-caret-right"></i> View Request</a></li>
          </ul>
        </li>

        
        <li class="treeview"><a class="app-menu__item" href="viewstate.php" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage State</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="addstate.php"><i class="icon fa fa-caret-right"></i> Add State</a></li>
            <li><a class="treeview-item" href="viewstate.php"><i class="icon fa fa-caret-right"></i> View State</a></li>
          </ul>
        </li>

       <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage Organs</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="addorgens.php"><i class="icon fa fa-caret-right"></i> Add Organs</a></li>
            <li><a class="treeview-item" href="vieworgens.php"><i class="icon fa fa-caret-right"></i> View Organs</a></li>
          </ul>
        </li>

        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage User</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="Userprofile.php"><i class="icon fa fa-caret-right"></i> Donor Profile</a></li>
        <li><a class="treeview-item" href="receipientprofile.php"><i class="icon fa fa-caret-right"></i> Receipient Profile</a></li> 
          </ul>
        </li>
		
		
		<li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label"> Users Reports</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="reports/RegDonorReport.php"><i class="icon fa fa-caret-right"></i> Donor Reports</a></li>
        <li><a class="treeview-item" href="reports/RegReceipientReport.php"><i class="icon fa fa-caret-right"></i> Receipient Reports</a></li>
        <li><a class="treeview-item" href="reports/ReqOrgansReport.php"><i class="icon fa fa-caret-right"></i> Request Organ Reports</a></li>
          </ul>
		  </li>
		  
		  <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i>
		<span class="app-menu__label">Organs Reports</span><i class="treeview-indicator fa fa-angle-right"></i></a>
        <ul class="treeview-menu">
        <li><a class="treeview-item" href="reports/EyeDonorReport.php"><i class="icon fa fa-caret-right"></i> Eye Donor Report</a></li>
        <li><a class="treeview-item" href="reports/HeartDonorReport.php"><i class="icon fa fa-caret-right"></i> Heart Donor Report</a></li>
        <li><a class="treeview-item" href="reports/LungDonorReport.php"><i class="icon fa fa-caret-right"></i>Lung Donor Report</a></li>
        <li><a class="treeview-item" href="reports/KidneyDonorReport.php"><i class="icon fa fa-caret-right"></i> Kidney Donor Report</a></li>
        <li><a class="treeview-item" href="reports/LiverDonorReport.php"><i class="icon fa fa-caret-right"></i> Liver Donor Report</a></li>
        <li><a class="treeview-item" href="reports/IntestinesDonorReport.php"><i class="icon fa fa-caret-right"></i> Intestines Donor Report</a></li>
        <li><a class="treeview-item" href="#"><i class="icon fa fa-caret-right"></i> Pancreas Donor Report</a></li>
        <li><a class="treeview-item" href="#"><i class="icon fa fa-caret-right"></i> Cornea Donor Report</a></li>
        <li><a class="treeview-item" href="#"><i class="icon fa fa-caret-right"></i> Tissue Donor Report</a></li>
		
          </ul>
		  </li>
		  
		  <li><a class="treeview-item" href="api.php"><i class="app-menu__icon fa fa-user"></i> API</a></li>
		  
	
      </ul>
    </aside>
    <main class="app-content">
      <div class="app-title">
        <div>
          <h1><i class="fa fa-edit"></i> View State</h1>
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
                <form>
                  <div class="form-group">
                    <label for="exampleSelect1">States</label>
					<div class="container">
		<h2>States</h2>
<table class="table">
	<thead>
		<tr>
		<th>ID</th>
		<th>State</th>
		<th>City</th>
		
	</tr>
	</thead>
	<tbody>	
		<?php
			if ($result->num_rows > 0) 
			{
				//output data of each row
				while ($row = $result->fetch_assoc())
					{	
				?>

					<tr>
					<td><?php echo $row['id']; ?></td>
					<td><?php echo $row['d_state']; ?></td>
					<td><?php echo $row['d_city']; ?></td>
					<td>
					<a class="btn btn-danger" href="deletestate.php?id=<?php echo $row['id']; ?>">Delete</a></td>
					</tr>	
					
		<?php		}
			}
		?>
	        	
	</tbody>
</table>
	</div>
</div>
                </div>
            </div>
          </div>
        </div>
      </div>
    </main>
    
</html>