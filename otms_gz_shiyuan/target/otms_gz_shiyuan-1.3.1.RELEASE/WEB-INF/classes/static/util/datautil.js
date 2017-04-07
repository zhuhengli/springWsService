///***************yyyy-MM-dd 转成 毫秒数**********
 function showToDB(dataTime) {
	var arry = dataTime.split("-");
	var t=(parseInt(arry[1],10)-1);
	if(t<10){
		arry[1]='0'+t;
	}else{
		arry[1]=''+t;
	}
	var now = new Date(arry[0], arry[1], arry[2]);
	return now.getTime();
}
//扩展Date的format方法 
Date.prototype.format = function (format) {
    var o = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        "S": this.getMilliseconds()
    };
    if (/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
};

/**
 * 日期加/减
 * @parm day -3 当前日期减3天;为空表示获取当前时间;
 * @return 返回日期格式 yyyy-mm-dd
 */
function getCustomDate(day){
	var nowDate = new Date();
	var nowDay = nowDate.getDate();
	if(day){
		day = day + nowDay;
		nowDate.setDate(day);
	}
	var nowMonth = nowDate.getMonth() + 1;
	var nowYear = nowDate.getFullYear();
	nowDay = nowDate.getDate();
	return (nowYear.toString() + '-' + nowMonth.toString() + '-' + nowDay);
}

/**
 * dataBox 控件格式化需要
 */
function myformatter(date){
    var y = date.getFullYear();
    var m = date.getMonth()+1;
    var d = date.getDate();
    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}
/**
 * dataBox 控件格式化需要
 */
function myparser(s){
    if (!s) return new Date();
    var ss = (s.split('-'));
    var y = parseInt(ss[0],10);
    var m = parseInt(ss[1],10);
    var d = parseInt(ss[2],10);
    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
        return new Date(y,m-1,d);
    } else {
        return new Date();
    }
}




/**  
*转换日期对象为日期字符串  
* @param date 日期对象  
* @param isFull 是否为完整的日期数据,  
*               为true时, 格式如"2000-03-05 01:05:04"  
*               为false时, 格式如 "2000-03-05"  
* @return 符合要求的日期字符串  
*/  
function getSmpFormatDate(date, isFull) {
    var pattern = "";
    if (isFull == true || isFull == undefined) {
        pattern = "yyyy-MM-dd hh:mm:ss";
    } else {
        pattern = "yyyy-MM-dd";
    }
    return getFormatDate(date, pattern);
}
/**  
*转换当前日期对象为日期字符串  
* @param date 日期对象  
* @param isFull 是否为完整的日期数据,  
*               为true时, 格式如"2000-03-05 01:05:04"  
*               为false时, 格式如 "2000-03-05"  
* @return 符合要求的日期字符串  
*/  

function getSmpFormatNowDate(isFull) {
    return getSmpFormatDate(new Date(), isFull);
}
/**
 * 通过日期字符串转成long字符串
 * @param strdate  格式如"2000-03-05 01:05:04" 
 * @param isFull
 * @returns
 */
function getLongByDate(strdate, isFull) {
	if(strdate == 0)
		return;
	var str = strdate+"";
    var pattern = "";
    if (isFull == true || isFull == undefined) {
        pattern = "yyyy-MM-dd hh:mm:ss";
    } else {
        pattern = "yyyy-MM-dd";
    }
    strdate = strdate.replace(/-/g,"/");
    var date = new Date(strdate);    
    return date.getTime();
}
/**  
*转换long值为日期字符串  
* @param l long值  
* @param isFull 是否为完整的日期数据,  
*               为true时, 格式如"2000-03-05 01:05:04"  
*               为false时, 格式如 "2000-03-05"  
* @return 符合要求的日期字符串  
*/  

function getSmpFormatDateByLong(l, isFull) {
	if(!l){
		return "";
	}
    return getSmpFormatDate(new Date(l), isFull);
}
/**  
*转换long值为日期字符串  
* @param l long值  
* @param pattern 格式字符串,例如：yyyy-MM-dd hh:mm:ss  
* @return 符合要求的日期字符串  
*/  

function getFormatDateByLong(l, pattern) {
    return getFormatDate(new Date(l), pattern);
}
/**  
*转换日期对象为日期字符串  
* @param l long值  
* @param pattern 格式字符串,例如：yyyy-MM-dd hh:mm:ss  
* @return 符合要求的日期字符串  
*/  
function getFormatDate(date, pattern) {
    if (date == undefined) {
        date = new Date();
    }
    if (pattern == undefined) {
        pattern = "yyyy-MM-dd hh:mm:ss";
    }
    return date.format(pattern);
}
/**
 *计算两个日期相隔的天数
 * @param d1 第一个日期 long
 * @param d2 第二个日期 long
 * @return 相隔天数
 */  
function getDaysBetweenTwoTime(d1, d2) {
	var day = null;
	if(d1 && !isNaN(d1) && d2 && !isNaN(d2)){
		var time = d1 > d2 ? (d1 - d2) : (d2 - d1);
		day = Math.floor(time / 86400000);
	}
	return day;
}



/**
 * 计算时间
 */
function dateChange( part ) {

var beginTime;

var now   = new Date();

var month = now.getMonth();

var year  = now.getFullYear();

var day   = now.getDate();

var wday  = now.getDay;

function unsetTime( thisdate ) {

thisdate.setUTCHours( 0 );

thisdate.setUTCMinutes( 0 );

thisdate.setUTCSeconds( 0 );

}

switch ( part ) {

//当月

case "thismonth" :

unsetTime(now);

now.beginTime = now.format( "yyyy-MM-dd", now.setDate( 1 ) );

now.endTime   = now.format( "yyyy-MM-dd", now.setMonth( month +1 ) );

break;

//上个月

case "lastmonth" :

unsetTime(now);

now.setMonth( month - 1 );

now.beginTime = now.format( "yyyy-MM-dd", now.setDate( 1 ) );

now.endTime   = now.format( "yyyy-MM-dd", now.setMonth( month ) );

break;

//最近7天

case "lastsevendays" :

now.endTime   = now.format( "yyyy-MM-dd", now.setDate(day));
now.beginTime = now.format( "yyyy-MM-dd", now.setDate( day-7 ) );


break;

//最近一个月

case "recentmonth" :

now.endTime   = now.format( "yyyy-MM-dd",  now.setDate( day ) );

now.beginTime = now.format( "yyyy-MM-dd", now.setDate( day-30 ) );

break;

default: 

now.endTime = null; now.beginTime = null;

break;

}

return [now.beginTime, now.endTime];

 

}

Date.prototype.dateChange = function ( part ) {

return dateChange( part );

};