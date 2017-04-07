/**
 * 实现dataGrid 列字段的显示和隐藏
 * 需要考虑如何将这个方法，不需要配置则可在DataGrid中实现效果(考虑如何已插件的方式实现)
 * @param e
 * @param field
 * @param gridName dataGrid控件
 */
function createGridHeaderContextMenu(e, field, grid, headMenu){
    e.preventDefault();
    if (!headMenu){
        headMenu = $('<div/>').appendTo('body');
        headMenu.menu({
            onClick: function(item){
                if (item.iconCls == 'icon-ok'){
                    grid.datagrid('hideColumn', item.name);
                    headMenu.menu('setIcon', {
                        target: item.target,
                        iconCls: 'icon-empty'
                    });
                } else {
                    grid.datagrid('showColumn', item.name);
                    headMenu.menu('setIcon', {
                        target: item.target,
                        iconCls: 'icon-ok'
                    });
                }
            }
        });
        var fields = grid.datagrid("options").columns[0];
        for(var i=0; i<fields.length; i++){
            var fd = fields[i].field;
            if(!fields[i].hidden){
                var col = grid.datagrid('getColumnOption', fields[i].field);
                headMenu.menu('appendItem', {
                    text: col.title,
                    name: fd,
                    iconCls: 'icon-ok'
                });
            }
        }
    }
    headMenu.menu('show', {
        left:e.pageX,
        top:e.pageY
    });
    return headMenu;
};