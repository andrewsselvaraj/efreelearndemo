<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
	<div>
		<div>
			<h1>Spring Boot JSP Example</h1>
			<h2>Hello andrrrreeee in VIEW${message}</h2>
			
			<form action="/validateUserandLogin" method="post">
			<input type="text" name="userName">
			<input type="text" name="password">
			<input type="submit"><input type="reset">
			</form>
		</div>
	</div>
</body>
</html>
