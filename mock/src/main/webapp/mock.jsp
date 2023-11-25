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
<script src="Mock.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg"  style="background-color: hsla(89, 43%, 51%, 0.3);">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">HOME</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp"><b>HOME_PAGE</b></a>
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

<form method="post" class="fo" action="virat">
<span id="valid" style="padding-left:80px"></span>



  				
   
 
  <label for="sino" class="form-label">SI NO :</label>
  <p id="verify"/>
  <div class="mb-3">
  <input type="text" class="form-control" id="sino" name="sino" placeholder="enter SI no" onblur="handleSiNo()">
</div>
<br>

  



  <label for="fname" class="form-label">First Name :</label>
   <p id="verify1"/>
  <div class="mb-3">
  
  <input type="text" class="form-control" id="fname" name="fname" placeholder="enter first name" onblur="handleFname()">
</div><br>

  <label for="lname" class="form-label">Last Name :</label>
  <p id="verify2"/>
  <div class="mb-3">
  <input type="text" class="form-control" id="lname" name="lname" placeholder="enter last name" onblur="handleLname()">
</div><br>

  <label for="mname" class="form-label">Middle Name :</label>
    <p id="verify3"/>
  <div class="mb-3">
  <input type="text" class="form-control" id="mname" name="mname" placeholder="enter middle name" onblur="handleMname()">
</div><br>

  <label for="email" class="form-label">Email :</label>
      <p id="verify4"/>
  
  <div class="mb-3">
  <input type="text" class="form-control" id="email" name="email" placeholder="enter email id" onblur="handleEmail()">
</div>
<br>

  <label for="gender" class="form-label">Gender  :</label>
   <p id="verify5"/>
  <div class="mb-3">
  <input type="text" class="form-control" id="gender" name="gender" placeholder="enter gender" onblur="handleGender()">
</div>
<br>

  <label for="phno" class="form-label">Phone Number  :</label>
     <p id="verify6"/>
  
  <div class="mb-3">
  <input type="text" class="form-control" id="phno" name="phno" placeholder="enter phone number" onblur="handlePhno()">
</div>
<br>

  <label for="area" class="form-label">Area  :</label>
  
   <p id="verify7"/>
  <div class="mb-3">
  <input type="text" class="form-control" id="area" name="area" placeholder="enter area" onblur="handleArea()">
</div>
<br>
<div>
<label ><b>District :</b></label>
    <select name="district" id="district">
<option value="select">select</option>
  <option value="shimoga">shimoga</option>
  <option value="bengaluru">Bengaluru</option>
  <option value="ramnagar">Ramnagar </option>
  <option value="bidar">Bidar</option>
  </select> 
 <br>
 </div>
 <br>
 <div>
<label ><b>State :</b></label>
    <select name="state" id="state">
<option value="select">select</option>
  <option value="karnataka">Karnataka</option>
  <option value="kerala">Kerala</option>
  <option value="hyderabad">Hyderabad</option>
  <option value="goa">Goa</option>
  </select> 
 <br>
 </div>
 <br>
 
  <label for="pincode" class="form-label">Pincode  :</label>
  <p id="verify8"/>
  
  <div class="mb-3">
  
  <input type="text" class="form-control" id="pincode" name="pincode" placeholder="enter pincode" onblur="handlePincode()">
</div>

		<br> <input type="submit" value="Submit" id="button" class="btn btn-primary">





</form>


</body>
</html>