<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg"  style="background-color: hsla(89, 43%, 51%, 0.3);">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">PRODUCT_PAGE</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html"><b>HOME</b></a>
        </li>
         <div class="container-fluid">
    <form class="d-flex">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
  </div>
  </div>
</nav><br>

<form action="virat" method="post">

<div>
<label>Product Name</label>
    <input type="text" placeholder="Enter product name" name="name" id="name" ><br><br>

</div><div>
<label>Product price</label>
    <input type="text" placeholder="Enter product price" name="price" id="price" ><br><br>

</div>



 <label for="type"><b>Product Type:</b></label>
    <select name="type" id="type">
  <option value="10">cloth</option>  10
  <option value="15">book</option>    15
  <option value="7">electric</option> 7 
  <option value="5">other</option>5
  </select>
  
 <br>
 <br>
 
    <input type="submit" value="Send" class="btn btn-primary">
 
 
 
  
  





</form>


</body>
</html>