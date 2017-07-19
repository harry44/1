import com.jtechies.Question
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechies_questionindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/question/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'question.label', default: 'Question'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("question"),'title':(message(code: 'question.question.label', default: 'Question'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',30,['property':("option1"),'title':(message(code: 'question.option1.label', default: 'Option1'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',32,['property':("option2"),'title':(message(code: 'question.option2.label', default: 'Option2'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',34,['property':("option3"),'title':(message(code: 'question.option3.label', default: 'Option3'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',35,['property':("option4"),'title':(message(code: 'question.option4.label', default: 'Option4'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',36,['property':("rightOption"),'title':(message(code: 'question.rightOption.label', default: 'rightOption'))],-1)
printHtmlPart(17)
loop:{
int i = 0
for( questionInstance in (questionInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: questionInstance, field: "question"))
})
invokeTag('link','g',44,['action':("show"),'id':(questionInstance.id)],3)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: questionInstance, field: "option1"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: questionInstance, field: "option2"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: questionInstance, field: "option3"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: questionInstance, field: "option4"))
printHtmlPart(23)
expressionOut.print(fieldValue(bean: questionInstance, field: "rightOption"))
printHtmlPart(24)
i++
}
}
printHtmlPart(25)
invokeTag('paginate','g',62,['total':(questionInstanceCount ?: 0)],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499538152317L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
