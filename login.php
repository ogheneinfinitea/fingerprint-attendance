<?php
	require 'corestudent.php';
	require 'config.php';

	if(logged_in())
	{
		$first_name=getuserfield('Firstname');
		$last_name=getuserfield('Lastname');
		$email_id=getuserfield('Email_id');
		$regid=getuserfield('Regid');
		if($first_name=='')
		{
			echo 'You are already logged in as faculty.';
		}
		else
		{
			include 'student.php';
		}
	}
	else
	{
		include 'loginform.inc.php';
	}
?>