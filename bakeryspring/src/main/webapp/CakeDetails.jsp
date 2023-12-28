<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CakeDetails</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<style type="text/css">
form {
	max-width: 800px;
	margin: 10px auto;
	padding: 20px;
	border: 1px solid #ccc;
	background-color: #f1c2c2;
	border-radius: 5px;
}

label {
	display: block;
	margin-bottom: 5px;
}

input[type="text"], select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #161515;
	border-radius: 3px;
}

input[type="submit"] {
	background-color: black;
	color: #fff;
	padding: 10px 15px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

select {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"]:hover {
	background-color: olive;
}

.radio-btn {
	/* display: inline-block; */
	display: flex;
	/* flex-direction: row; */
	/* padding: 10px; */
	/* margin: 10px; */
	/* justify-content: center; */
	align-items: center;
}

.radio-btn div {
	margin: 10px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg text-bg-info p-3">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Cake Order</a></li>
				</ul>
				<div class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</div>
			</div>
		</div>
	</nav>
	
	<span style="color:red">
		<c:forEach var="objectErrors" items="${error}">
			${objectErrors.defaultMessage}<br>
		</c:forEach>
	</span>
	
	<form action="bake" method="post">
		<div class="row">
			<div class="col">
				<input type="text" class="form-control" name="customerName"
					placeholder="Customer name" value="${dto.getCustomerName()}"/>
			</div>
			<div class="col">
				<input type="email" class="form-control" name="customerEmail"
					placeholder="Customer Email" value="${dto.getCustomerEmail()}"/>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<select name="flavour" class="form-control">
					<option>-Select flavour-</option>
					<option value="Chacolate" <c:if test="${dto.getFlavour()=='Chacolate'}"> selected="selected"</c:if>>Chacolate</option>
					<option value="Strawberry" <c:if test="${dto.getFlavour()=='Strawberry'}"> selected="selected"</c:if>>Strawberry</option>
					<option value="Pista" <c:if test="${dto.getFlavour()=='Pista'}"> selected="selected"</c:if>>Pista</option>
				</select>
			</div>
			<div class="col">
				<select name="weight" class="form-control">
					<option>-Select weight-</option>
					<option value="1" <c:if test="${dto.getWeight()=='1'}"> selected="selected" </c:if>>1</option>
					<option value="2" <c:if test="${dto.getWeight()=='2'}"> selected="selected" </c:if>>2</option>
					<option value="3" <c:if test="${dto.getWeight()=='3'}"> selected="selected" </c:if>>3</option>
				</select>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<input type="number" class="form-control" name="price"
					placeholder="Price" value="${dto.getPrice()}"/>
			</div>
			<div class="col radio-btn">
                <h4>Take Away:</h4>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="takeAway" id="flexRadioDefault1" />
                    <label class="form-check-label" for="flexRadioDefault1" >Yes</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="takeAway" id="flexRadioDefault2" />
                    <label class="form-check-label" for="flexRadioDefault2">No</label>                
                </div>
            </div>
		</div>

		<div class="row">
			<div class="col">
				<button type="reset" class="form-control text-bg-secondary p-3">Reset</button>
			</div>
			<div class="col">
				<button type="submit" class="form-control text-bg-secondary p-3">Submit</button>
			</div>
		</div>
	</form>
	
</body>
</html>