import com.jtechies.Question
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechies_question_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/question/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: questionInstance, field: 'question', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("question.question.label"),'default':("Question")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("question"),'required':(""),'value':(questionInstance?.question)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: questionInstance, field: 'option1', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("question.option1.label"),'default':("Option1")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("option1"),'required':(""),'value':(questionInstance?.option1)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: questionInstance, field: 'option2', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("question.option2.label"),'default':("Option2")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("option2"),'required':(""),'value':(questionInstance?.option2)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: questionInstance, field: 'option3', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("question.option3.label"),'default':("Option3")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("option3"),'required':(""),'value':(questionInstance?.option3)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: questionInstance, field: 'option4', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("question.option4.label"),'default':("Option4")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("option4"),'required':(""),'value':(questionInstance?.option4)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: questionInstance, field: 'rightOption', 'error'))
printHtmlPart(9)
invokeTag('message','g',51,['code':("question.rightOption.label"),'default':("Right Option")],-1)
printHtmlPart(2)
invokeTag('textField','g',54,['name':("rightOption"),'required':(""),'value':(questionInstance?.rightOption)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499515339709L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
