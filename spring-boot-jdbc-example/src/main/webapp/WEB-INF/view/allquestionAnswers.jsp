<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>

	<c:if test="${not empty allquestionAnswers}">

		<ul>
			<c:forEach var="questionAnswers" items="${allquestionAnswers}">
				<li>${questionAnswers.questionName}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>