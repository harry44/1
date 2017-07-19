import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechies_examquestions_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/exam/questions.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'candidate.label', default: 'Candidate'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(questions.size())
printHtmlPart(4)
expressionOut.print(new Date())
printHtmlPart(5)
expressionOut.print(session.candidate.firstName)
printHtmlPart(6)
expressionOut.print(session.candidate.lastName)
printHtmlPart(7)
loop:{
int i = 0
for( question in (questions) ) {
printHtmlPart(8)
expressionOut.print(question.id)
printHtmlPart(9)
expressionOut.print(i+1)
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
loop:{
int i = 0
for( question in (questions) ) {
printHtmlPart(12)
expressionOut.print(i+1)
printHtmlPart(13)
expressionOut.print(question.question)
printHtmlPart(14)
expressionOut.print(question.id)
printHtmlPart(15)
expressionOut.print(question.option1)
printHtmlPart(16)
expressionOut.print(question.id)
printHtmlPart(17)
expressionOut.print(question.option2)
printHtmlPart(18)
expressionOut.print(question.id)
printHtmlPart(15)
expressionOut.print(question.option3)
printHtmlPart(19)
expressionOut.print(question.id)
printHtmlPart(20)
expressionOut.print(question.option4)
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',35,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499539699251L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
