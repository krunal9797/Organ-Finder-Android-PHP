<?php  
 function fetch_data()  
 {  
      $output = '';  
    include "../config.php";
     
    $sql = "SELECT * FROM donorreg Where d_category='eyes' ";  
      $result = mysqli_query($conn, $sql);  
    
      while($row = mysqli_fetch_array($result))  
      {       
      $output .= '<tr>  
                          <td>'.$row["id"].'</td>  
                          <td>'.$row["d_category"].'</td>  
                          <td>'.$row["d_name"].'</td>  
                          <td>'.$row["d_email"].'</td> 
                          <td>'.$row["d_dob"].'</td> 
                          <td>'.$row["d_gender"].'</td> 
                          <td>'.$row["d_bloodgroup"].'</td> 
                          <td>'.$row["d_disease"].'</td>  
                          <td>'.$row["d_city"].'</td>  
                          <td>'.$row["d_state"].'</td>  
                          <td>'.$row["d_contact"].'</td>  

                     </tr>  
                          ';  
      }  
    
    
      return $output;  
 }  
 if(isset($_POST["generate_pdf"]))  
 {  
      require_once('../tcpdf/tcpdf.php');  
      $obj_pdf = new TCPDF('P', PDF_UNIT, PDF_PAGE_FORMAT, true, 'UTF-8', false);  
      $obj_pdf->SetCreator(PDF_CREATOR);  
      $obj_pdf->SetTitle("Organ Finder");  
      $obj_pdf->SetHeaderData('', '', PDF_HEADER_TITLE, PDF_HEADER_STRING);  
      $obj_pdf->setHeaderFont(Array(PDF_FONT_NAME_MAIN, '', PDF_FONT_SIZE_MAIN));  
      $obj_pdf->setFooterFont(Array(PDF_FONT_NAME_DATA, '', PDF_FONT_SIZE_DATA));  
      $obj_pdf->SetDefaultMonospacedFont('helvetica');  
      $obj_pdf->SetFooterMargin(PDF_MARGIN_FOOTER);  
      $obj_pdf->SetMargins(PDF_MARGIN_LEFT, '10', PDF_MARGIN_RIGHT);  
      $obj_pdf->setPrintHeader(false);  
      $obj_pdf->setPrintFooter(true);  
      $obj_pdf->SetAutoPageBreak(TRUE, 10);  
      $obj_pdf->SetFont('helvetica', '', 8);  
      $obj_pdf->AddPage();  
      $content = '';  
      $content .= '  
      <h2 align="center">Organ Finder</h2>  
      <h4 align="center">Eyes Donor Reports</h4><br>
      <table border="1" cellspacing="0" cellpadding="1" class="table">  
           <tr>  
                 <th width="3%">Id</th>  
                               <th width="7%">Organ</th>  
                               <th width="15%">Name</th>  
                               <th width="15%">Email</th> 
                               <th width="8%">DOB</th>  
                               <th width="8%">Gender</th> 
                               <th width="5%">Bloodgroup</th>
                               <th width="10%">Disease</th>  
                               <th width="6%">City</th>  
                               <th width="12%">State</th>
                               <th width="10%">Contact</th>  
           </tr>  
      ';  
      $content .= fetch_data();  
      $content .= '</table>';  
      $obj_pdf->writeHTML($content);  
      $obj_pdf->Output('file.pdf', 'I');  
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
    <title>Register Receipient Reports</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="../css/main.css">
    <!-- Font-icon css-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="../../../maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>

  <body class="app sidebar-mini rtl">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="../dashboard.php">Organ Finder</a>
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
        <li><a class="app-menu__item active" href="../dashboard.php"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">Dashboard</span></a></li>

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
		  
		  <li><a class="treeview-item" href="../api.php"><i class="app-menu__icon fa fa-user"></i> API</a></li>
		  
	
      </ul>
    </aside>
	  
    <main class="app-content">
      <div class="app-title">
        <div>
          <h1><i class="fa fa-edit"></i> Eyes Donor Report</h1>

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
                  <div class="form-group">
                  <label for="exampleSelect1">Reports</label>
            			<div class="container">	
                 <h4 align="center">Eyes Donor Reports</h4><br /> 
                 <div class="table-responsive">  
                    <div class="col-md-12" align="right">
                     <form method="post">  
                          <input type="submit" name="generate_pdf" class="btn btn-success" value="Generate PDF" />  
                     </form>  
                     </div>
                     <br/>
                     <br/>
                     <table class="table table-bordered">  
                          <tr>  
                               <th width="5%">Organ</th>  
                               <th width="5%">Id</th>  
                               <th width="20%">Name</th>  
                               <th width="20%">Email</th> 
                               <th width="10%">DOB</th>  
                               <th width="5%">Gender</th>  
                               <th width="5%">Bloodgroup</th>  
                               <th width="20%">Disease</th>  
                               <th width="10%">City</th>  
                               <th width="10%">State</th>
                               <th width="15%">Contact</th>  
                          </tr>  
                     <?php  
                     echo fetch_data();  
                     ?>  
                     </table>  

                  	</div>
                  </div>
                </div>
            </div>
          </div>
        </div>
      </div>
    </main>
	</body>
	
</html>