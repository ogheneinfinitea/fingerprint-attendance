<?php
	require 'corestaff.php';
	require 'config.php';

	if(logged_in1())
	{
		$first_name=getuserfields('Firstname');
		$last_name=getuserfields('Lastname');
		$emailid=getuserfields('Email_id');
		$regid=getuserfields('Regid');
		if($first_name=='')
		{
			echo 'You are already logged in as Student.';
		}
		else
		{
			include 'faculty.php';
		}
	} 
	else
	{
		include 'loginform.incfac.php';
	}
?>
