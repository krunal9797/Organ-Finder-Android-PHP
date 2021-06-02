<?php
include 'config.php';
error_reporting(0);
include("vendor/mpdf/mpdf.php");
include  'partials/header.php';

$id=$_GET['id'];
$record = $database->selectQuery("SELECT * FROM `donorreg` WHERE id=$id")[0];
$mpdf = new mPdf('C');
$mpdf = AddPage('L');

$html = '<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="style.css" media="all">
</head>

<body>
<header class="clearfix">
<table class="t1">
<tr>
      <th>welcome</th>
</tr>
<tr>
<th>subject : </th>
</tr>
</table>
</header>
<main>
<table border="0" cellspacing="0" cellspacing="0">
<thead>
<tr>
<th>id number </th>
<th>name </th>
<th>email </th>
<th>pass </th>
</tr>
</thead> 
<tbody>';

$html.='</tbody>

<tfoot>

</tfoot>
</table>

<div class="ceo">

</pre>
</main>
<footer>
krunal
</footer>

</body>
</html>';

$mpdf->WriteHTML($html,2);
$mpdf->Output(rand(1111,9999).'web.pdf','D');
exit;

?>