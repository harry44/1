import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechiesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',82,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',84,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
invokeTag('image','asset',89,['src':("onlineexam.jpg"),'alt':("Java Techies"),'style':("height:200px;width:80%")],-1)
printHtmlPart(7)
for( examTypeInstance in (com.jtechies.ExamType.list()) ) {
printHtmlPart(8)
createTagBody(3, {->
printHtmlPart(9)
expressionOut.print(examTypeInstance?.examName)
printHtmlPart(10)
expressionOut.print(createLink(controller:'Exam',action:'showImage',id:examTypeInstance.id))
printHtmlPart(11)
})
invokeTag('link','g',98,['controller':("exam"),'action':("create")],3)
printHtmlPart(8)
}
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',102,['controller':("question"),'action':("create")],2)
printHtmlPart(14)
createClosureForHtmlPart(15, 2)
invokeTag('link','g',106,['controller':("login"),'action':("auth")],2)
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',110,['url':("http://jtechies.in/download_projects/index.php"),'target':("_newTab")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',111,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499797306372L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
