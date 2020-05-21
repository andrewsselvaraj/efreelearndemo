<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

        <form:form method="POST"
          action="/validateUserandLogin" modelAttribute="employee">
             <table>
                <tr>
                    <td><form:label path="lblusername">Name</form:label></td>
                    <td><form:input path="username"/></td>
                </tr>
                <tr>
                    <td><form:label path="lblpassword">Id</form:label></td>
                    <td><form:input path="password"/></td>
                </tr>

                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

