<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
	<h2>Spring MVC and List Example</h2>
	
	<h2>Hello andrrrreeee in VIEW${userName}</h2>
https://stackoverflow.com/questions/31223395/how-to-paginate-using-only-jstl-cforeach-without-javascript-or-jquery
https://gist.github.com/need4spd/4662423
http://www.javaknowledge.info/jstl-1-1-paginate-table-example-with-next-previous-features/
	<c:if test="${not empty allquestionAnswers}">

		<ul>
			<c:forEach var="questionAnswers" items="${allquestionAnswers}">
				<li>${questionAnswers.question.questionName}</li>
				<c:forEach var="answerObject" items="${questionAnswers.answers}">	
				<ul>		
				<li>${answerObject.answer}</li>8908098080
				</ul>
				</c:forEach>
				<input type="submit">kkl;lk;lk;k;lkl;k;k;lk;lk;l
			</c:forEach>
		</ul>

	</c:if>
	
	