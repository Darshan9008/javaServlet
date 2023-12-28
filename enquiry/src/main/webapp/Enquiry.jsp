<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.fo {


padding : 0 20px 0 20px;

}
.submit {

padding : 0 20px 0 20px;
}
.cancel {

padding : 0 20px 0 20px;
}
.fi {
  padding:20px;
  margin:20px 0;
  display: block;
  float: left;
  width : 120px;
  text-align: right;
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
	<script src="Enquiry.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg " style="background-color:LightGray;">
  <div class="container-fluid">
  
<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabnDq7Kdm_k1R9ND6Oaf_SSXqMKZHkMlF4g&usqp=CAU" alt="logo" width="70" height="50">
    <a class="fo" href="#"><b>HOME</b></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Match.jsp"><b>ABOUT_US</b></a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Match.jsp"><b>GALLERY</b></a>
        </li>
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Match.jsp"><b>CONTACT</b></a>
        </li>
       </ul>
       
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
      
      
    </div>
  </div>
</nav>
<form class="fi" name="myform" method="post" action="virat" onsubmit="return validate()" >  <br>
<span id="valid" style="padding-left:80px"></span>
		
<p id="verify"></p><b> Name  : </b><input type="text" name="name" id="name" onblur="handleName()"><br/>  <br/>
<p id="verify1"></p><b>Mobile No :</b> <input type="number" name="number" id="number" onblur="handleNumber()"><br/><br/> 
<p id="verify2"></p><b>Email ID :</b> <input type="email" id="email" name="email" onblur="handleEmail()"><br/>  <br/>
<p id="verify3"></p><b>Date Of Birth: </b><input type="date" name="date" id="date" onblur="handleDate()"><br/> <br/>
<p id="verify4"></p><b>Location : </b><select name="location" id="location" onblur="handleLocation()">
<option value="choose">choose</option>
  <option value="Bengaluru">Bengaluru</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Chennai">Chennai</option>
  <option value="Kerala">Kerala</option>
</select><br/>  <br/>
<p id="verify5"></p><b>Password :</b> <input type="password" name="password" id="password" onblur="handlePassword()"><br/> <br/>
<p id="verify5"></p><b>Confirm Password :</b> <input type="password" name="password1" id="password1" onblur="handlePassword()"><br/><br/>
<input type="checkbox" id="robot" name="robot" value="robot">
<br>
					<div class="g-recaptcha"
						data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" id="captcha1" onblur="Error()"></div>

<br> <br><div>
<input type="submit" value="Submit" class="submit" id="button" onblur="validate()"> 
 <input type="reset" value="Cancel" class="cancel">
</div>
</form>

<script src="https://www.google.com/recaptcha/api.js"></script>


</body>
</html>