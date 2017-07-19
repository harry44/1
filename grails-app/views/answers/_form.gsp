<%@ page import="com.jtechies.Answers" %>



<div class="fieldcontain ${hasErrors(bean: answersInstance, field: 'candidate', 'error')} required">
	<label for="candidate">
		<g:message code="answers.candidate.label" default="Candidate" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="candidate" name="candidate.id" from="${com.jtechies.Candidate.list()}" optionKey="id" required="" value="${answersInstance?.candidate?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: answersInstance, field: 'question', 'error')} required">
	<label for="question">
		<g:message code="answers.question.label" default="Question" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="question" name="question.id" from="${com.jtechies.Question.list()}" optionKey="id" required="" value="${answersInstance?.question?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: answersInstance, field: 'reply', 'error')} required">
	<label for="reply">
		<g:message code="answers.reply.label" default="Reply" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="reply" type="number" value="${answersInstance.reply}" required=""/>

</div>

