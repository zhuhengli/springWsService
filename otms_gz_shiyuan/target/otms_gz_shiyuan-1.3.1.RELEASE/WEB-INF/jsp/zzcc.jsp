<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width; initial-scale=1.4; minimum-scale=1.0; maximum-scale=2.0"/>

<title>Insert title here</title>

</head>

<body>

<img src="../images/zzcclogo.jpg" />
    <hr>
    <form action="/zzccvalid" method="post">
    <br>
      <input type="text" id="orderCode" name="orderCode" placeholder="单号">
      </br>
      
      <br>
      <input type="text" id="feeType" name="feeType" placeholder="费用类型">
      </br>
      
      <br>
      <input type="text" id="amount" name="amount" placeholder="金额">
      </br>
      <br>  
       <input type="text" id="remark" name="remark" placeholder="备注">
       </br>
       <br>
      <input type="submit" value="确定">
      </br>
    </form>

</body>

</html>