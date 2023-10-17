<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg "
		style="background-color: LightGray;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">ADDRESS_DETAILS</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp"><b>HOME</b></a></li>



					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
			</div>
		</div>
	</nav>
	<br>

	<form action="virat" class="fo" method="post">
		<label><b>Number : </b></label> <input type="text"
			placeholder="Enter No" name="no" id="no" required><br>
		<br> <label><b>State : </b></label> <input type="text"
			placeholder="Enter state" name="state" id="state" required><br>
		<br> <label><b>Street : </b></label> <input type="text"
			placeholder="Enter Street" name="street" id="street" required><br>
		<br> <label><b>City : </b></label> <input type="text"
			placeholder="Enter city" name="city" id="city" required><br>
		<br> <label><b>Country : </b></label> <input type="text"
			placeholder="Enter country" name="country" id="country" required><br>
		<br> <input type="submit" value="Send" class="btn btn-primary">
	</form>



</body>
</html>