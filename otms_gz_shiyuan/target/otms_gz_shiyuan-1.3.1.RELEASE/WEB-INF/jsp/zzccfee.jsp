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
	<link rel="stylesheet" href="${ctx }/dist/lib/weui.min.css">
    <link rel="stylesheet" href="${ctx }/dist/css/jquery-weui.css">
    <link rel="stylesheet" href="${ctx }/dist/demos/css/demos.css">
  </head>
  <body>
    <div class="weui_cells weui_cells_form">
      <div class="weui_cell">
        <div class="weui_cell_hd"><label class="weui_label">单号</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input id="erpCode" name="erpCode" class="weui_input" type="text"  placeholder="请输入单号" required="true">
        </div>
      </div>
      
      <div class="weui_cell">
        <div class="weui_cell_hd"><label for="name" class="weui_label">费用类型</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input id="feeType" name="feeType" class="weui_input"  required="true"  type="text" value="" placeholder="请选择费用类型">
        </div>
      </div>
        <div class="weui_cell">
        <div class="weui_cell_hd"><label class="weui_label">金额</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input id="amount" name="amount" class="weui_input" type="tel" placeholder="请输入金额">
        </div>
      </div>
    </div>
    <div class="weui_cells_title">备注</div>
    <div class="weui_btn_area">
        <div class="weui_cells weui_cells_form">
      <div class="weui_cell">
        <div class="weui_cell_bd weui_cell_primary">
          <textarea id="remark" name="remark" class="weui_textarea" placeholder="请输入相关信息" rows="3"></textarea>
          <div class="weui_textarea_counter"><span>0</span>/200</div>
        </div>
      </div>
    </div><a class="weui_btn weui_btn_primary" href="javascript:" id="showTooltips">确定</a>
      </div>
    </div>
  
  </body>
 <script type="text/javascript" src="${ctx}/dist/lib/jquery-2.1.4.js"></script>
 <script type="text/javascript" src="${ctx}/dist/js/jquery-weui.js"></script>
 <script type="text/javascript" src="${ctx}/js/zzcc.js"></script>
 <script type="text/javascript">
  var ctx='${ctx}';
 </script>
 
 
    <script>
      $("#feeType").select({
        title: "选择费用类型",
        items: ["停车费", "路桥费", "燃油费", "住宿费", "餐费 ", "其他"],
        onChange: function(d) {
          console.log(this, d);
        },
        onClose: function() {
          console.log("close");
        },
        onOpen: function() {
          console.log("open");
        },
      });
      
       </script>
 
</html>
