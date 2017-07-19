import com.jtechies.Answers
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechies_answers_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/answers/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: answersInstance, field: 'candidate', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("answers.candidate.label"),'default':("Candidate")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("candidate"),'name':("candidate.id"),'from':(com.jtechies.Candidate.list()),'optionKey':("id"),'required':(""),'value':(answersInstance?.candidate?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: answersInstance, field: 'question', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("answers.question.label"),'default':("Question")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("question"),'name':("question.id"),'from':(com.jtechies.Question.list()),'optionKey':("id"),'required':(""),'value':(answersInstance?.question?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: answersInstance, field: 'reply', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("answers.reply.label"),'default':("Reply")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("reply"),'type':("number"),'value':(answersInstance.reply),'required':("")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499520124077L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
