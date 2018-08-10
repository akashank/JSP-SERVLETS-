<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<jsp:include page = "Header.jsp"></jsp:include>
</div>


<form name = "Login" method = "post"> 
                Username: <input type = "text" name = "username"/><br/>
                Password: <input type = "password" name = "password"/><br/>
<input type = "submit" value = "login" />

</form>
<div>
<jsp:include page = "Footer.jsp"></jsp:include>
</div>


</body>
</html>