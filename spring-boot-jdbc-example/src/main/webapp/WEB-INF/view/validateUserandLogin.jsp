<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	<h2>Efreelearn</h2>
	
	
<c:set var="perPage" scope="session"  value="10"/>
<c:set var="totalCount" scope="session" value="${fn:length(allquestionAnswers)}"/>


Total Count : ${totalCount}
 
	<c:if test="${not empty allquestionAnswers}">
<form:form method="POST" action="/questionController" modelAttribute="question">
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
</form:form>
	</c:if>
</body>
</html>