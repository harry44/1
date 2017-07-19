import com.jtechies.Candidate
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineExamInGrails_JavaTechies_candidate_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/candidate/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'firstName', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("candidate.firstName.label"),'default':("First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',8,['name':("firstName"),'required':(""),'value':(candidateInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'lastName', 'error'))
printHtmlPart(4)
invokeTag('message','g',13,['code':("candidate.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',16,['name':("lastName"),'value':(candidateInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'email', 'error'))
printHtmlPart(6)
invokeTag('message','g',21,['code':("candidate.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',24,['name':("email"),'required':(""),'value':(candidateInstance?.email)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'mobile', 'error'))
printHtmlPart(8)
invokeTag('message','g',31,['code':("candidate.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("mobile"),'required':(""),'value':(candidateInstance?.mobile)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'addressLine1', 'error'))
printHtmlPart(9)
invokeTag('message','g',41,['code':("candidate.addressLine1.label"),'default':("Address Line1")],-1)
printHtmlPart(5)
invokeTag('textField','g',44,['name':("addressLine1"),'value':(candidateInstance?.addressLine1)],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'city', 'error'))
printHtmlPart(11)
invokeTag('message','g',50,['code':("candidate.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',53,['name':("city"),'required':(""),'value':(candidateInstance?.city)],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'state', 'error'))
printHtmlPart(12)
invokeTag('message','g',59,['code':("candidate.state.label"),'default':("State")],-1)
printHtmlPart(5)
invokeTag('textField','g',62,['name':("state"),'value':(candidateInstance?.state)],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: candidateInstance, field: 'country', 'error'))
printHtmlPart(13)
invokeTag('message','g',68,['code':("candidate.country.label"),'default':("Country")],-1)
printHtmlPart(5)
invokeTag('textField','g',71,['name':("country"),'value':(candidateInstance?.country)],-1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1499537346042L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
