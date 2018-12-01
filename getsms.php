<?php
function sendsms_get($username, $password, $message, $senderid, $recipients) {
$message = urlencode($message);
$senderid = urlencode($senderid);
$url =
'http://api.smartsmssolutions.com/smsapi.php?username='.$username.'&password='.$password.'&sender='.$senderid.'&recipient='.$senderid.'&message='.$message.'&';
$send = file_get_contents($url);
return $send;
}
$username = 'ogheneinfinitea';
$password = '07033684271';
$message = 'hello world testing my API';
$senderid = 'INFINITEA';
$recipients = '08032236858';
$url = 'http://api.smartsmssolutions.com/smsapi.php';
$get_sms = sendsms_get($username, $password, $message, $senderid, $recipients);
echo $get_sms;

?>