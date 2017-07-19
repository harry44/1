<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'candidate.label', default: 'Candidate')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
	<b>Total Questions:${questions.size()} </b> <b>Time:</b>${new Date() }
	<b style="float:right;">${session.candidate.firstName } &nbsp; ${session.candidate.lastName }</b>
	<br>
	
	<g:each in="${questions}" var="question" status="i">
	<a href="${question.id }">${i+1 }</a> |
	</g:each>
	<form action="../saveAnswers">
<table>

<g:each in="${questions}" var="question" status="i">
<tr>
<td colspan="2">
<h3>[${i+1 }]:${question.question }</h3></td>
<hr>
</tr>
<tr>
<td>(1):: <input type="radio" value="1" name="question.${question.id }" required>${question.option1 }</td><td>(2):: <input type="radio" name="question.${question.id }" required value="2">${question.option2 }</td>
</tr>
<tr>
<td>(3):: <input type="radio" value="3" name="question.${question.id }" required>${question.option3 }</td><td>(4):: <input type="radio" name="question.${question.id }"  required value="4">${question.option4 }</td>
</tr>
</g:each>
</table>
<input type="submit" value="Save">
</form>
</body>
</html>