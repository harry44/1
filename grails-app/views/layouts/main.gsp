<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.png')}" type="image/x-icon">
		
  		<asset:stylesheet src="application.css"/>
		<asset:javascript src="application.js"/>
		<g:layoutHead/>
	</head>
	<body>
		<div id="grailsLogo" role="banner"><a href="http://jtechies.in"><asset:image src="logo.gif" alt="Java Techies" style="height:60px;"/></a><sec:ifLoggedIn><span style="float:right;"><b style=" padding:5px; background-color:white; border-radius:5px;"> <sec:username/></b>  <b style=" padding-top:5px; padding-bottom:5px; background-color:#ff4739; border-radius:5px;"><a href="${createLink(controller:'logout', action: 'index')}" >
            <i class="icon-key"></i> <g:message code="userMenu.logout.label" default="Log Out"/> </a></b></span></sec:ifLoggedIn></div>
		
		<g:layoutBody/>
		<div class="footer" role="contentinfo">
		&copy;2017-2018 | Java Techies Pvt. Ltd.
		</div>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
	</body>
</html>
