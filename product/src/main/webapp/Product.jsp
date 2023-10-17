<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<style>
.fo {
  padding:20px;
  margin:20px 0;
  border: 2px solid #eee;
  box-shadow:0 0 15px 4px rgba(1,2,2,0.06);
   border-radius:10px;
    color: #333;
 width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 2px solid red;
  border-radius: 4px;
  background-position: 10px 10px;
   margin: 4px 2px;
background-color: #92a8d1;
font-family: Georgia, "Times New Roman", Times, serif;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg " style="background-color:LightGray;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">LOGIN_HOME</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp"><b>HOME_PAGE</b></a>
        </li>
       
        
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<br>

<form action="virat" class="fo" method="post">
<span>  ${error}</span><br><br>
		<label><b>Name : </b></label> <input type="text"
			placeholder="Enter Name" name="name" id="name" required><br><br>
			
			<label><b>Type :</b></label>
    <select name="type" id="type">
<option value="select">select</option>
  <option value="sneaker">Sneaker</option>
  <option value="casual">Casual</option>
  <option value="daily_commute">Daily Commute</option>
  <option value="party">Party</option>
  </select> 
 <br>
  <br>
		 <label><b>Price : </b></label> <input type="text"
			placeholder="Enter price" name="Price" id="price" required><br>
		<br> <label><b>Brand : </b></label> <input type="text"
			placeholder="Enter brand" name="brand" id="brand" required><br><br>
			
			<label><b>Quantity :</b></label>
    <select name="quantity" id="quantity">
<option value="select">select</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3 </option>
  <option value="4">4</option>
  </select> 
 <br>
  <br>
  <label><b>Description : </b></label> <input type="text"
			placeholder="Enter Description" name="desc" id="desc" required><br>
			
		
		<br> <input type="submit" value="Send" class="btn btn-primary">
	</form>



</body>
</html>