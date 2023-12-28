<!DOCTYPE html>
<html>
<head>
  <title>Survey Form</title>
  <style>
    .popup {
      display: none;
      position: fixed;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      padding: 20px;
      background-color: #fff;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
      z-index: 999;
    }
  </style>
</head>
<body>
  <form id="surveyForm">
    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" required><br>

    <label for="lastName">Last Name:</label>
    <input type="text" id="lastName" required><br>

    <label for="dob">Date of Birth:</label>
    <input type="date" id="dob" required><br>

    <label for="country">Country:</label>
    <select id="country" required>
      <option value="USA">USA</option>
      <option value="Canada">Canada</option>
      <option value="UK">UK</option>
      <!-- Add more options as needed -->
    </select><br>

    <label>Gender:</label>
    <input type="checkbox" id="male" name="gender" value="Male">
    <label for="male">Male</label>
    <input type="checkbox" id="female" name="gender" value="Female">
    <label for="female">Female</label>
    <br>

    <label for="profession">Profession:</label>
    <input type="text" id="profession" required><br>

    <label for="email">Email:</label>
    <input type="email" id="email" required><br>

    <label for="mobile">Mobile Number:</label>
    <input type="tel" id="mobile" required><br>

    <button type="button" onclick="submitForm()">Submit</button>
    <button type="button" onclick="resetForm()">Reset</button>
  </form>

  <div id="popup" class="popup">
    <h2>Survey Form Data</h2>
    <p>First Name: <span id="popupFirstName"></span></p>
    <p>Last Name: <span id="popupLastName"></span></p>
    <p>Date of Birth: <span id="popupDob"></span></p>
    <p>Country: <span id="popupCountry"></span></p>
    <p>Gender: <span id="popupGender"></span></p>
    <p>Profession: <span id="popupProfession"></span></p>
    <p>Email: <span id="popupEmail"></span></p>
    <p>Mobile Number: <span id="popupMobile"></span></p>
    <button onclick="closePopup()">Close</button>
  </div>

  <script>
    function submitForm() {
      // Get input values
      const firstName = document.getElementById("firstName").value;
      const lastName = document.getElementById("lastName").value;
      const dob = document.getElementById("dob").value;
      const country = document.getElementById("country").value;
      const gender = [...document.querySelectorAll('input[name="gender"]:checked')].map(g => g.value).join(', ');
      const profession = document.getElementById("profession").value;
      const email = document.getElementById("email").value;
      const mobile = document.getElementById("mobile").value;

      // Display input values in the popup
      document.getElementById("popupFirstName").textContent = firstName;
      document.getElementById("popupLastName").textContent = lastName;
      document.getElementById("popupDob").textContent = dob;
      document.getElementById("popupCountry").textContent = country;
      document.getElementById("popupGender").textContent = gender;
      document.getElementById("popupProfession").textContent = profession;
      document.getElementById("popupEmail").textContent = email;
      document.getElementById("popupMobile").textContent = mobile;

      // Show the popup
      document.getElementById("popup").style.display = "block";

      // Reset the form
      resetForm();
    }

    function closePopup() {
      document.getElementById("popup").style.display = "none";
    }

    function resetForm() {
      document.getElementById("surveyForm").reset();
    }
  </script>
</body>
</html>
