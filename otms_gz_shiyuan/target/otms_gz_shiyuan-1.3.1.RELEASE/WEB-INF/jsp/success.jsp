<%@ page language="java" import="java.io.*,java.util.*" pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="renderer" content="webkit"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<link rel="stylesheet" href="dist/lib/weui.min.css">
    <link rel="stylesheet" href="dist/css/jquery-weui.css">
    <link rel="stylesheet" href="dist/demos/css/demos.css">
  </head>
  <body>
    <div class="weui_msg">
      <div class="weui_icon_area"><i class="weui_icon_success weui_icon_msg"></i></div>
      <div class="weui_text_area">
        <h2 class="weui_msg_title">操作成功</h2>
        <p class="weui_msg_desc">内容详情，可根据实际需要安排</p>
      </div>
      <div class="weui_opr_area">
        <p class="weui_btn_area">
          <a href="zzcc" class="weui_btn weui_btn_primary">确定</a>
        </p>
      </div>
     
    </div>
  
  </body>
 <script src="dist/lib/jquery-2.1.4.js"></script>
 <script src="dist/js/jquery-weui.js"></script>
 
</html>
