<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.fo {
  padding:20px;
  margin:20px 0;
  display: block;
  float: left;
  width : 120px;
  text-align: left;
  border: 4px solid #eee;
  box-shadow:0 0 15px 4px rgba(1,2,2,0.06);
   border-radius:30px;
    color: #333;
 width: 30%;
  padding: 20px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 4px solid red;
  border-radius: 4px;
  background-position: 10px 10px;
   margin: 10px 50px;
background-color: #92a8d1;
font-family: Georgia, "Times New Roman", Times, serif;
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><b>BAKERY_APPLICATION</b></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link active" aria-current="page" href="#"><b>BAKERY_DETAILS</b></a>
       
      </div>
    </div>
  </div>
   <div class="container-fluid">
    <form class="d-flex">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
</nav>



<form method="post" class="fo" action="virat">
<br>

<div class="mb-3">
  <label for="item" class="form-label">Item Name :</label>
  <input type="text" class="form-control" id="item" name="item" placeholder="enter item name">
</div>
<div class="mb-3">
  <label for="price" class="form-label">Item Price :</label>
  <input type="text" class="form-control" id="price" name="price" placeholder="enter item price">
</div>

<div>
<label ><b>Quantity :</b></label>
    <select name="quantity" id="quantity">
<option value="select">select</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3 </option>
  <option value="4">4</option>
  </select> 
 <br>
 </div>
 <br>
 
 <div>
<label ><b>Discount :</b></label>
    <select name="discount" id="discount">
 <option value="select">select</option>
  <option value="5">5</option>
  <option value="10">10</option>
  <option value="15">15</option>
  <option value="20">20</option>
  </select> 
 <br>
 </div>
 <br>
 <div class="mb-3">
  <label for="gst" class="form-label">GST :</label>
  <input type="number" class="form-control" name="gst" id="gst" placeholder="enter gst">
</div>
<br>

<div>

<label for="mdate">Manufacture Date :</label>
<input type="date" id="mdate" name="mdate">
</div>
 <div>
<br>
<label for="edate">Expiry Date :</label>
<input type="date" id="edate" name="edate"><br>
</div>
		<br> <input type="submit" value="Send" id="button" class="btn btn-primary">
 


</form>

</body>
</html>