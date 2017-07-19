import com.jtechies.Question
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechies_questionshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/question/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (questionInstance?.question)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("question.question.label"),'default':("Question")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(questionInstance),'field':("question")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (questionInstance?.dateCreated)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("question.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(19)
invokeTag('formatDate','g',39,['date':(questionInstance?.dateCreated)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (questionInstance?.lastUpdated)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("question.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(questionInstance?.lastUpdated)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (questionInstance?.option1)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("question.option1.label"),'default':("Option1")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(questionInstance),'field':("option1")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (questionInstance?.option2)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("question.option2.label"),'default':("Option2")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(questionInstance),'field':("option2")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (questionInstance?.option3)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("question.option3.label"),'default':("Option3")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(questionInstance),'field':("option3")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (questionInstance?.option4)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("question.option4.label"),'default':("Option4")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(questionInstance),'field':("option4")],-1)
printHtmlPart(16)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
createTagBody(3, {->
invokeTag('message','g',92,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',92,['class':("edit"),'action':("edit"),'resource':(questionInstance)],3)
printHtmlPart(32)
invokeTag('actionSubmit','g',93,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(33)
})
invokeTag('form','g',95,['url':([resource:questionInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499511255107L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
