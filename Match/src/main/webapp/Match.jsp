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
<script src="Match.js"></script>
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
	<br>
	<br>
	<div class="form-control" style="width: 450px; margin-left: 32rem;">
		<span style="color: skyblue;"><h1>MATCH DETAILS</h1></span>
		<form action="dhoni" method="post" onsubmit="return validateForm()">

			<h1>Match Information</h1>
			<span id="valid" style="padding-left: 80px"></span> <label
				for="tournamentName">Tournament Name</label>
			<p id="verify" />
			<div>
				<input type="text" id="tournamentName" name="tournamentName"
					class="form-control" onblur="handleTournamentName()">
			</div>
			<label for="hostingName">Hosting Country</label>
			<p id="country" />
			<div>
				<input type="text" id="hostingCountry" name="hostingCountry"
					class="form-control" onblur="handleHostingCountry()">
			</div>
			<label for="matchDate">Match Date</label>
			<p id="date" />
			<div>
				<input type="date" id="matchDate" name="matchDate"
					class="form-control" onblur="handleMatchDate()">
			</div>
			<label for="team1">Team 1</label>
			<p id="team" />
			<div>
				<input type="text" id="team1" name="team1" class="form-control"
					onblur="handleTeam1()">
			</div>
			<label for="team 2">Team 2</label>
			<p id="teamm" />
			<div>
				<input type="text" id="team2" name="team2" class="form-control"
					onblur="handleTeam2()">
			</div>
			<label for="team1CaptainName">Team 1 Captain Name</label>
			<p id="team1Captain" />
			<div>
				<input type="text" id="team1CaptainName" name="team1CaptainName"
					class="form-control" onblur="handleTeam1CaptainName()">
			</div>
			<label for="team2CaptainName">Team 2 Captain Name</label>
			<p id="team2Captain" />
			<div>
				<input type="text" id="team2CaptainName" name="team2CaptainName"
					class="form-control" onblur="handleTeam2CaptainName()">
			</div>
			<label for="umpireName">Umpire Name</label>
			<p id="umpire" />
			<div>
				<input type="text" id="umpireName" name="umpireName"
					class="form-control" onblur="handleUmpireName()">
			</div>
			<label for="stadiumName">Stadium Name</label>
			<p id="stadium" />
			<div>
				<input type="text" id="stadiumName" name="stadiumName"
					class="form-control" onblur="handleStadiumName()">
			</div>
			<label for="thirdUmpireName">Third Umpire Name</label>
			<p id="thiredUmpire" />
			<div>
				<input type="text" id="thirdUmpireName" name="thirdUmpireName"
					class="form-control" onblur="handleThirdUmpireName()">
			</div>
			<label for="stadiumCapcity">Stadium Capacity</label>
			<p id="capacity" />
			<div>
				<input type="number" id="stadiumCapcity" name="stadiumCapcity"
					class="form-control" onblur="handleStadiumCapcity()">
			</div>
			<div>
				<br> <input type="submit" class="btn btn-primary"
					value="Submit" id="button">
			</div>
		</form>
	</div>

</body>
</html>