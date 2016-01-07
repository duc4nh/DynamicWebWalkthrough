<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example website</title>
</head>
<body>
	<div>
		<p>Welcome to my example site.</p>
	</div>

	<div>
		<a href="registration.jsp">Take me to Page 1 test</a>
		<br/>
		<a href="WEB-INF/registrationConfirm.jsp">Take me to Page 2</a>
		<br/>
		<a href="allMovies">Movies</a>
		<br/>
	</div>
	
	<div>
		<a href="users/home">Click here to log in</a>
	</div>
	
	<%@include file="WEB-INF/footer.jsp" %>
</body>
</html>