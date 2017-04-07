var unitObj = {
    //根据位置获取地址
    getAddress(obj){
        obj.geoc.getLocation(new BMap.Point(obj.Longitude, obj.Latitude), function(rs) {
            var dom = '<a href="#"  onclick="javascript:loadMap('
                + obj.Longitude + ','
                + obj.Latitude
                + ')">' + rs.address + '</a>';
            if( obj.el && $(obj.el).length ) {
                $(obj.el).html(dom);
            } else {
                $(obj.tableId).prev().find('.datagrid-body table tr').eq(obj.index).children('td').eq(obj.tdIndex).html(dom);
            }
            if( $('#' + obj.headEl).length ) {
                if( $(obj.el).length ) {
                    $('#' + obj.headEl).width($(obj.el).width() + 'px');
                } else {
                    $('#' + obj.headEl).width($(obj.tableId).prev().find('.datagrid-body table tr').eq(obj.index).children('td').eq(obj.tdIndex).width() + 'px');
                }
            }
        });
    },
    /**
     * id按钮ID和dialogID
     * text原因文字
     * formId:验证fromId
     * callback  成功回调
     */
    taskOperation:function(id, text, formId, callback) {
        var dataId = '',
            phone = '';
        reasonStr = '';
        $('body').on('click', '.' + id, function(e) {
            dataId = $(e.target).attr('data-id');
            phone = $(e.target).attr('data-phone');
            $('#' + id).dialog({
                content:"<form id=" + formId + " class='commentForm'>" +
                "<textarea name='reason' placeholder='请填写" + text + "原因，内容在五十字以内'></textarea>" +
                "<div class='c_btnGroup'>" +
                "<button class='easyui-linkbutton l-btn l-btn-small sure'>确定</button>" +
                "<a class='easyui-linkbutton l-btn l-btn-small cancel'>取消</a>" +
                "</div>" +
                "</form>",
                title:'确认' + text + '任务',
                modal:true, //是否显示遮罩层
                height:220,
                width:300,
            });
        });
        //关闭取消任务确定按钮
        $('body').on('click', '#' + id + ' .sure', function(e) {
            $("#" + formId).validate({
                rules:{
                    reason:{
                        required:true,
                        maxlength:50
                    }
                },
                messages:{
                    reason:{
                        required:'这个是必填的!',
                        maxlength:'最大字数不超过50!'
                    },
                },
                errorClass:"validate-error",
                invalidHandler:function() {
                    return false;
                },
                submitHandler:function() {
                    callback(dataId, phone, $('#' + formId + '  textarea').val(), closeDialog, id);
                    return false;//阻止表单提交
                }
            });
        });
        //关闭取消任务取消按钮
        $('body').on('click', '#' + id + ' .cancel', function(e) {
            closeDialog(id);
        });
        //取消任务按钮
        function closeDialog(id) {
            $('#' + id).dialog('close');
        }
    }
}
/*
 * 
 *
 id:'curSite'
 var html = '';	
 if (value && row.latitude && row.latitude) {
 var geoc = new BMap.Geocoder();
 unitObj.getAddress({
 geoc:geoc,
 Longitude:row.longitude,
 Latitude:row.latitude,
 el:'#datagrid-row-r1-2-'+index+' td[field="currentlocation"]'
 });
 }else{
 return   '-';
 }*/