<?php
require 'config.php';
require 'corestudent.php';
require 'corestaff.php';


if(!logged_in() || !logged_in1())
{
if(isset($_POST['regid']) && isset($_POST['email']) && isset($_POST['password']) && isset($_POST['c_password']) && isset($_POST['firstname']) && isset($_POST['lastname'])&& isset($_POST['phone']))
{
	$regid=$_POST['regid'];
	$email=$_POST['email'];
	$password=$_POST['password'];
	$password_hash=md5($password);
	$c_password=$_POST['c_password'];
	$firstname=$_POST['firstname'];
	$lastname=$_POST['lastname'];
	$gender=@$_POST['gender'];
	$profession=@$_POST['profession'];
	$department=@$_POST['department'];
	$phone=$_POST['phone'];
	if(!empty($regid) && !empty($email) && !empty($password) && !empty($c_password) && !empty($firstname) && !empty($lastname) && !empty($gender) && !empty($profession) && !empty($department)&& !empty($phone))
	{
		if($password!=$c_password)
		{
			echo '<script type="text/javascript">alert("Passwords Donot Match!")</script>';
		 }
		 else
		{
			if($profession=='Student')
			{
				 $query="SELECT regid from Student where regid='".$regid."'";
				 $query_run=mysqli_query($handle,$query);
				 if(mysqli_num_rows($query_run)==1)
				 {
					 echo '<script type="text/javascript">alert("Username Already Exists.")</script>';
				}
				 else
				 {
					 $query="INSERT INTO Student (Regid, Firstname, Lastname, Email, Password, Gender, Proffession, Department, Phone)
					 	VALUES ('$regid', '$firstname', '$lastname', '$email', '$password', '$gender', '$profession', '$department', '$phone')";
					 if($query_run=mysqli_query($handle,$query))
					 {
						 echo '<script type="text/javascript">alert("Successfully registered. Please login to continue.")</script>';
						 header( "refresh:1;url=login.php" );
					 }
				 }
			}
			else if($profession=='Staff')
			{
				$query="SELECT username from Staff where Regid='".$regid."'";
				 $query_run=mysqli_query($handle,$query);
				 if(mysqli_num_rows($query_run)==1)
				 {
					 echo '<script type="text/javascript">alert("Username Already Exists.")</script>';
				 }
				 else
				 {
					$query="INSERT INTO Staff (Regid, Firstname, Lastname, Email, Password, Gender, Proffession, Department, Phone)
					VALUES ('$regid', '$firstname', '$lastname', '$email', '$password', '$gender', '$profession', '$department', '$phone')";
					 if($query_run=mysqli_query($handle,$query))
					 {
						 echo '<script type="text/javascript">alert("Successfully registered. Please login to continue.")</script>';
						 header( "refresh:1;url=loginfac.php" );
					 }
				}	
			}
		}
	}
	else
	{
		echo '<script type="text/javascript">alert("Please Fill All The Details.")</script>';
	}
}
?>



<!DOCTYPE html> 
<html>
	<head>
		<title>Register Here!</title>
		
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
		 <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'>
		<link rel="stylesheet" href="demo.css">
		<link rel="stylesheet" href="sky-form.css">
		<!--[if lt IE 9]>
			<link rel="stylesheet" href="css/sky-forms-ie8.css">
		<![endif]-->
		
		<!--[if lt IE 10]>
			<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
			<script src="js/jquery.placeholder.min.js"></script>
		<![endif]-->		
		<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/sky-forms-ie8.js"></script>
		<![endif]-->
	</head>
	<body style="background:url(slide11.jpg)";>
	<h2 style="text-align:right">Go back to<a href="new.php" style="color:maroon;text-decoration:none;"> Home </a>page...</h2>
		<div class="body body-s">
		
			<form action="registration.php" class="sky-form" method="POST">
				<header>Registration form</header>
				
				<fieldset>					
					<section>
						<label class="input">
							<i class="icon-append icon-user"></i>
							<input type="text" placeholder="RegID" name="regid">
							<b class="tooltip tooltip-bottom-right">Only characters and numbers</b>
						</label>
					</section>
					
					<section>
						<label class="input">
							<i class="icon-append icon-envelope-alt"></i>
							<input type="text" placeholder="Email address" name="email">
							<b class="tooltip tooltip-bottom-right">Needed to verify your account</b>
						</label>
					</section>
					
					<section>
						<label class="input">
							<i class="icon-append icon-lock"></i>
							<input type="password" placeholder="Password" name="password">
							<b class="tooltip tooltip-bottom-right">Only characters and numbers</b>
						</label>
					</section>
					
					<section>
						<label class="input">
							<i class="icon-append icon-lock"></i>
							<input type="password" placeholder="Confirm password" name="c_password">
							<b class="tooltip tooltip-bottom-right">Only characters and numbers</b>
						</label>
					</section>
					<section>
						<label class="input">
							<i class="icon-append icon-lock"></i>
							<input type="text" placeholder="Phone" name="phone">
							<b class="tooltip tooltip-bottom-right">Only and numbers</b>
						</label>
					</section>
					
				</fieldset>
					
				<fieldset>
					<div class="row">
						<section class="col col-6">
							<label class="input">
								<input type="text" placeholder="First name" name="firstname">
							</label>
						</section>
						<section class="col col-6">
							<label class="input">
								<input type="text" placeholder="Last name" name="lastname">
							</label>
						</section>
					</div>
					
					<section>
						<label class="select">
							<select name="gender">
								<option value="0" selected disabled>Gender</option>
								<option value="Male">Male</option>
								<option value="Female">Female</option>
								<option value="Other">Other</option>
							</select>
							<i></i>
						</label>
					</section>
					<section>
						<label class="select">
							<select name="profession">
								<option value="0" selected disabled>Profession</option>
								<option value="Student">Student</option>
								<option value="Staff">Staff</option>
							</select>
							<i></i>
						</label>
					</section>
					<section>
						<label class="select">
							<select name="department">
								<option value="0" selected disabled>Department</option>
								<option value="COMPUTER SCIENCE">CS</option>
								<option value="STATISTICS">ST</option>
								<option value="MATHEMATICS">MTH</option>
								
							</select>
							<i></i>
						</label>
					</section>
				</fieldset>
				<footer>
					<input type="submit" class="button" value="Register">
				</footer>
  			</form>
  			</div>
	</body>
</html>
<?php
	}
	else if(logged_in() || logged_in1())
	{
		echo 'You\'re already registered and logged in. Go back to login page and logout to register another account.';
	}
?>