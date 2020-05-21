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
                            <h3 class="title">Get in touch</h3>
                            <p>We’d love to hear from you. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ut erat magna. Aliquam porta sem a lacus imperdiet posuere. Integer semper eget ligula id eleifend. </p>
                            <form action="questionProcess.php" method="post">
                                <div class="form-group name"><label for="name">School Name</label>

   <select name="SchoolId" class="form-control">
<?php 
$sql ="SELECT * FROM school_info";                                
$result = $mysqli->query($sql);
if ($result->num_rows > 0) {

 

	while($row=$result->fetch_assoc())
	{
	$pk_SchoolId=$row['pk_SchoolId'];
	$SchoolName=$row['SchoolName'];
	?>

	<option value="<?php echo $pk_SchoolId; ?>"><?php echo $pk_SchoolId.$SchoolName; ?></option>
	<?php
	}
}
else
{
echo "0 results";
}

?>
</select>
                                                                    </div><!--//form-group-->
                                <div class="form-group name"><label for="name">Subject Name</label>

   <select name="SubjectId" class="form-control">                                 
<?php
$sql ="SELECT * FROM subject_info";  
$result = $mysqli->query($sql);
if ($result->num_rows > 0) {
while($row=$result->fetch_assoc())
{
$pk_SubjectId=$row['pk_SubjectId'];
$SubjectName=$row['SubjectName'];
?>

<option value="<?php echo $pk_SubjectId; ?>"> <?php echo $SubjectName; ?> </option>
<?php
}
}
else
{
echo "0 results";
}
?>
</select>
                                                                    </div><!--//form-group-->

                                <div class="form-group name">
                                    <label for="name">Question </label>
                                    <input name="QuestionName" type="text" class="form-control" placeholder="Enter Question">
                                </div>

<!-Answer----------------------------------------------------->
                                <div class="form-group email">
                                    <label for="email">Answer 1</label>
                                    <input name="pk_answerid[]" type="text" class="form-control" placeholder=""><select name=pk_answerid_correct[]><option value="N"> N</option><option value="Y"> Y</option>
</select>
                                </div>
                                <div class="form-group email">
                                    <label for="email">Answer 2</label>
                                    <input name="pk_answerid[]" type="text" class="form-control" placeholder=""><select name=pk_answerid_correct[]><option value="N"> N</option><option value="Y"> Y</option>
</select>
                                </div>
                                <div class="form-group email">
                                    <label for="email">Answer 3</label>
                                    <input name="pk_answerid[]" type="text" class="form-control" placeholder=""><select name=pk_answerid_correct[]><option value="N"> N</option><option value="Y"> Y</option>
</select>
                                </div>
                                <div class="form-group email">
                                    <label for="email">Answer 4</label>
                                    <input name="pk_answerid[]" type="text" class="form-control" placeholder=""><select name=pk_answerid_correct[]><option value="N"> N</option><option value="Y"> Y</option>
</select>
                                </div>
<!-Answer----------------------------------------------------->
                               <div class="form-group email">
                                    <label for="email">QUESTION IMAGE</label>
                                    <input  type="file"  name="file" id="file"  class="form-control" placeholder="">
                                </div>

                                <button type="submit" class="btn btn-theme">Send message</button>
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

    <!-- ******FOOTER****** --> 
<?php include('includes/footer.php'); ?>