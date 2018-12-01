<?php
	require 'corestudent.php';
	session_destroy();
	header('Location: new.php');
?>