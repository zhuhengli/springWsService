<%@ page language="java" import="java.io.*,java.util.*" pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String ctx = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
request.setAttribute("ctx", ctx);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
	<jsp:include page="comm.jsp"></jsp:include>
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/demo/demo.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
	
	<%-- <script type="text/javascript" src="${ctx}/js/tabledate.js"></script> --%>
  </head>
  <body>
    <div class="weui_search_bar" id="search_bar">
      <form class="weui_search_outer">
        <div class="weui_search_inner">
          <i class="weui_icon_search"></i>
          <input type="search" class="weui_search_input" id="search_input" placeholder="搜索" />
          <a href="javascript:" class="weui_icon_clear" id="search_clear"></a>
        </div>
        <label for="search_input" class="weui_search_text" id="search_text">
          <i class="weui_icon_search"></i>
          <span>搜索</span>
        </label>
      </form>
      <a href="javascript:" class="weui_search_cancel" id="search_cancel">取消</a>
    </div>
    <div>
         <table id="dg" title="My Users" class="easyui-datagrid" style="width:700px;height:250px"
            url="/tabledatelist"
            toolbar="#toolbar" pagination="true"
            rownumbers="true" fitColumns="true" singleSelect="true">
        <thead>
            <tr>
                <th field="id" width="50">id</th>
                <th field="name" width="50">Name</th>
                <th field="age" width="50">age</th>
            </tr>
        </thead>
    </table>
        
    </div>
  
  </body>
 
</html>
