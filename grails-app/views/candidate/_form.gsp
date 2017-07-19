<%@ page import="com.jtechies.Candidate" %>

<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="candidate.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${candidateInstance?.firstName}"/>

</div>
<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="candidate.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${candidateInstance?.lastName}"/>

</div>
<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="candidate.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${candidateInstance?.email}"/>

</div>


<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'mobile', 'error')} required">
	<label for="mobile">
		<g:message code="candidate.mobile.label" default="Mobile" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="mobile" required="" value="${candidateInstance?.mobile}"/>

</div>


<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'addressLine1', 'error')} ">
	<label for="addressLine1">
		<g:message code="candidate.addressLine1.label" default="Address Line1" />
		
	</label>
	<g:textField name="addressLine1" value="${candidateInstance?.addressLine1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="candidate.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${candidateInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'state', 'error')} ">
	<label for="state">
		<g:message code="candidate.state.label" default="State" />
		
	</label>
	<g:textField name="state" value="${candidateInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: candidateInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="candidate.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${candidateInstance?.country}"/>

</div>







