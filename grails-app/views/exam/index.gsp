
<%@ page import="com.jtechies.Exam" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'exam.label', default: 'Exam')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-exam" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-exam" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="exam.candidate.label" default="Candidate" /></th>
					
						<g:sortableColumn property="total" title="${message(code: 'exam.total.label', default: 'Total')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${examInstanceList}" status="i" var="examInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${examInstance.id}">${examInstance.candidate.firstName}&nbsp; ${examInstance.candidate.lastName}</g:link></td>
					
						<td>${fieldValue(bean: examInstance, field: "total")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${examInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
