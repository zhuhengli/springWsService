<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String ctx = request.getScheme()+"://"+request.getServerName()
		+":"+request.getServerPort()+request.getContextPath();
	request.setAttribute("ctx", ctx);
%>
<link rel="stylesheet" type="text/css" href="${ctx }/css/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${ctx }/css/style.css">
<style>
*{
	
	box-sizing:border-box;
}
</style>
<script type="text/javascript" src="${ctx }/js/jquery.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
<script type="text/javascript" src="${ctx }/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${ctx }/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	var ctx='${ctx}';
</script>


<script type="text/javascript" src="${ctx}/js/easyUI/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${ctx}/js/easyUI/datagrid-filter.js"></script>
<script type="text/javascript" src="${ctx}/js/easyUI/datagrid-group.js"></script>
<script type="text/javascript" src="${ctx}/js/easyUI/extend/datagrid-extend.js"></script>
<script type="text/javascript" src="${ctx}/js/easyUI/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${ctx}/js/common-unit/unit.js"></script>
<link rel='stylesheet' href="${ctx}/js/easyUI/easyui.css" />
<link rel='stylesheet' href="${ctx}/js/easyUI/icon.css" />

<link rel="stylesheet" href="${ctx }/dist/lib/weui.min.css">
<link rel="stylesheet" href="${ctx }/dist/css/jquery-weui.css">
<link rel="stylesheet" href="${ctx }/dist/demos/css/demos.css">

<%-- <script type="text/javascript" src="${ctx}/dist/lib/jquery-2.1.4.js"></script> --%>
<script type="text/javascript" src="${ctx}/dist/js/jquery-weui.js"></script>
<%-- <script type="text/javascript" src="${ctx }/js/common.js"></script> --%>
<script type="text/javascript" src="${ctx }/js/util/datautil.js"></script>
<div id="attachmentDiv" style="overflow: hidden;"></div>

