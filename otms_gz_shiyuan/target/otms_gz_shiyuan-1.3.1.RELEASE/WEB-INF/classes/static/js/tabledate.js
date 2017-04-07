$(function(){
	initData();
}		
);

function dosearch(){
	
}


function initData(){
	
	$('#resultgrid').datagrid(
			{
				url:ctx+'/tabledatelist',
				fit:true,
				method:'post',
				rownumbers:true,
				pageination:true,
				fitColumns:true,
				columns:[[
				        {
				        field : 'id',
				        title  : 'key1'
				        },{
				        	  field : 'name',
						        title  : 'key1'
				        },{
				        	  field : 'code',
						        title  : 'key1'
				        }

				          ]]
			}
	
	);
	
}
