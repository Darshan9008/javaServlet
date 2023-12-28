<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>    price : ${price}</h3>
<h3> Total price  is : ${total3 }</h3>
<script>
const now = new Date();

// get the current date and time as a string
const currentDateTime = now.toLocaleString();


document.write(currentDateTime);
</script>
</body>
</html>