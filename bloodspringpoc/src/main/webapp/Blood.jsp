<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<div class="container-fluid">
<a class="navbar-brand" href="#">Xworkz</a>
<button class="navbar-toggler" type="button"
data-bs-toggle="collapse" data-bs-target="#navbarNav"
aria-controls="navbarNav" aria-expanded="false"
aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="navbarNav">
<ul class="navbar-nav">
<li class="nav-item"><a class="nav-link active"
aria-current="page" href="index.jsp">Home</a></li>
</li>
</ul>
</div>
</div>
</nav>



<form action="info" method="post">
<div>
<label>Name :</label>
<input type="text" placeholder="enter name" name="name">
</div>
<br><br>

<div>
<label>Age :</label>
<input type="text" placeholder="enter age " name="age">
</div>
<br><br>

<div>
<label>Weight :</label>
<input type="text" placeholder="enter weight " name="weight"> 

</div>
<br><br>

<div>
<label>Gender :</label>
    <select name="gender" id="gender">
<option selected="selected">select</option>
  <option value="M">Male</option>
  <option value="F">Female</option>
  <option value="O">Others </option>
  </select> 
</div>
<br><br>



<div>
<label>Drunk :</label>
<select name="drunk" id="drunk">
<option selected="selected">select</option>
<option value="true">yes</option>
<option value="false">no</option>
</select>
</div>
<br><br>


<div>
<label>Sickness :</label>
<select name="sick" id="sick">
<option selected="selected">select</option>
<option value="true">yes</option>
<option value="false">no</option>

</select>


</div>
<br>
<br>


  <button type="submit" value="save" class="btn btn-primary">Submit</button>

</form>

</body>
</html>