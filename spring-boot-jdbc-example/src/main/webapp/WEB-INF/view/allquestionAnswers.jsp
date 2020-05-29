<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>
	
	<h2>Hello andrrrreeee in VIEW${userName}</h2>

	<c:if test="${not empty allquestionAnswers}">

		<ul>
			<c:forEach var="questionAnswers" items="${allquestionAnswers}">
				<li>${questionAnswers.question.questionName}</li>
				<c:forEach var="answerObject" items="${questionAnswers.answers}">	
				<ul>		
				<li>${answerObject.answer}</li>
				</ul>
				</c:forEach>
				<input type="submit">kkl;lk;lk;k;lkl;k;k;lk;lk;l
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>