function handleSiNo() {
	var button = document.getElementById("button");

	const sino = document.getElementById("sino").value;


	if (sino.length > 3 && sino.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("verify").innerHTML = "<span style='color:green'> sino is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify").innerHTML = "<span style='color: red;'> sino is Mandatory</span>";
	}
}

function handleFname() {
	var button = document.getElementById("button");

	const fname = document.getElementById("fname").value;


	if (fname.length > 3 && fname.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("verify1").innerHTML = "<span style='color:green'> first name is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify1").innerHTML = "<span style='color: red;'> first Name is Mandatory</span>";
	}
}

function handleLname() {
	var button = document.getElementById("button");

	const lname = document.getElementById("lname").value;


	if (lname.length > 3 && lname.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("verify2").innerHTML = "<span style='color:green'> last name is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify2").innerHTML = "<span style='color: red;'> last Name is Mandatory</span>";
	}
}


function handleMname() {
	var button = document.getElementById("button");

	const mname = document.getElementById("mname").value;


	if (mname.length > 3 && mname.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("verify3").innerHTML = "<span style='color:green'> middle name is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify3").innerHTML = "<span style='color: red;'> middle Name is Mandatory</span>";
	}
}

function handleEmail() {
	var button = document.getElementById("button");

	const email = document.getElementById("email").value;
	 var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;


	if (email.value.match(validRegex)) {
		button.removeAttribute("disabled");
		document.getElementById("verify4").innerHTML = "<span style='color:green'> email is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify4").innerHTML = "<span style='color: red;'> email is not valid</span>";
	}
}

function handleGender() {
	var button = document.getElementById("button");

	const gender = document.getElementById("gender").value;


	if (gender.length > 3 && gender.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("verify5").innerHTML = "<span style='color:green'> gender is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify5").innerHTML = "<span style='color: red;'> gender is Mandatory</span>";
	}
}

function handlePhno() {
	var button = document.getElementById("button");

	const phno = document.getElementById("phno").value;


	if (phno.length ===10 ) {
		button.removeAttribute("disabled");
		document.getElementById("verify6").innerHTML = "<span style='color:green'> number is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify6").innerHTML = "<span style='color: red;'> number is Mandatory</span>";
	}
}


function handleArea() {
	var button = document.getElementById("button");

	const area = document.getElementById("area").value;


	if (area.length > 3 && area.length <= 30) {
		button.removeAttribute("disabled");
		document.getElementById("verify7").innerHTML = "<span style='color:green'> area is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify7").innerHTML = "<span style='color: red;'> area is Mandatory</span>";
	}
}

function handlePincode() {
	var button = document.getElementById("button");

	const pincode = document.getElementById("pincode").value;


	if (pincode.length ===6) {
		button.removeAttribute("disabled");
		document.getElementById("verify8").innerHTML = "<span style='color:green'> pincode is valid</span>";
	}
	else {
		button.setAttribute("disabled", "");
		document.getElementById("verify8").innerHTML = "<span style='color: red;'> pincode is Mandatory</span>";
	}
}


function validateForm() {
		const sino = document.getElementById("sino").value;
			const fname = document.getElementById("fname").value;
				const lname = document.getElementById("lname").value;
	const mname = document.getElementById("mname").value;
		const email = document.getElementById("email").value;
			const gender = document.getElementById("gender").value;
	const phno = document.getElementById("phno").value;
		const area = document.getElementById("area").value;
			const pincode = document.getElementById("pincode").value;
			
			if(  sino.length > 3 && sino.length <= 30 && fname.length > 3 && fname.length <= 30 && lname.length > 3 && lname.length <= 30 && mname.length > 3 && mname.length <= 30
			 && gender.length > 3 && gender.length <= 30 && email.value.match(validRegex) && phno.length ===10 &&
		area.length > 3 && area.length <= 30 && pincode.length ===6 ){
			document.getElementById("valid").innerHTML = "<span style='color:blue'>Information valid</span>";
		button.removeAttribute("disabled");
	} else {
		document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter Valid valid Information</span>";
		button.setAttribute("disabled", "");
		}







	






