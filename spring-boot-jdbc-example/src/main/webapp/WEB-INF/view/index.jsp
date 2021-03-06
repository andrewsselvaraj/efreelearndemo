<%@ page contentType="text/html;charset=UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<html>
<head>
  <title>EfreeLearn</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
 
<body>
		<h2 align="center">EfreeLearn</h2>
    
    <form:form method="post" action="validateUserandLogin" modelAttribute="user">
        <table class="table">
            <tr>
                <td><spring:message code="firstName" text="First Name" /></td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.lastName" text="Last Name" /></td>
                <td><form:input path="password" /></td>
            </tr>
            
            <tr>
                <td ><input type="submit" value="Submit"/></td>
                <td ><input type="reset" value="Cancel"/></td>
            </tr>

        </table>
    </form:form>
    
        
    
</body>
</html>