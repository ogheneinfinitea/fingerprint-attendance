<?php
	$conn_error = 'Could not connect, database Down Contact Your site Admin.';
	$mysql_host = 'localhost';
	$mysql_user = 'root';
	$mysql_password = '';

	$mysql_db = 'onlinesub';
	$handle = @mysqli_connect($mysql_host, $mysql_user, $mysql_password, $mysql_db);
	if(!$handle || !@mysqli_select_db($handle, $mysql_db))
	{
		die($conn_error);
	}
?>