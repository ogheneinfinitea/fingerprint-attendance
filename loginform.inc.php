<?php
  require 'config.php';
  if(isset($_POST['regid']) && isset($_POST['password']))
  {
    $regid=$_POST['regid'];
    $password=$_POST['password'];
    if(!empty($regid) && !empty($password))
    {
      $query="SELECT id from Student where Regid='".mysqli_real_escape_string($handle,$regid)."' and Password='".mysqli_real_escape_string($handle,$password)."'";
      $query_run=mysqli_query($handle,$query);
      $query_num_rows=mysqli_num_rows($query_run);
      if($query_num_rows==0)
      {
        echo '<script type="text/javascript">alert("Invalid Username/Password Combination.")</script>';
      }
      else if($query_num_rows==1)
      {
        while($query_row=mysqli_fetch_assoc($query_run))
        {
          echo $user_id=$query_row['id'];    //we have grabbed the user id.
        }
        $_SESSION['user_id']=$user_id;    //started the session with the particular user id..
        header('Location: login.php');  //then relocated login.php
      }
    }
    else
    {
      echo '<script type="text/javascript">alert("Username or password not filled properly.")</script>';
    }
  }
?>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Student Login Form</title>
    
    
    <link rel="stylesheet" href="css/reset.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Montserrat:400,700'>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="css/style.css">

    
    
    
  </head>

  <body style="background:url(slide11.jpg)";>

    
<div class="container">
  <div class="info">
    <h1>Login As Student</h1><span>
  </div>
</div>
<div class="form">
   <form class="login-form" action="<?php echo $current_file ?>" method="POST">
 
    <input type="text" placeholder="RegID" name="regid">
    
    <input type="password" placeholder="password" name="password">
    <button class="button">Login</button>
    <p class="message">Not registered? <a href="registration.php">Create an account</a></p>
  </form>
</div>

         </body>
</html>
