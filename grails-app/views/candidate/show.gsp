
<%@ page import="com.jtechies.Candidate" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'candidate.label', default: 'Candidate')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-candidate" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-candidate" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list candidate">
			
				<g:if test="${candidateInstance?.addressLine1}">
				<li class="fieldcontain">
					<span id="addressLine1-label" class="property-label"><g:message code="candidate.addressLine1.label" default="Address Line1" /></span>
					
						<span class="property-value" aria-labelledby="addressLine1-label"><g:fieldValue bean="${candidateInstance}" field="addressLine1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${candidateInstance?.state}">
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="candidate.state.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${candidateInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${candidateInstance?.country}">
				<li class="fieldcontain">
					<span id="country-label" class="property-label"><g:message code="candidate.country.label" default="Country" /></span>
					
						<span class="property-value" aria-labelledby="country-label"><g:fieldValue bean="${candidateInstance}" field="country"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${candidateInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="candidate.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${candidateInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${candidateInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="candidate.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${candidateInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${candidateInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="candidate.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${candidateInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${candidateInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="candidate.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${candidateInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${candidateInstance?.mobile}">
				<li class="fieldcontain">
					<span id="mobile-label" class="property-label"><g:message code="candidate.mobile.label" default="Mobile" /></span>
					
						<span class="property-value" aria-labelledby="mobile-label"><g:fieldValue bean="${candidateInstance}" field="mobile"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:candidateInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${candidateInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
