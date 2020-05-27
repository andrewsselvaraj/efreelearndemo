<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
	<h2>Spring MVC and List Example</h2>
	
	<h2>Hello andrrrreeee in VIEW${userName}</h2>
<c:set var="perPage" scope="session"  value="10"/>
<c:set var="totalCount" scope="session" value="${fn:length(allquestionAnswers)}"/>


Total Count : ${totalCount}
 
	<c:if test="${not empty allquestionAnswers}">

		<ul>
			<c:forEach var="questionAnswers" items="${allquestionAnswers}">
				<li>${questionAnswers.question.questionName}</li>
				<c:forEach var="answerObject" items="${questionAnswers.answers}">	
				<ul>		
				<li>${answerObject.answer} </li>
				<li>${perPage} </li>
				</ul>
				</c:forEach>
				<input type="submit">
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>