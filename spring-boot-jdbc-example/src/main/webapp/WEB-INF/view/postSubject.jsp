<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div>
		<div>
			<h1>Spring Boot JSP Example</h1>
			<h2>POST USER</h2>

			<form action="/postSubject" method="post">
			
			<input type="text" name="pk_Subjectid" value="123456789">
			<input type="text" name="Subjectname">
 
			<input type="text" name="fk_schoolid" value="0">
			<input type="text" name="description" value="des">
			<input type="text" name="createdby" value="c">
			<input type="text" name="lastupdateed" value="1">
			<input type="text" name="status" value="1">
			<input type="submit"><input type="reset">
			</form>
		</div>
	</div>

</body>
</html>