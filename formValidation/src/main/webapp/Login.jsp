<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>  
function validateform(){  
var name=document.myform.name.value;  
var password=document.myform.password.value;  
  
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
} 
}  
</script>  
 
<form name="myform" method="post" action="FormValidate.jsp" onsubmit="return validateform()" >  
Name: <input type="text" name="name"><br/><br> 
Type: <input type="text" name="type"><br/><br>




 


<input type="submit" value="register">  
</form>  

</body>
</html>