import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechies_examresult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/exam/result.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'exam.label', default: 'Exam'))],-1)
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
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.home.label")],-1)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',12,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',12,['class':("list"),'action':("index")],2)
printHtmlPart(6)
expressionOut.print(session.candidate.firstName)
printHtmlPart(7)
expressionOut.print(session.candidate.lastName)
printHtmlPart(8)
expressionOut.print(session.candidate.email)
printHtmlPart(9)
expressionOut.print(session.candidate.mobile)
printHtmlPart(10)
invokeTag('set','g',26,['var':("countPoint"),'value':("0")],-1)
printHtmlPart(1)
invokeTag('set','g',27,['var':("total"),'value':(Integer.parseInt("0"))],-1)
printHtmlPart(2)
loop:{
int i = 0
for( answer in (com.jtechies.Answers.findAllByCandidate(session.candidate)) ) {
printHtmlPart(11)
expressionOut.print(answer.question.question)
printHtmlPart(12)
expressionOut.print(answer.reply==1?'checked':null)
printHtmlPart(13)
expressionOut.print(answer.question.option1)
printHtmlPart(14)
expressionOut.print(answer.reply==2?'checked':null)
printHtmlPart(15)
expressionOut.print(answer.question.option2)
printHtmlPart(16)
expressionOut.print(answer.reply==3?'checked':null)
printHtmlPart(15)
expressionOut.print(answer.question.option3)
printHtmlPart(17)
expressionOut.print(answer.reply==4?'checked':null)
printHtmlPart(15)
expressionOut.print(answer.question.option4)
printHtmlPart(18)
expressionOut.print(answer.reply==answer.question?.rightOption?'Correct : +1':'Incorrect: 0')
printHtmlPart(19)
invokeTag('set','g',39,['var':("countPoint"),'value':(Integer.parseInt(answer.reply==answer.question?.rightOption?'1':'0'))],-1)
printHtmlPart(2)
invokeTag('set','g',40,['var':("total"),'value':(total=total+countPoint)],-1)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
expressionOut.print(total)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499538631870L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
