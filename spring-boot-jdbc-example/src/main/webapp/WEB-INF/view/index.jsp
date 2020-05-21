<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
    <title>Add Employee Form</title>
</head>
 
<body>

    <br/>
    <form:form method="post" action="validateUserandLogin" modelAttribute="user">
        <table>
            <tr>
                <td><spring:message code="firstName" text="First Name" /></td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.lastName" text="Last Name" /></td>
                <td><form:input path="password" /></td>
            </tr>
            
            <tr>
                <td colspan="2"><input type="submit" value="Submit"/></td>
            </tr>

        </table>
    </form:form>
</body>
</html>