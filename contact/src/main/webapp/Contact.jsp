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
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg"  style="background-color: hsla(89, 43%, 51%, 0.3);">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">DETAILS_PAGE</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp"><b>HOME</b></a>
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

<form action="virat" class="fo" method="post">
<label><b>Name  :  </b></label>
    <input type="text" placeholder="Enter Name" name="name" id="name" required><br><br>
    
    <label><b>Email  :  </b></label>
    <input type="text" placeholder="Enter email" name="email" id="email" required><br><br>
    
     <label><b>Mobile No  :  </b></label>
    <input type="text" placeholder="Enter Number" name="number" id="number" required><br><br>
    
         <label><b>Comment  :  </b></label>
<textarea name="comment"  width="20" height="30"></textarea>         
    
    <br>
    		<br> <input type="submit" value="Submit" id="button" class="btn btn-primary">
    
    
    
    </form>

</body>
</html>