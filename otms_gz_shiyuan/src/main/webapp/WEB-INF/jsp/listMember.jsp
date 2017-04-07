<%@ page language="java" import="java.io.*,java.util.*" pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String ctx = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
request.setAttribute("ctx", ctx);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="renderer" content="webkit"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<jsp:include page="common.jsp"></jsp:include>
    <script type="text/javascript" src="${ctx}/js/listMember1.js"></script> 
  </head>
  <body class="easyui-layout">
	
	<div data-options="region:'center',border:false"
		style="padding-left: 5px; padding-right: 8px; padding-bottom: 8px;">
		<div class="easyui-layout" data-options="fit:true">
			<table id="resultGrid"></table>
		</div>
	</div>
  
  </body>
 
 <script type="text/javascript">
  var ctx='${ctx}';
 </script>
 
 
 
</html>
