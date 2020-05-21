
<?php include("../db/dbconnection.php")?>
<?php





$pk_user_id =$_POST["pk_user_id"]; 
$user_name =$_POST["user_name"];
$password =$_POST["password"];
$email_id =$_POST["email_id"];
$mobile_no=$_POST["mobile_no"];
$current_designation =$_POST["current_designation"];
$current_role =$_POST["current_role"];
$created_by =$_POST["created_by"]; 
$created_datettime =$_POST["created_datettime"];
$modified_by =$_POST["modified_by"]; 
$modified_datetime =$_POST["modified_datetime"];
$fk_school_id =$_POST["fk_school_id"];
$fk_school_id = "8";

$sql = "INSERT INTO user_info (`pk_user_id`, `fk_school_id`,`user_name`, `password`, `email_id`, `mobile_no`, `current_designation`, `current_role`, `created_by`, `created_datettime`, `modified_by`, `modified_datetime`)";
$sql = $sql. "VALUES ('$pk_user_id', '$fk_school_id','$user_name', '$password', '$email_id', '$mobile_no', '$current_designation', '$current_role', '$created_by', '$created_datettime', '$modified_by', '$modified_datetime')";
echo $sql;
if ($mysqli->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();

echo "Inserted Successfully.<BR> Click here to View All Users <a href=communicatorViewUser.php>View All Users</a>";


?> 