<%@ page import="com.jtechies.Question" %>



<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'question', 'error')} required">
	<label for="question">
		<g:message code="question.question.label" default="Question" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="question" required="" value="${questionInstance?.question}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'option1', 'error')} required">
	<label for="option1">
		<g:message code="question.option1.label" default="Option1" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="option1" required="" value="${questionInstance?.option1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'option2', 'error')} required">
	<label for="option2">
		<g:message code="question.option2.label" default="Option2" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="option2" required="" value="${questionInstance?.option2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'option3', 'error')} required">
	<label for="option3">
		<g:message code="question.option3.label" default="Option3" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="option3" required="" value="${questionInstance?.option3}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'option4', 'error')} required">
	<label for="option4">
		<g:message code="question.option4.label" default="Option4" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="option4" required="" value="${questionInstance?.option4}"/>

</div>
<div class="fieldcontain ${hasErrors(bean: questionInstance, field: 'rightOption', 'error')} required">
	<label for="rightOption">
		<g:message code="question.rightOption.label" default="Right Option" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="rightOption" required="" value="${questionInstance?.rightOption}"/>

</div>

