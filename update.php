<?php
	include 'config.php';
      include 'corestudent.php';
		if(isset($_POST['firstname']) && isset($_POST['lastname']) && isset($_POST['email']) && isset($_POST['contact']) && isset($_POST['department']) && isset($_POST['year']) && isset($_POST['about']) && isset($_POST['intermediate']) && isset($_POST['college']) && isset($_POST['address']) && isset($_POST['gender']) && isset($_POST['date_of_birth']) && isset($_POST['year_of_passing']))
		{
                 
			$firstname=$_POST['firstname'];
			$lastname=$_POST['lastname'];
			$email=$_POST['Email'];
			$phone=$_POST['Phone'];
			$department=$_POST['department'];
			$year=$_POST['year'];      
                  $address=$_POST['address'];
                  $gender=$_POST['gender'];
                  $date_of_birth=$_POST['date_of_birth'];
                 
			$query="UPDATE Studnt SET Email='$email' Where id='$id'";
			if($query_run=mysqli_query($handle,$query))
                  {
			   header('Location: studentprofile.php');
                  }
                  else
                  {
                        echo 'Unable to process.';
                  }
		}
?>