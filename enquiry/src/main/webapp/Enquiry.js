function handleName() {
	var button = document.getElementById("button");

	const name = document.getElementById("name").value;
		
	if (name.length > 3 && name.length <= 30 ) {
		
		document.getElementById("verify").innerHTML = "<span style='color:green'>  name is valid</span>";
		button.removeAttribute("disabled");
	}
	else {
		
		document.getElementById("verify").innerHTML = "<span style='color: red;'>  Name is Mandatory</span>";
		button.setAttribute("disabled", "");
	}
}

  function handleNumber(){
    var number = document.getElementById("number");
    var number = document.getElementById('number').value;
    console.log(number);
    if (number<1000000000 || number>9999999999 || !number.length===null) {
    document.getElementById("verify1").innerHTML = "<span style='color: red;'> Please enter valid mobileNumber here..</span>";
    return false;
    }
    else{
    document.getElementById("verify1").innerHTML ="<span style='color:green'>number is valid</span>";
    }
    }

function handleEmail() {
  const emailInput = document.getElementById('email');
  const email = emailInput.value;
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  const verifyElement = document.getElementById('verify2');

  if (emailRegex.test(email)) {
    document.getElementById("verify2").innerHTML ="<span style='color:green'>Email is valid</span>";
  } else {
   document.getElementById("verify2").innerHTML = "<span style='color:red'>Email is invalid</span>";
  }
}

function handleDate() {
  const dateInput = document.getElementById('date');
  const date = dateInput.value;

  const verifyElement = document.getElementById('verify3');

  if (isValidDate(date)) {
document.getElementById("verify3").innerHTML ="<span style='color:green'>Date  is valid</span>";  
} 
else 
{
document.getElementById("verify3").innerHTML ="<span style='color:red'>Date is invalid</span>";  }
}
function isValidDate(date) {
  const dateRegex = /^\d{4}-\d{2}-\d{2}$/;
  return dateRegex.test(date);
}


function handleLocation() {
		var location = document.getElementById("location");
		console.log(location.value)
		var button = document.getElementById("button");
		
		 if (location.value === 'choose') {
			document.getElementById("verify4").innerHTML = "<span style='color:red'>Please Select Valid Option</span>";
			button.setAttribute("disabled", "");
		} else {
			button.removeAttribute("disabled");
			return;
		} 
	}
	




   function handlePassword(){
		var password=document.getElementById("password").value;
		var password1=document.getElementById("password1").value;
		var button=document.getElementById("button");
		if(password.length>=8 && password.length<15 && password1===password){
			document.getElementById("verify5").innerHTML = "<span style='color:blue'>password is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("verify5").innerHTML = "<span style='color:red'>Please enter Valid password</span>";
			button.setAttribute("disabled", "");
			return;
		}
	}
  function Error(){
	   
	   const error=grecaptcha.getResponse();
	   const button=document.getElementById("Submit");
	   if(error.length===0){
		   button.setAttribute("disabled","disabled");
	   }else{
		   button.removeAttribute("disabled");
	   }
   }


function validate(){
		var name=document.getElementById("name").value;
		var number=document.getElementById("number").value;
		var location = document.getElementById("location").value;
		var email = document.getElementById("email").value;
		var password=document.getElementById("password").value;
		var password1=document.getElementById("password1").value;
		
		var button=document.getElementById("button");
		if(name.length>3 && name.length<30 && !name.length===null &&  number >1000000000 && number<9999999999 && !number.length===null && email.length>3 && email.length<40 && !email.length==="" && date.length!==null &&
			date.value &&	location.length!==null && location !== 'choose' && email.length<40 && password.length>=8 && password.length<15 && !password.length==="" && password1===password){
			document.getElementById("verify6").innerHTML = "<span style='color:blue'>info is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("verify6").innerHTML = "<span style='color:red'>Please enter Valid info</span>";
			button.setAttribute("disabled", "");
			return;
		}
	}



