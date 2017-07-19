<table>
<g:each in="${questions }" var="question">
<tr>
<td colspan="2">
<h3>${question.question }</h3></td>
<hr>
</tr>
<tr>
<td><input type="radio" value="1">${question.option1 }</td><td><input type="radio" value="2">${question.option2 }</td>
</tr>
<tr>
<td><input type="radio" value="3">${question.option3 }</td><td><input type="radio" value="4">${question.option4 }</td>
</tr>
</g:each>
</table>