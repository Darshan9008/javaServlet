<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Match</title>
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
	<div>
		<nav class="navbar bg-primary">
			<div>
				<span
					style="color: white; text-transform: uppercase; font-size: 20px; padding-left: 10px;"><b>cricket</b></span>
			</div>
		</nav>
		</div>
		
		<div>
		<h1>Match Information</h1>
		<h1>Tournament Name :${cricket.tournamentName}</h1>
		<h1>Hosting Country :${cricket.hostingCountry}</h1>
		<h1>Match Date :${cricket.matchDate}</h1>
		<h1>Team 1 :${cricket.team1}</h1>
		<h1>Team 2 :${cricket.team2}</h1>
		<h1>Team 1 Captain Name :${cricket.team1CaptainName}</h1>
		<h1>Team 2 Captain Name:${cricket.team2CaptainName}</h1>
		<h1>Umpire Name:${cricket.umpireName}</h1>
		<h1>Stadium Name :${cricket.stadiumName}</h1>
		<h1>Third Umpire Name:${cricket.thirdUmpireName}</h1>
		<h1>Stadium Capacity:${cricket.stadiumCapcity}</h1>
		
		</div>
		
</body>
</html>