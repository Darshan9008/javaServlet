function handleTournamentName() {
	var button = document.getElementById("button");

	const tournamentName = document.getElementById("tournamentName").value;


	if (tournamentName.length > 3 && tournamentName.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("verify").innerHTML = "<span style='color:green'> Tournament name is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify").innerHTML = "<span style='color: red;'> Tournament Name is Mandatory</span>";
	}
}

function handleHostingCountry() {
	var button = document.getElementById("button");
	const hostingCountry = document.getElementById("hostingCountry").value;

	if (hostingCountry.length > 3 && hostingCountry.length <= 20) {
		button.removeAttribute("disabled");
		document.getElementById("country").innerHTML = "<span style='color:green'> Hosting Country is valid </span>";
	} else {
		button.setAttribute("disabled", "");
		document.getElementById("country").innerHTML = "<span style='color:red'>Mention the Hosting Country </span>";
	}
}

function handleMatchDate() {
	var button = document.getElementById("button");
	const matchDate = document.getElementById("matchDate").value;

	if (matchDate !== "") {
		button.removeAttribute("disabled");
		document.getElementById("date").innerHTML = "<span style='color:green'> Match Date is valid </span>";

	} else {
		button.setAttribute("disabled", "")
		document.getElementById("date").innerHTML = "<span style='color:red'> Match Date is Mandatory </span>";
	}
}

function handleTeam1() {
	var button = document.getElementById("button");
	const team1 = document.getElementById("team1").value;

	if (team1.length > 3 && team1.length <= 20) {
		button.removeAttribute("disabled");
		document.getElementById("team").innerHTML = "<span style='color:green'> Team 1 name is valid </span>";

	} else {
		button.setAttribute("disabled", "");
		document.getElementById("team").innerHTML = "<span style='color:red'>Team 1 should be named </span>";
	}
}

function handleTeam2() {
	var button = document.getElementById("button");
	const team2 = document.getElementById("team2").value;

	if (team2.length > 3 && team2.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("teamm").innerHTML = "<span style='color:green'> Team 2 name is valid </span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("teamm").innerHTML = "<span style='color: red;'> Team 2 should be named</span>";
	}
}

function handleTeam1CaptainName() {
	var button = document.getElementById("button");
	const team1CaptainName = document.getElementById("team1CaptainName").value;

	if (team1CaptainName.length > 3 && team1CaptainName.length <= 25) {
		button.removeAttribute("disabled");
		document.getElementById("team1Captain").innerHTML = "<span style='color:green'> Team 1 Captain Name is Valid </span>";
	} else {
		button.setAttribute("disabled", "");
		document.getElementById("team1Captain").innerHTML = "<span style='color:red'> Team 1 Captain Name is Mandatory</span>";
	}
}

function handleTeam2CaptainName() {
	var button = document.getElementById("button");
	const team2CaptainName = document.getElementById("team2CaptainName").value;

	if (team2CaptainName.length > 3 && team2CaptainName.length <= 25) {
		button.removeAttribute("disabled");
		document.getElementById("team2Captain").innerHTML = "<span style='color:green'> Team 1 Captain Name is Valid </span>";
	} else {
		button.setAttribute("disabled", "");
		document.getElementById("team2Captain").innerHTML = "<span style='color:red'> Team 2 Captain Name is Mandatory </span>";
	}
}

function handleUmpireName() {
	var button = document.getElementById("button");
	const umpireName = document.getElementById("umpireName").value;

	if (umpireName.length > 3 && umpireName.length <= 25) {
		button.removeAttribute("disabled");
		document.getElementById("umpire").innerHTML = "<span style='color:green'> Umpire Name is Valid </span>";
	} else {
		button.setAttribute("disabled", "");
		document.getElementById("umpire").innerHTML = "<span style='color:red'>Mention Umpire Name </span>";
	}
}

function handleStadiumName() {
	var button = document.getElementById("button");
	const stadiumName = document.getElementById("stadiumName").value;

	if (stadiumName.length > 3 && stadiumName.length <= 25) {
		button.removeAttribute("disabled");
		document.getElementById("stadium").innerHTML = "<span style='color:green'> Stadium Name is Valid </span>";
	} else {
		button.setAttribute("disabled", "");
		document.getElementById("stadium").innerHTML = "<span style='color:red'> Stadium Name is invalid </span>";
	}
}

function handleThirdUmpireName() {
	var button = document.getElementById("button");
	const thirdUmpireName = document.getElementById("thirdUmpireName").value;

	if (thirdUmpireName.length > 3 && thirdUmpireName.length <= 25) {
		button.removeAttribute("disabled");
		document.getElementById("thirdUmpire").innerHTML = "<span style='color:green'>Third Umpire Name is Valid </span>";
	} else {
		button.setAttribute("disabled", "");
		document.getElementById("thirdUmpire").innerHTML = "<span style='color:red'> Third Umpire Name is invalid </span>";
	}
}

function handleStadiumCapcity() {

	var button = document.getElementById("button");
	const stadiumCapcity = document.getElementById("stadiumCapcity").value;

	if (stadiumCapcity > 2000 && stadiumCapcity <= 50000) {
		button.removeAttribute("disabled");
		document.getElementById("capacity").innerHTML = "<span style='color:green'>Stadium Capacity is Valid</span>";
	} else {
		button.setAttribute("disabled", "");
		document.getElementById("capacity").innerHTML = "<span style='color:red'>Stadium Capacity is Mandatory</span>";
	}
}
function validateForm() {
	const tournamentName = document.getElementById("tournamentName").value;
	const hostingCountry = document.getElementById("hostingCountry").value;
	const matchDate = document.getElementById("matchDate").value;
	const team1 = document.getElementById("team1").value;
	const team2 = document.getElementById("team2").value;
	const team1CaptainName = document.getElementById("team1CaptainName").value;
	const team2CaptainName = document.getElementById("team2CaptainName").value;
	const umpireName = document.getElementById("umpireName").value;
	const stadiumName = document.getElementById("stadiumName").value;
	const thirdUmpireName = document.getElementById("thirdUmpireName").value;
	const stadiumCapcity = document.getElementById("stadiumCapcity");
	var button = document.getElementById("button");
	if (tournamentName.length >= 3 && tournamentName.length < 30 && hostingCountry.length >= 3 && hostingCountry.length < 30 && matchDate > 0 && matchDate <= 31 && team1.length >= 3 &&
		team1.length < 30 && team2.length >= 3 && team2.length < 30 && team1CaptainName.length >= 3 && team1CaptainName.length < 30 && team2CaptainName.length >= 3
		&& team2CaptainName.length < 30 && umpireName.length >= 3 && umpireName.length < 30 && stadiumName.length >= 3 && stadiumName.length < 30 &&
		thirdUmpireName.length >= 3 && thirdUmpireName.length < 30 && stadiumCapcity > 2000 && stadiumCapcity <= 50000) {
		document.getElementById("valid").innerHTML = "<span style='color:blue'>Information valid</span>";
		button.removeAttribute("disabled");
	} else {
		document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter Valid valid Information</span>";
		button.setAttribute("disabled", "");

	}
}

