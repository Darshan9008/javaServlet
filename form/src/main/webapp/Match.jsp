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
   margin: 10px 250px;
background-color: #92a8d1;
font-family: Georgia, "Times New Roman", Times, serif;
}
</style>



<script>  
function validateform(){  
	  var fields = ["tname", "country", "date", "teamOne", "teamTwo", "captainOne", 
          "captainTwo", "umpire", "stadium", "thirdUmpire", "capacity"];

	  
for (var i = 0; i < fields.length; i++) {
var value = document.forms["myform"][fields[i]].value;
if (value.length < 3 || value.length > 20) {
alert("Field '" + fields[i] + "' must have a length between 3 and 20 characters.");
return false;
}
}
}  
</script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg " style="background-color:LightGray;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">MATCH</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">MATCH_DETAILS<b></b></a>
        </li>
       
        
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<br>
<form class="fo" name="myform" method="post" action="virat" onsubmit="return validateform()" >  
<b>Tournament Name:</b> <input type="text" name="tname"><br/>  <br/>
<b>Hosting Country:</b> <input type="text" name="country"><br/><br/> 
<b>Match Date:</b> <input type="date" name="date"><br/>  <br/>
<b>Team 1: </b><input type="text" name="teamOne"><br/> <br/>
<b>Team 2: </b><input type="text" name="teamTwo"><br/>  <br/>
<b>Team 1 Captain Name:</b> <input type="text" name="captainOne"><br/> <br/>
<b>Team 2 Captain Name:</b> <input type="text" name="captainTwo"><br/><br/>
<b>Umpire Name: </b><input type="text" name="umpire"><br/> <br/>
<b>Stadium Name: </b><input type="text" name="stadium"><br/>  <br/>
<b>Third Umpire Name:</b> <input type="text" name="thirdUmpire"><br/><br/> 
<b>Stadium Capacity:</b><input type="text" name="capacity"><br><br/>

<input type="submit" value="Register">  
</form>

</body>
</html>