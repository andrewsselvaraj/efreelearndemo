<?php include('includes/header.php'); ?>
<?php include("../db/dbconnection.php")?>

        <!-- ******CONTENT****** --> 
        <div class="content container">
            <div class="page-wrapper">
                <header class="page-heading clearfix">
                    <h1 class="heading-title pull-left">Contact</h1>
                    <div class="breadcrumbs pull-right">
                        <ul class="breadcrumbs-list">
                            <li class="breadcrumbs-label">You are here:</li>
                            <li><a href="index.php">Home</a><i class="fa fa-angle-right"></i></li>
                            <li class="current">Contact</li>
                        </ul>
                    </div><!--//breadcrumbs-->
                </header> 
                <div class="page-content">
                    <div class="row">
                        <article class="contact-form col-md-8 col-sm-7  page-row">                            
                            <h3 class="title">Enter Question</h3>
                           
                            <form action="RegisterUserProcess.php"  method="POST">
							                                <div class="form-group name">
                                    <label for="name">pk_user_id </label>
                                    <input name="pk_user_id" type="text" class="form-control" placeholder="Enter Question">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">user_name </label>
                                    <input name="user_name" type="text" class="form-control" placeholder="Enter User Name">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">password </label>
                                    <input name="password" type="text" class="form-control" placeholder="Enter password">
                                </div>
				<div class="form-group name">
                                    <label for="name">email_id </label>
                                    <input name="email_id" type="text" class="form-control" placeholder="Enter email_id">
                                </div>
				<div class="form-group name">
                                    <label for="name">mobile_no </label>
                                    <input name="mobile_no" type="text" class="form-control" placeholder="Enter mobile_no">
                                </div>
				<div class="form-group name">
                                    <label for="name">current_designation </label>
                                    <input name="current_designation" type="text" class="form-control" placeholder="Enter current_designation">
                                </div>
				<div class="form-group name">
                                    <label for="name">current_role </label>
                                    <input name="current_role" type="text" class="form-control" placeholder="Enter Current Role">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">created_by </label>
                                    <input name="created_by" type="text" class="form-control" placeholder="created_by">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">created_datettime </label>
                                    <input name="created_datettime" type="text" class="form-control" placeholder="created_datettime">
                                </div>
								                                <div class="form-group name">
                                    <label for="name">modified_by </label>
                                    <input name="modified_by" type="text" class="form-control" placeholder="Modified By">
                                </div>

                                <div class="form-group name">
                                    <label for="name">modified_datetime </label>
                                    <input name="modified_datetime" type="text" class="form-control" placeholder="Modified Date Time">
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