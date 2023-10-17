<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.mo {
  padding:20px;
  margin:20px 0;
  border: 2px solid #eee;
  box-shadow:0 0 15px 4px rgba(1,2,2,0.06);
   border-radius:10px;
    color: #333;

background-color: #92a8d1;
font-family: Georgia, "Times New Roman", Times, serif;
}
</style>
</head>
<body>
 <script type = "text/javascript">
function validateform(){  
var name=document.myForm.name.value;  
var price=document.myForm.price.value; 
var desc=document.myForm.desc.value;  

if (name==null || name=="" || name.length>3 || name.length<20){  
	  alert("Name should be greater than 3 and less than 20");  
	  return false;  
}
else if(!price>0 || !price<50){
	
	alert("price should be greater than 0 and less than 50");
	return false;
	
	}
	
else if(!desc.length>30 || !desc.length<50){
		alert("desc should be minimum 30 characters");
		return false;
	}
}

  
</script>  
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
<h5>Form Details</h5>
<form action="virat" name="myForm" class="mo" method="post"  onsubmit="return validateform()">
<label><b>Name  :  </b></label>
    <input type="text" placeholder="Enter Name" name="name" ><br><br>
    
    <label><b>Type  :  </b></label>
    <input type="text" placeholder="Enter type" name="type" ><br><br>
    
    
    <label><b>Price  :  </b></label>
    <input type="text" placeholder="Enter Price" name="price"  ><br><br>
  
  <label><b>Quantity :</b></label>
    <select name="quantity">
<option value="select">select</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  </select> 
 <br>
  <br>
    <label><b>Brand  :  </b></label>
    <input type="text" placeholder="Enter Brand" name="brand"  ><br><br>
   
  <label for="description"><b>Description  :</b></label>

    <textarea name="description" rows="4" cols="30"></textarea><br><br>
    
       <input type="submit" value="register" class="btn btn-primary" >
    
 </form> 




</body>
</html>