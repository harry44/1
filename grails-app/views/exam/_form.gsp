<%@ page import="com.jtechies.Exam" %>



<div class="fieldcontain ${hasErrors(bean: examInstance, field: 'candidate', 'error')} required">
	<label for="candidate">
		<g:message code="exam.candidate.label" default="Candidate" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="candidate" name="candidate.id" from="${com.jtechies.Candidate.list()}" optionKey="id" required="" value="${examInstance?.candidate?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: examInstance, field: 'total', 'error')} required">
	<label for="total">
		<g:message code="exam.total.label" default="Total" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="total" value="${fieldValue(bean: examInstance, field: 'total')}" required=""/>

</div>

