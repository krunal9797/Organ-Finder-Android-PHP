<!DOCTYPE html>
<html lang="en">
  
<!-- Mirrored from pratikborsadiya.in/vali-admin/blank-page.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 16 Jul 2019 06:28:18 GMT -->
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
    <title>API</title>
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
      <ul class="app-nav">
        <li class="app-search">
          <input class="app-search__input" type="search" placeholder="Search">
          <button class="app-search__button"><i class="fa fa-search"></i></button>
        </li>
        <!--Notification Menu-->
      
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

	<li class="treeview"><a class="app-menu__item" href="" data-toggle="treeview"><i class="app-menu__icon fa fa-user">
    
      </i><span class="app-menu__label">Manage Request</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="viewrequestrec.php"><i class="icon fa fa-caret-right"></i> View Request</a></li>
          </ul>
        </li>

        
        <li class="treeview"><a class="app-menu__item" href="" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage State</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="addstate.php"><i class="icon fa fa-caret-right"></i> Add State</a></li>
            <li><a class="treeview-item" href="viewstate.php"><i class="icon fa fa-caret-right"></i> View State</a></li>
          </ul>
        </li>

       <li class="treeview"><a class="app-menu__item" href="" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage Organs</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="addorgens.php"><i class="icon fa fa-caret-right"></i> Add Organs</a></li>
            <li><a class="treeview-item" href="vieworgens.php"><i class="icon fa fa-caret-right"></i> View Organs</a></li>
          </ul>
        </li>

        <li class="treeview"><a class="app-menu__item" href="" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label">Manage User</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="Userprofile.php"><i class="icon fa fa-caret-right"></i> Donor Profile</a></li>
        <li><a class="treeview-item" href="receipientprofile.php"><i class="icon fa fa-caret-right"></i> Receipient Profile</a></li> 
          </ul>
        </li>
		
		
		<li class="treeview"><a class="app-menu__item" href="" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i><span class="app-menu__label"> Users Reports</span><i class="treeview-indicator fa fa-angle-right"></i></a>
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="reports/RegDonorReport.php"><i class="icon fa fa-caret-right"></i> Donor Reports</a></li>
        <li><a class="treeview-item" href="reports/RegReceipientReport.php"><i class="icon fa fa-caret-right"></i> Receipient Reports</a></li>
        <li><a class="treeview-item" href="reports/ReqOrgansReport.php"><i class="icon fa fa-caret-right"></i> Request Organ Reports</a></li>
          </ul>
		  </li>
		  
		  <li class="treeview"><a class="app-menu__item" href="" data-toggle="treeview"><i class="app-menu__icon fa fa-user"></i>
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
          <h1><i class="fa fa-edit"></i>API</h1>
   
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
			  <form class="row">

		 <label><h4>Application Programming Interface</h4></label>		
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
					<th></th>
					<th></th>
					<th></th>
                    <th>View</th>
                </tr>
                <tr>
                    <td> 1 </td>
                    <td>Donor Login</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="donorlogin.php">View</a></td>
		        </tr>
				
				<tr>
                    <td> 2 </td>
                    <td>Receipient Login</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="receipientlogin.php">View</a></td>
		        </tr>
				
				<tr>
                    <td> 3 </td>
                    <td>Donor Register</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="donorreg1.php">View</a></td>
		        </tr>
				
				<tr>
                    <td> 4 </td>
                    <td>Receipient Register</td>
                    <td></td>
					<td></td>
					<td></td>
					<td><a class="btn btn-danger" href="receipientreg.php">View</a></td>
		        </tr>
				
				<tr>
                    <td> 5 </td>
                    <td>Donor Update</td>
					<td></td>
					<td></td>
					<td></td>
				   <td><a class="btn btn-danger" href="donerupdate.php">View</a></td>
		        </tr>
								
				<tr>
                    <td> 6 </td>
                    <td>Receipient Update</td>
                    <td></td>
					<td></td>
					<td></td>
					<td><a class="btn btn-danger" href="receipientupdate.php">View</a></td>
		        </tr>
				
				<tr>
                    <td> 7 </td>
                    <td>Request to Donor </td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="requestrec.php">View</a></td>
		        </tr>
				
				<tr>
                    <td> 8 </td>
                    <td>Request View</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchrequest.php">View</a></td>
		        </tr>
				
				  <! O positve and organs> 
				  
				 
				  
				<tr>
                    <td> 9 </td>
                    <td>O+  BloodGroup <br> Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchopeyes.php">View</a></td>
		        </tr>
				<tr>
                    <td> 10 </td>
                    <td>O+  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchopheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 11 </td>
                    <td>O+  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchoplung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 12 </td>
                    <td>O+  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchopkidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 13 </td>
                    <td>O+  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchopliver.php">View</a></td>
		        </tr>
				
				
				<!o nagative and organs>
				
				
				<tr>
                    <td> 14 </td>
                    <td>O-  BloodGroup <br> Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchoneyes.php">View</a></td>
		        </tr>
				
				<tr>
                    <td> 15 </td>
                    <td>O-  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchonheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 16 </td>
                    <td>O-  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchonlung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 17 </td>
                    <td>O-  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchonkidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 18 </td>
                    <td>O-  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchonliver.php">View</a></td>
		        </tr>
				
			 <!A+>

	
				<tr>
                    <td> 19 </td>
                    <td>A+  BloodGroup <br>  Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchapeyes.php">View</a></td>
		        </tr>
				<tr>
                    <td> 20 </td>
                    <td>A+  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchapheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 21 </td>
                    <td>A+  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchaplung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 22 </td>
                    <td>A+  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchapkidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 23 </td>
                    <td>A+  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchapliver.php">View</a></td>
		        </tr>
			
			<!A->

				    <td> 24 </td>
                    <td>A-  BloodGroup <br>  Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchaneyes.php">View</a></td>
		        </tr>
				<tr>
                    <td> 25 </td>
                    <td>A-  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchanheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 26 </td>
                    <td>A-  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchanlung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 27 </td>
                    <td>A-  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchankidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 28 </td>
                    <td>A-  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchanliver.php">View</a></td>
		        </tr>
			
				<!b+>

 

	<tr>
                    <td> 29 </td>
                    <td>B+  BloodGroup <br>  Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbpeyes.php">View</a></td>
		        </tr>
				<tr>
                    <td> 30 </td>
                    <td>B+  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbpheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 31 </td>
                    <td>B+  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbplung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 32 </td>
                    <td>B+  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbpkidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 33 </td>
                    <td>B+  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbpliver.php">View</a></td>
		        </tr>
			
			<!b->

	   <td> 34 </td>
                    <td>B-  BloodGroup <br>  Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbneyes.php">View</a></td>
		        </tr>
				<tr>
                    <td> 35 </td>
                    <td>B-  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbnheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 36 </td>
                    <td>B-  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbnlung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 37 </td>
                    <td>B-  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbnkidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 38 </td>
                    <td>B-  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbnliver.php">View</a></td>
		        </tr>
	
				 <!ab+>

				<tr>
                    <td> 39 </td>
                    <td>AB+  BloodGroup <br>  Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abpeyes.php">View</a></td>
		        </tr>
				<tr>
                    <td> 40 </td>
                    <td>AB+  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abpheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 41 </td>
                    <td>AB+  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abplung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 42 </td>
                    <td>AB+  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abpkidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 43 </td>
                    <td>AB+  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abpliver.php">View</a></td>
		        </tr>
			
	  <!ab>

 
				<td> 44 </td>
                    <td>AB-  BloodGroup <br>  Eyes Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abneyes.php">View</a></td>
		        </tr>
				<tr>
                    <td> 45 </td>
                    <td>AB-  BloodGroup <br> Heart Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abnheart.php">View</a></td>
		        </tr>
				<tr>
                    <td> 46 </td>
                    <td>AB-  BloodGroup <br> Lung Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abnlung.php">View</a></td>
		        </tr>
				<tr>
                    <td> 47 </td>
                    <td>AB-  BloodGroup <br> Kidney Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="abnkidney.php">View</a></td>
		        </tr>
				<tr>
                    <td> 48 </td>
                    <td>AB-  BloodGroup <br> Liver Donor</td>
					<td></td>
					<td></td>
					<td></td>
                    <td><a class="btn btn-danger" href="fetchbnliver.php">View</a></td>
		        </tr>
	
              
            </table>
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

<!-- Mirrored from pratikborsadiya.in/vali-admin/blank-page.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 16 Jul 2019 06:28:18 GMT -->
</html>