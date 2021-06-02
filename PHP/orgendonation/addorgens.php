  <?php
	  include 'config.php';
	  if(isset($_POST['submit']))
  {
			$orgens_name = $_POST['orgens_name'];
     
    //$sql = "insert into state(state_name) values('$state_name')";
	$sql = "INSERT INTO `orgens`(orgens_name) VALUES ('$orgens_name')";
    
    $res=mysqli_query($conn,$sql);
   if ($res==true)
   {
		echo "Insert successfully !";
		}
		else
		{
		echo "Error:". $sql . "<br>". $conn->error;
		}	
	}
		$conn->close();

?>
<!DOCTYPE html>
<html lang="en">

<meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:site" content="@pratikborsadiya">
    <meta property="twitter:creator" content="@pratikborsadiya">
    <meta property="og:type" content="website">
    <meta property="og:site_name" content="Vali Admin">
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme">
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin">
    <meta property="og:image" content="../blog/vali-admin/hero-social.png">
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <title>Add Organs</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="../../maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>
  <body class="app sidebar-mini rtl">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="dashboard.php">Organ Finder</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      
	  <!-- Navbar Right Menu-->
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

        
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage State</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="addstate.php"><i class="icon fa fa-caret-right"></i> Add State</a></li>
            <li><a class="treeview-item" href="viewstate.php"><i class="icon fa fa-caret-right"></i> View State</a></li>
          </ul>
        </li>

       <li class="treeview"><a class="app-menu__item" href="addorgens.php" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage Organs</span><i class="treeview-indicator fa fa-angle-right"></i></a>
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
          <h1><i class="fa fa-edit"></i>Manage Organs</h1>
        </div>
        <ul class="app-breadcrumb breadcrumb">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item">Forms</li>
          <li class="breadcrumb-item"><a href="#">Form Components</a></li>
        </ul>
      </div>
      <div class="row">
        <div class="col-md-12">
          <div class="tile">
            <div class="row">
              <div class="col-lg-6">
   

<form action="" method="POST">
  <fieldset>
    <legend>Add Organs:</legend>
    	Organs:<br>
    <input type="text" name="orgens_name" id="orgens_name" class="form-control"><br>
	<div class="tile-footer">
    <input type="submit" name="submit" value="submit" class="btn btn-primary">
  </fieldset>
</form>


				
				
            </div>
            
			   </div>
            </div>
          </div>
        </div>
      </div>
	  
    </main>
    <!-- Essential javascripts for application to work-->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="js/plugins/pace.min.js"></script>
    <!-- Page specific javascripts-->
    <!-- Google analytics script-->
    <script type="text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','../../www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>

  </body>

<!-- Mirrored from pratikborsadiya.in/vali-admin/form-components.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 16 Jul 2019 06:28:15 GMT -->
?>
</html>