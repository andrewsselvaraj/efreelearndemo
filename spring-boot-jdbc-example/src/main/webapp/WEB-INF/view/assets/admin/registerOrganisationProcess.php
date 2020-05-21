
<?php include('includes/header.php'); ?>
    
        <!-- ******CONTENT****** --> 
        <div class="content container">
            <div class="page-wrapper">
                <header class="page-heading clearfix">
                    <h1 class="heading-title pull-left">LOGIN</h1>
                    <div class="breadcrumbs pull-right">
                        <ul class="breadcrumbs-list">
                            <li class="breadcrumbs-label">You are here:</li>
                            <li><a href="index.php">Home</a><i class="fa fa-angle-right"></i></li>
                            <li class="current">LOGIN</li>
                        </ul>
                    </div><!--//breadcrumbs-->
                </header> 
                <div class="page-content">
                    <div class="row">
                        <article class="contact-form col-md-8 col-sm-7  page-row">                            
                           

<?php include("../db/dbconnection.php")?>
<?php
$pk_SchoolId =$_POST["pk_SchoolId"];
$SchoolName =$_POST["SchoolName"];
$PrincipalName =$_POST["PrincipalName"];
$SchoolAddress  =$_POST["SchoolAddress"];
$City =$_POST["City"];
$State =$_POST["State"];
$Country =$_POST["Country"];
$Pincode =$_POST["Pincode"];
$Email =$_POST["Email"];
$Website =$_POST["Website"];
$ContactNo =$_POST["ContactNo"];
$createdby =$_POST["createdby"];
$lastupdatedby =$_POST["lastupdatedby"];
$lastupdateed =$_POST["lastupdateed"];
$status =$_POST["status"];



$sql = "INSERT INTO `school_info` (`pk_SchoolId`, `SchoolName`, `PrincipalName`, `SchoolAddress`, `City`, `State`, `Country`, `Pincode`, `Email`, `Website`, `ContactNo`, `createdby`, `lastupdatedby`, `lastupdateed`, `status`)";

$sql = $sql. " VALUES ('$pk_SchoolId', '$SchoolName', '$PrincipalName', '$SchoolAddress', '$City', '$State', '$Country', '$Pincode', '$Email', '$Website', '$ContactNo', '$createdby', '$lastupdatedby', '$lastupdateed', '$status') ";

echo $sql;


 if ($mysqli->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $mysqli->error;
}

echo "Inserted Successfully.<BR> Enter Questions <a href='enterquestions.php'>View All Users</a>";


?>                                                        
                        </article><!--//contact-form-->
                        <aside class="page-sidebar  col-md-3 col-md-offset-1 col-sm-4 col-sm-offset-1">
                            <!--<section class="widget has-divider">
                                <h3 class="title">Download Prospectus</h3>
                                <p>Donec pulvinar arcu lacus, vel aliquam libero scelerisque a. Cras mi tellus, vulputate eu eleifend at, consectetur fringilla lacus. Nulla ut purus.</p>
                                <a class="btn btn-theme" href="#"><i class="fa fa-download"></i>Download now</a>
                            </section>--><!--//widget-->   
                            
                            <section class="widget has-divider">
                                <h3 class="title">Postal Address</h3>
                                <p class="adr">
                                    <span class="adr-group">       
                                        <span class="street-address">Efreelearn.com Team</span><br>
                                        <span class="region">Nethaji colony , Velachery </span><br>
                                        <span class="postal-code">Chennai</span><br>
                                        <span class="country-name">INDIA</span>
                                    </span>
                                </p>
                            </section><!--//widget-->     
                            
                            <section class="widget">
                                <h3 class="title">All Enquiries</h3>
                                <p class="tel"><i class="fa fa-phone"></i>Tel: Will be updated soon</p>
                                <p class="email"><i class="fa fa-envelope"></i>Email: <a href="#">andrew_india@yahoo.com</a></p>
                            </section>   
                        </aside><!--//page-sidebar-->
                    </div><!--//page-row-->
                    <div class="page-row">
                        <article class="map-section">
                            <h3 class="title">How to find us</h3>
                            <div id="map"></div><!--//map-->
                        </article><!--//map-->
                    </div><!--//page-row-->
                </div><!--//page-content-->
            </div><!--//page-wrapper--> 
        </div><!--//content-->
    </div><!--//wrapper-->

    <!-- ******FOOTER****** --> 
<?php include('includes/footer.php'); ?>