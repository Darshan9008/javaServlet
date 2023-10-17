<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.fo {
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
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
<h5>WEAPON DETAILS</h5>
<form action="virat" class="fo" method="post">
<label><b>Name  :  </b></label>
    <input type="text" placeholder="Enter Name" name="lname" id="lname" required><br><br>
    
    <label><b>Amount  :  </b></label>
    <input type="text" placeholder="Enter Amount" name="amount" id="amount" required><br><br>
    
     <label><b>Working :</b></label>
    <select name="work" id="work">
<option value="select">select</option>
  <option value="manager">Manager</option>
  <option value="casher">Casher</option>
  <option value="assistantManager">AssistantManager</option>
  <option value="officer">Officer</option>
  </select> 
 <br>
  <br>
  
    <label><b>Interest  :  </b></label>
    <input type="text" placeholder="Enter Interest" name="interest" id="interest" required><br><br>
  
  <label><b>Surety  :  </b></label>
    <input type="text" placeholder="Enter surety" name="surety" id="surety" required><br><br>
    
    <label><b>Company  :  </b></label>
    <input type="text" placeholder="Enter Company" name="company" id="company" required><br><br>
   
   <label><b>Loan Duration  :  </b></label>
    <input type="text" placeholder="Enter Duration" name="duration" id="duration" required><br><br>
    
     <label><b>Loan Type :</b></label>
    <select name="type" id="type">
<option value="select">select</option>
  <option value="homeLoan">Home Loan</option>
  <option value="bikeLoan">BikeLoan</option>
  <option value="carLoan">Car Loan</option>
  <option value="mobileLoan">Mobile Loan</option>
  </select> 
 <br>
  <br>
  
   <label>
          <input type="checkbox" checked="checked" name="terms"> I accept the terms & condition
        </label>
        <br><br>
    
       <input type="submit" value="Send" class="btn btn-primary">
    
 </form>   




</body>
</html>