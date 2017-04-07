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
   
    <div class="weui_cells weui_cells_form">
      <div class="weui_cell">
        <div class="weui_cell_hd"><label class="weui_label">qq</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input class="weui_input" type="tel" placeholder="请输入qq号">
        </div>
      </div>
      <div class="weui_cell weui_vcode">
        <div class="weui_cell_hd"><label class="weui_label">验证码</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input class="weui_input" type="number" placeholder="请输入验证码">
        </div>
        <div class="weui_cell_ft">
          <img src="dist/demos/images/vcode.jpg">
        </div>
      </div>
      <div class="weui_cell weui_cell_switch">
        <div class="weui_cell_hd weui_cell_primary">接受通知</div>
        <div class="weui_cell_ft">
          <input class="weui_switch" type="checkbox">
        </div>
      </div>
      <div class="weui_cell">
        <div class="weui_cell_hd"><label for="" class="weui_label">日期</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input class="weui_input" type="date" value="">
        </div>
      </div>
      <div class="weui_cell">
        <div class="weui_cell_hd"><label for="" class="weui_label">时间</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input class="weui_input" type="datetime-local" value="" placeholder="">
        </div>
      </div>
      <div class="weui_cell weui_cell_select">
        <div class="weui_cell_bd weui_cell_primary">
          <select class="weui_select" name="select1">
            <option selected="" value="0">选择</option>
            <option value="1">微信号</option>
            <option value="2">QQ号</option>
            <option value="3">Email</option>
          </select>
        </div>
      </div>
    </div>
    <div class="weui_cells_title">文本域</div>
    <div class="weui_cells weui_cells_form">
      <div class="weui_cell">
        <div class="weui_cell_bd weui_cell_primary">
          <textarea class="weui_textarea" placeholder="请输入评论" rows="3"></textarea>
          <div class="weui_textarea_counter"><span>0</span>/200</div>
        </div>
      </div>
    </div>

    <div class="weui_cells weui_cells_form">
      <div class="weui_cell">
        <div class="weui_cell_bd weui_cell_primary">
          <div class="weui_uploader">
            <div class="weui_uploader_hd weui_cell">
              <div class="weui_cell_bd weui_cell_primary">图片上传</div>
              <div class="weui_cell_ft">0/2</div>
            </div>
            <div class="weui_uploader_bd">
              <ul class="weui_uploader_files">
                <li class="weui_uploader_file" style="background-image:url(http://shp.qpic.cn/weixinsrc_pic/pScBR7sbqjOBJomcuvVJ6iacVrbMJaoJZkFUIq4nzQZUIqzTKziam7ibg/)"></li>
                <li class="weui_uploader_file" style="background-image:url(http://shp.qpic.cn/weixinsrc_pic/pScBR7sbqjOBJomcuvVJ6iacVrbMJaoJZkFUIq4nzQZUIqzTKziam7ibg/)"></li>
                <li class="weui_uploader_file" style="background-image:url(http://shp.qpic.cn/weixinsrc_pic/pScBR7sbqjOBJomcuvVJ6iacVrbMJaoJZkFUIq4nzQZUIqzTKziam7ibg/)"></li>
                <li class="weui_uploader_file weui_uploader_status" style="background-image:url(http://shp.qpic.cn/weixinsrc_pic/pScBR7sbqjOBJomcuvVJ6iacVrbMJaoJZkFUIq4nzQZUIqzTKziam7ibg/)">
                  <div class="weui_uploader_status_content">
                    <i class="weui_icon_warn"></i>
                  </div>
                </li>
                <li class="weui_uploader_file weui_uploader_status" style="background-image:url(http://shp.qpic.cn/weixinsrc_pic/pScBR7sbqjOBJomcuvVJ6iacVrbMJaoJZkFUIq4nzQZUIqzTKziam7ibg/)">
                  <div class="weui_uploader_status_content">50%</div>
                </li>
              </ul>
              <div class="weui_uploader_input_wrp">
                <input class="weui_uploader_input" type="file" accept="image/jpg,image/jpeg,image/png,image/gif" multiple="">
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <h2 class="demos-second-title">表单校验</h2>
    <div class="weui_cells weui_cells_form">
      <div class="weui_cell weui_cell_warn">
        <div class="weui_cell_hd"><label class="weui_label">qq</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input class="weui_input" type="tel" placeholder="请输入qq号">
        </div>
      </div>
      <div class="weui_cell weui_vcode weui_cell_warn">
        <div class="weui_cell_hd"><label class="weui_label">验证码</label></div>
        <div class="weui_cell_bd weui_cell_primary">
          <input class="weui_input" type="number" placeholder="请输入验证码">
        </div>
        <div class="weui_cell_ft">
          <i class="weui_icon_warn"></i>
          <img src="dist/demos/images/vcode.jpg">
        </div>
      </div>
    </div>
    <div class="weui_btn_area">
        <a class="weui_btn weui_btn_primary" href="javascript:" id="showTooltips">确定</a>
      </div>
    </div>
  
  </body>
 <script src="dist/lib/jquery-2.1.4.js"></script>
 <script src="dist/js/jquery-weui.js"></script>
</html>
