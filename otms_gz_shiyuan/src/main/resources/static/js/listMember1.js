$(function() {
	alert("1");
	initFunctionGrid();
	alert("2");
});



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





