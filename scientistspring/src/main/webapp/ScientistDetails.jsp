<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scientist</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<!-- As a link -->
	<nav class="navbar" style="background-color: #e3f2fd;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">SCIENTIST</a> <a
				class="navbar-brand" href="index.jsp">Home</a>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<div class="form-control"
		style="width: 450px; height: 530px; margin-left: 38rem; border-color: green;">
		<form action="science" method="post">
			<p id="N"/>
			<div>
				<label>Scientist Name</label> <input type="text"
					name="scientsitName" class="form-control"
					value="${dto.scientsitName}" onblur="handleName()"
					id="scientsitName" />
			</div>
			
			<div>
				<label>Field</label><select class="form-control" name="field"
					onblur="handleField()" id="field" >
					<option selected="selected">Field</option>
					<option value="Psychologist"
						<c:if test="${dto.field=='Psychologist'}"> selected="selected"</c:if>>Psychologist</option>
					<option value="Biology"
						<c:if test="${dto.field=='Biology'}">selected="selected"</c:if>>Biology</option>
					<option value="Environmental Scientist"
						<c:if test="${dto.field=='Environmental Scientist'}">selected="selected"</c:if>>Environmental
						Scientist</option>
					<option value="Mathematics"
						<c:if test="${dto.field=='Mathematics'}">selected="selected"</c:if>>Mathematics</option>
					<option value="Physics"
						<c:if test="${dto.field=='Physics'}">selected="selected"</c:if>>Physics</option>
					<option value="Geologist"
						<c:if test="${dto.field=='Geologist'}">selected="selected"</c:if>>Geologist</option>
					<option value="Earth Science"
						<c:if test="${dto.field=='Earth Science'}">selected="selected"</c:if>>Earth
						Science</option>
				</select>
			</div>
			<div>
				<label >Experience</label> <input type="text" name="experience"
					class="form-control" value="${dto.experience}" onblur="handleExp()"
					id="experience" />
			</div>
			<div>
				<label>Country</label> <select class="form-control" name="country"
					onblur="handleCountry()" id="country">
					<option selected="selected">Country</option>
					<option value="India"
						<c:if test="${dto.country=='India'}">selected="selected"</c:if>>India</option>
					<option value="Japan"
						<c:if test="${dto.country=='Japan'}">selected="selected"</c:if>>Japan</option>
					<option value="USA"
						<c:if test="${dto.country=='USA'}">selected="selected"</c:if>>USA</option>
					<option value="China"
						<c:if test="${dto.country=='China'}">selected="selected"</c:if>>China</option>
					<option value="Brazil"
						<c:if test="${dto.country=='Brazil'}">selected="selected"</c:if>>Brazil</option>
					<option value="Germany"
						<c:if test="${dto.country=='Germany'}">selected="selected"</c:if>>Germany</option>
					<option value="Canada"
						<c:if test="${dto.country=='Canada'}">selected="selected"</c:if>>Canada</option>
					<option value="Denmark"
						<c:if test="${dto.country=='Denmark'}">selected="selected"</c:if>>Denmark</option>
					<option value="Finland"
						<c:if test="${dto.country=='Finland'}">selected="selected"</c:if>>Finland</option>
					<option value="France"
						<c:if test="${dto.country=='France'}">selected="selected"</c:if>>France</option>
					<option value="Indonesia"
						<c:if test="${dto.country=='Indonesia'}">selected="selected"</c:if>>Indonesia</option>
				</select>
			</div>
			<div>
				<label>Achievements</label> <input type="text" name="achievements"
					class="form-control" value="${dto.achievements}"
					onblur="handleAchievements()" id="achievements" />
			</div>
			<br>
			<div>
				<input type="submit" class="btn btn-success" value="Save"
					id="button" />
			</div>
		</form>
	</div>
	
</body>
</html>