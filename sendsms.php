<?php

function sendsms_post ($url, array $params) {
$params = http_build_query($params);
$ch = curl_init();
curl_setopt($ch,
curl_setopt($ch,
curl_setopt($ch,
curl_setopt($ch,
CURLOPT_URL,$url);
CURLOPT_RETURNTRANSFER,true);
CURLOPT_POST, 1);
CURLOPT_POSTFIELDS, $params);
$output=curl_exec($ch);
curl_close($ch);
return $output;
}
$sms_array = array (
'username' => $username,
'password' => $password,
'message'
=> $message,
'sender'
=> $senderid,
'recipient' => $recipients
);
$post_sms = sendsms_post($url, $sms_array);
echo $post_sms;

?>