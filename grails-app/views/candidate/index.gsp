
<%@ page import="com.jtechies.Candidate" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'candidate.label', default: 'Candidate')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-candidate" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-candidate" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addressLine1" title="${message(code: 'candidate.addressLine1.label', default: 'Address Line1')}" />
					
						<g:sortableColumn property="state" title="${message(code: 'candidate.state.label', default: 'State')}" />
					
						<g:sortableColumn property="country" title="${message(code: 'candidate.country.label', default: 'Country')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'candidate.lastName.label', default: 'Last Name')}" />
					
						<g:sortableColumn property="city" title="${message(code: 'candidate.city.label', default: 'City')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'candidate.email.label', default: 'Email')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${candidateInstanceList}" status="i" var="candidateInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${candidateInstance.id}">${fieldValue(bean: candidateInstance, field: "addressLine1")}</g:link></td>
					
						<td>${fieldValue(bean: candidateInstance, field: "state")}</td>
					
						<td>${fieldValue(bean: candidateInstance, field: "country")}</td>
					
						<td>${fieldValue(bean: candidateInstance, field: "lastName")}</td>
					
						<td>${fieldValue(bean: candidateInstance, field: "city")}</td>
					
						<td>${fieldValue(bean: candidateInstance, field: "email")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${candidateInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
