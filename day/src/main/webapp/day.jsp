<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Day_Details</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav" >
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home_page</a>
        </li>
       
      </ul>
    </div>
  </div>
</nav><br>

<form action="virat" method="post">
<label for="date"><b>Date  :  </b></label>
    <input type="text" placeholder="Enter date" name="date" required><br><br>
    
    <label for="year"><b>Year  :  </b></label>
    <input type="text" placeholder="Enter year" name="year" required><br><br>

    <label for="month"><b>Month  :  </b></label>
    <input type="text" placeholder="Enter month" name="month" required><br><br>
    
    <label for="day"><b>Day  :  </b></label>
    <input type="text" placeholder="Enter day" name="day" required><br><br>
    
    
    <input type="submit" value="Send" class="btn btn-primary">



</form>

</body>
</html>