$(function() {
	alert("1");
	initFunctionGrid();
	alert("2");
});

function doSearch() {
	var searchString = $("#searchbox").val();
	// 获取所有选中的checkbox
	var orderStatus = [];
	$("input:checkbox[name='orderStatus']:checked").each(function() {
		orderStatus.push($(this).val());
	});
	console.log(orderStatus);
	$('#resultGrid').datagrid({
		queryParams : {
			searchString : searchString,
			orderStatus : orderStatus
		}
	});
}

function initFunctionGrid() {
	$('#resultGrid').datagrid(
			{
				url : ctx + '/listMember',
				fit : true,
				method : 'post',
				rownumbers : true,
				singleSelect : true,
				pagination : true,
				fitColumns : false,
				columns : [ [
						{
							field : 'id',
							title : '姓名',
						},
						{
							field : 'name',
							title : '手机号',
						},
						{
							field : 'age',
							title : '当前状态',
						}
					] ]
			});
}



function modifyDriver(id) {
	$("#editDialog").dialog({
		title : '编辑司机',
		width : 500,
		height : 400,
		closed : false,
		cache : false,
		href : ctx + '/driver/editDriver.do?id=' + id,
		modal : true,
		onLoad : function() {
			var status = $('#statusValue').val();
			console.log(status);
			$("#status").combobox("setValue", status);
		}
	});
}

function saveDriver() {
	// var input = document.getElementById("idCardNum").value;
	// if (!input
	// ||
	// !/^[1-9][0-9]{5}(19[0-9]{2}|200[0-9]|2010)(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[0-9xX]$/i
	// .test(input)) {
	// var error = "身份证号格式错误";
	// $.messager.alert("错误", error, "error");
	// return;
	// }

	var id = $("#id").val();
	var url = ctx + "/driver/addDriver.do";
	if (id != "") {
		url = ctx + "/driver/modifyDriver.do";
	}
	$("#editForm").form("submit", {
		url : url,
		onSubmit : function() {
			return $(this).form("validate");
		},
		success : function(result) {
			result = JSON.parse(result);
			if (result.code == 200) {
				$("#editDialog").dialog("close");
				$('#resultGrid').datagrid("reload");
			} else {
				$.messager.alert("错误", result.msg, "error");
			}
		}
	});
}

function delDriver(id) {
	$.messager.confirm("提示", "确定删除?", function(r) {
		if (r) {
			$.post(ctx + "/driver/deleteDriver.do", {
				id : id
			}, function(result) {
				if (result.code == 200) {
					$('#resultGrid').datagrid("reload");
				} else {
					$.messager.alert("错误", result.msg, "error");
				}
			}, "json");
		}
	});
}


