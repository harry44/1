<%@ page import="com.jtechies.ExamType" %>



<div class="fieldcontain ${hasErrors(bean: examTypeInstance, field: 'examName', 'error')} required">
	<label for="examName">
		<g:message code="examType.examName.label" default="Exam Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="examName" required="" value="${examTypeInstance?.examName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: examTypeInstance, field: 'logo', 'error')} required">
	<label for="logo">
		<g:message code="examType.logo.label" default="Logo" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" id="logo" name="logo" />

</div>

