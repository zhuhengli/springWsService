function getFunctionRight(code) {
	var right = false;
	$.ajax({
		type : "POST",
		cache : false,
		data : "code=" + code,
		dataType : "json",
		async : false,
		url : ctx + "/system/getFunctionRight.do",
		success : function(data) {
			right = data.hasRight;
		}
	});
	return right;
}
function openAttachmentDialog(btnId, uuidInputId, beforeClose) {
	var uuid = $("#" + uuidInputId).val();
	var url = ctx + '/system/initAttachmentDialog.do';
	$('#attachmentDiv').dialog({
		title : '文件上传',
		width : 600,
		height : 300,
		closed : false,
		cache : false,
		href : url,
		modal : true,
		onBeforeClose : function() {
			if ($("#inputfileDiv").html() != "") {
				$.messager.confirm('确认', '有附件尚未上传，确认要离开吗？', function(r) {
					if (!r) {
						return false;
					}
				});
			}
			var uuid = $("#attachmentUUID").val();
			attachmentCallback(uuid, btnId);
			if (beforeClose) {
				var url = ctx + "/system/queryAttachmentList.do";
				$.post(url, {
					uuid : uuid
				}, function(d) {
					beforeClose(d);
				});

			}
		},
		onLoad : function() {
			$("#attachmentUUID").val(uuid);
			$('#attachmentGrid').datagrid({
				url : ctx + '/system/queryAttachmentList.do',
				fit : true,
				rownumbers : true,
				fitColumns : false,
				queryParams : {
					uuid : uuid
				},
				columns : [ [ {
					field : 'id',
					title : 'id',
					checkbox : true
				}, {
					field : 'localPath',
					title : 'localPath',
					hidden : true
				}, {
					field : 'name',
					title : '文件名称',
					width : 200
				}, {
					field : 'fileType',
					title : '文件类型',
					width : 100
				}, {
					field : 'fileSize',
					title : '文件大小',
					width : 100,
					align : 'right'
				}, {
					field : 'createTime',
					title : '上传时间',
					width : 120,
					align : 'center'
				} ] ]
			});
		}
	});
}