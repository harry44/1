
<%@ page import="com.jtechies.ExamType" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'examType.label', default: 'ExamType')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-examType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-examType" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'examType.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="examName" title="${message(code: 'examType.examName.label', default: 'Exam Name')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'examType.lastUpdated.label', default: 'Last Updated')}" />
					
						<g:sortableColumn property="logo" title="${message(code: 'examType.logo.label', default: 'Logo')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${examTypeInstanceList}" status="i" var="examTypeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${examTypeInstance.id}">${fieldValue(bean: examTypeInstance, field: "dateCreated")}</g:link></td>
					
						<td>${fieldValue(bean: examTypeInstance, field: "examName")}</td>
					
						<td><g:formatDate date="${examTypeInstance.lastUpdated}" /></td>
					
						<td><img src="${createLink(controller:'ExamType',action:'showImage',id:examTypeInstance.id)}" style="height:60px;"/></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${examTypeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
