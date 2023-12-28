<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	
<!DOCTYPE html>
<html>
<head>
<style>
.design {
	padding: 20px;
	margin: 20px 0;
	border: 2px solid #eee;
	box-shadow: 0 0 15px 4px rgba(1, 2, 2, 0.06);
	border-radius: 10px;
	color: #333;
	width: 40%;
	padding: 12px 60px;
	margin: 8px 0;
	box-sizing: border-box;
	border: 2px solid red;
	border-radius: 4px;
	background-position: 10px 10px;
	margin: 4px 2px;
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

	<nav class="navbar navbar-expand-lg "
		style="background-color: LightGray;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">LOGIN_HOME</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp"><b>HOME_PAGE</b></a></li>


					<form class="d-flex">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
			</div>
		</div>
	</nav>
	<br>

	<span style='color: red;'> <c:forEach var="objectErrors"
			items="${error}"> ${objectErrors.defaultMessage}<br>
		</c:forEach>
	</span>
	
	<br>
	 <span>${msg}</span>

	<form action="virat" method="post" class="design">
		<div>
			<label for="name">Name</label> <input type="text" name="name"
				id="name" placeholder="Name" value="${dto.name}">
		</div>
		<br>

		<div>
			<label for="singer">Singer</label> <select id="singer" name="singer">
				<option selected value="selected">Selected</option>
				<option value="Sonu"
						<c:if test="${dto.field=='Sonu'}"> selected="selected"</c:if>>Sonu</option>
				<option value="RajeshKrishnan"
					<c:if test="${dto.field=='RajeshKrishnan'}">selected="selected"</c:if>>Rajesh Krishnan</option>
				<option value="Arijit"
					<c:if test="${dto.field=='Arijit'}">selected="selected"</c:if>>Arijit</option>
				<option value="ArmanMalik"
					<c:if test="${dto.field=='ArmanMalik'}">selected="selected"</c:if>>Arman
					Malik</option>
				<option value="SPB"
					<c:if test="${dto.field=='SPB'}">selected="selected"</c:if>>SPB</option>
			</select>
		</div>
		<br>

		<div>
			<label for="composer">Composer</label> <input type="text"
				name="composer" id="composer" placeholder="composer"
				value="${dto.composer}">
		</div>
		<br>

		<div>
			<label for="duration">Duration</label> <input type="text"
				name="duration" id="duration" placeholder="duration"
				value="${dto.duration}">
		</div>
		<br>

		<div>
			<label for="album">Album</label> <input type="text" name="album"
				id="album" placeholder="album" value="${dto.album}">
		</div>
		<br>

		<div>
			<label for="language">Language</label> <select id="language"
				name="language">
				<option selected value=" ">Selected</option>
				<option value="kannada"
					<c:if test="${dto.field=='kannada'}">selected="selected"</c:if>>Kannada</option>
				<option value="english"
					<c:if test="${dto.field=='english'}">selected="selected"</c:if>>English</option>
				<option value="hindi"
					<c:if test="${dto.field=='hindi'}">selected="selected"</c:if>>Hindi</option>
				<option value="telugu"
					<c:if test="${dto.field=='telugu'}">selected="selected"</c:if>>Telugu</option>
				<option value="tamil"
					<c:if test="${dto.field=='tamil'}">selected="selected"</c:if>>Tamil</option>
			</select>
		</div>
		<br>


		<div>
			<label for="releaseDate">Release Date</label> <input type="text"
				name="releaseDate" id="releaseDate" placeholder="Release Date"
				value="${dto.releaseDate}">
		</div>
		<br>

		<div>
			<label for="producer">Producer</label> <input type="text"
				name="producer" id="producer" placeholder="producer"
				value="${dto.producer}">
		</div>
		<br>

		<div>
			<label for="director">Director</label> <input type="text"
				name="director" id="director" placeholder="director"
				value="${dto.director}">
		</div>
		<br> <input type="submit" value="save" class="btn btn-primary">







	</form>
</body>
</html>