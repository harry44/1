
<%@ page import="com.jtechies.Answers" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'answers.label', default: 'Answers')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-answers" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-answers" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="answers.candidate.label" default="Candidate" /></th>
					
						<th><g:message code="answers.question.label" default="Question" /></th>
					
						<g:sortableColumn property="reply" title="${message(code: 'answers.reply.label', default: 'Reply')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${answersInstanceList}" status="i" var="answersInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${answersInstance.id}">${fieldValue(bean: answersInstance, field: "candidate")}</g:link></td>
					
						<td>${fieldValue(bean: answersInstance, field: "question")}</td>
					
						<td>${fieldValue(bean: answersInstance, field: "reply")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${answersInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
