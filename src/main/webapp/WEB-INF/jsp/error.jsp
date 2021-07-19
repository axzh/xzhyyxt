<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

<!--<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">-->
<html:html locale="true">
	<head>
		<title>error</title>

		<link rel="stylesheet" type="text/css" href="./images/styles.css">
	</head>
	<body>
	<div class="div1">
		<table width="100%" cellpadding="0"  cellspacing="0" border="0" align="center">
			<tr>
				<td class="td_title1">
					<p>error:${msg}</p>
				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" height="20">

				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" height="50" align="center">
					<%--<h3><font color="red"><html:errors/></font></h3>--%>
					<h3 style="color: red">${msg}</h3>
					<hr/>
					<p>学习药品管理法，安全用药保健康；</p>
					<P>普安全用药知识，提安全用药水平；</P>
					<hr/>
				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" height="20" align="center">
					<a href="javaScript:window.history.go(-1);" >返回</a>
				</td>
			<tr>
			</tr>
		</table>
	</div>
	</body>
</html:html>
