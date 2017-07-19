<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'exam.label', default: 'Exam')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
	<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
	<h1>Result: ${session.candidate.firstName} &nbsp; ${session.candidate.lastName}</h1>
	<hr>
	<table>
	
	<tr><td>Email:${session.candidate.email}</td><td>Mobile:${session.candidate.mobile}</td></tr>
	</table>
	<hr>
	<table>
	
	<tr><td colspan="2" align="center"><center>Answers Replyed</center>
	<hr></td></tr>
	<g:set var="countPoint" value="0"></g:set>
		<g:set var="total" value="${Integer.parseInt("0") }"></g:set>
	<g:each in="${com.jtechies.Answers.findAllByCandidate(session.candidate) }" status="i" var="answer">
	<tr>
	<td colspan="2" >${answer.question.question }</td>
	</tr>
	<tr>
<td><input type="radio" ${answer.reply==1?'checked':null} value="1">${answer.question.option1 }</td><td><input type="radio" value="2" ${answer.reply==2?'checked':null}>${answer.question.option2 }</td>
</tr>
<tr>
<td><input type="radio" value="3" ${answer.reply==3?'checked':null}>${answer.question.option3 }</td><td><input type="radio" value="4" ${answer.reply==4?'checked':null}>${answer.question.option4 }</td>
</tr>
<tr><td colspan="2"> ${answer.reply==answer.question?.rightOption?'Correct : +1':'Incorrect: 0'} </td></tr>
	<g:set var="countPoint" value="${Integer.parseInt(answer.reply==answer.question?.rightOption?'1':'0')}"></g:set>
	<g:set var="total" value="${total=total+countPoint }"></g:set>
	<tr><td colspan="2"><hr></td></tr>
	</g:each>
	</table>
	<hr>
<h1>Total Points : ${total } </h1>

</body>
</html>
