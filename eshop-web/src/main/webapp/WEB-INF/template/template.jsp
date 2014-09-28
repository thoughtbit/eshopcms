<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">	
		<title><tiles:insertAttribute name="title" ignore="true"/></title>
		<meta name="description" content="<tiles:insertAttribute name="page_description" ignore="true"/>">
		<link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet" type="text/css"/>
		<link rel="shortcut icon" href="<c:url value="/assets/images/favicon.ico"/>" type="image/x-icon" />			
	</head>
    <body id="<tiles:insertAttribute name="body-id" />">  
    	<div id="heder">			
			<tiles:insertAttribute name="header" />
		</div>		
		<div id="content">
			<tiles:insertAttribute name="content" />
		</div>		
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>			
	</body>
</html>
