




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
                           
<?php include("db/dbconnection.php")?>

<?php


$fk_questionid =  $_POST["fk_questionid"];
$fk_SchoolId =  $_POST["SchoolId"];
$fk_SubjectId =  $_POST["SubjectId"];
$QuestionName =  $_POST['QuestionName'];
$Description=  $_POST['Description'];
$pk_answerid  =  $_POST['pk_answerid'];
$answer = $_POST['answer'];
$pk_answerid_correct = $_POST['pk_answerid_correct'];

echo "<BR>fk_questionid".$fk_questionid;
echo "<BR>fk_SubjectId".$fk_SubjectId;
echo "<BR>fk_SubjectId".$fk_SubjectId;

echo "<BR>fk_SchoolId".$fk_SchoolId; 

$sql = "SELECT max(pk_questionid) as  max_question_id FROM question_info";

$result = $mysqli->query($sql);

   while($row = $result->fetch_assoc())
  {
 $max_question_id = $row['max_question_id']+1;
}



$sql="INSERT INTO  question_info( pk_questionid,QuestionName, fk_SchoolId, fk_SubjectId, description, createdby, lastupdatedby, lastupdateed, status) VALUES ( '$max_question_id','$QuestionName', '$fk_SchoolId', '$fk_SubjectId', 'Description', 'user_name', 'now()', 'user_name', '1')";

echo "<BR>". $sql."<BR>";

$result = $mysqli->query($sql) or die (" Error in adding product Could not execute query : ".$sql . mysqli_error());

if($result)
{
echo "INseted";
}

// output or process all data
$i=0;
  
echo "COUNT OF ".count($pk_answerid);
foreach ($pk_answerid as $answer) {
//echo "<BR>INSERT LOOP OF ".$i;
//echo "ANS by ID".$answer;
//echo "CORRECT ANS ".$pk_answerid_correct[$i];
   $sql="SELECT max(pk_answerid) as  max_pk_answerid FROM answer_info";
$result = $mysqli->query($sql) or die (" Error in adding product Could not execute query : ".$sql . mysqli_error());

 while($row = $result->fetch_assoc())
  {

 $max_pk_answerid= $row['max_pk_answerid'];
$max_pk_answerid = $max_pk_answerid +$i;
  echo "<BR>".$answer;
$sql="INSERT INTO answer_info ( fk_questionid, fk_SchoolId, fk_SubjectId, answer,correct_answer, createdby, lastupdatedby, lastupdateed, status) VALUES ( '$max_question_id', '$fk_SchoolId', '$fk_SubjectId', '$answer','$pk_answerid_correct[$i]', '787', CURRENT_TIMESTAMP, '78', '1');";

}
$result = $mysqli->query($sql) or die (" Error in adding product Could not execute query : ".$sql . mysqli_error());
$i=$i+1;
if($result)
{
echo "INseted";




}
echo "<BR>";
echo $sql."<BR>";
}




?>

<?php

mysqli_close($con);
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