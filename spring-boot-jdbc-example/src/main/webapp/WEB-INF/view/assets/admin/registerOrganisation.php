<?php include('includes/header.php'); ?>
<?php include("../db/dbconnection.php")?>

        <!-- ******CONTENT****** --> 
        <div class="content container">
            <div class="page-wrapper">
                <header class="page-heading clearfix">
                    <h1 class="heading-title pull-left">Enter Organisation Details</h1>
                    <div class="breadcrumbs pull-right">
                        <ul class="breadcrumbs-list">
                            <li class="breadcrumbs-label">You are here:</li>
                            <li><a href="index.php">Home</a><i class="fa fa-angle-right"></i></li>
                            <li class="current">Enter Organisation Details</li>
                        </ul>
                    </div><!--//breadcrumbs-->
                </header> 
                <div class="page-content">
                    <div class="row">
                        <article class="contact-form col-md-8 col-sm-7  page-row">                            
                            <h3 class="title">Enter Organisation Details</h3>
                           
                            <form action="registerOrganisationProcess.php"  method="POST">
							                                <div class="form-group name">
                                    <label for="name">pk_SchoolId </label>
                                    <input name="pk_SchoolId" type="text" class="form-control" placeholder="Enter pk_SchoolId">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">SchoolName </label>
                                    <input name="SchoolName" type="text" class="form-control" placeholder="Enter SchoolName">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">PrincipalName </label>
                                    <input name="PrincipalName" type="text" class="form-control" placeholder="PrincipalName">
                                </div>
				<div class="form-group name">
                                    <label for="name">SchoolAddress </label>
                                    <input name="SchoolAddress" type="text" class="form-control" placeholder="Enter SchoolAddress">
                                </div>
				<div class="form-group name">
                                    <label for="name">City </label>
                                    <input name="City" type="text" class="form-control" placeholder="Enter City">
                                </div>
				<div class="form-group name">
                                    <label for="name">State</label>
                                    <input name="State" type="text" class="form-control" placeholder="Enter State">
                                </div>
				<div class="form-group name">
                                    <label for="name">Country </label>
                                    <input name="Country" type="text" class="form-control" placeholder="Enter Country">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">Pincode </label>
                                    <input name="Pincode" type="text" class="form-control" placeholder="Pincode">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">Email </label>
                                    <input name="Email" type="text" class="form-control" placeholder="Email">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">Website</label>
                                    <input name="Website" type="text" class="form-control" placeholder="Website">
                                </div>

                                <div class="form-group name">
                                    <label for="name">ContactNo </label>
                                    <input name="ContactNo" type="text" class="form-control" placeholder="ContactNo">
                                </div>
								
								<div class="form-group name">
                                    <label for="name">createdby </label>
                                    <input name="createdby" type="text" class="form-control" placeholder="createdby">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">lastupdatedby </label>
                                    <input name="lastupdatedby" type="text" class="form-control" placeholder="lastupdatedby">
                                </div>

                                <div class="form-group name">
                                    <label for="name">lastupdateed</label>
                                    <input name="lastupdateed" type="text" class="form-control" placeholder="lastupdateed">
                                </div>
								
								                                <div class="form-group name">
                                    <label for="name">status</label>
                                    <input name="status" type="text" class="form-control" placeholder="status">
                                </div>
								
								
                                <button type="submit" class="btn btn-theme" >Register User</button>
                            </form>                  
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
                                        <span class="street-address">College Green</span><br>
                                        <span class="region">56 College Green Road</span><br>
                                        <span class="postal-code">BS16 AP18</span><br>
                                        <span class="country-name">UK</span>
                                    </span>
                                </p>
                            </section><!--//widget-->     
                            
                            <section class="widget">
                                <h3 class="title">All Enquiries</h3>
                                <p class="tel"><i class="fa fa-phone"></i>Tel: 0800 123 4567</p>
                                <p class="email"><i class="fa fa-envelope"></i>Email: <a href="#">enquires@website.com</a></p>
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
       <div id="insertSuccess"></div>

    <!-- ******FOOTER****** --> 
<?php include('includes/footer.php'); ?>