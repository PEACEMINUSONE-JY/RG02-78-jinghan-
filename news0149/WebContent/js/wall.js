/**
 * 
 */
	window.setInterval("showtime()",1000);	
	function showtime(){	
	if(date>0){
		var date=0+date;		
		}	
var date=new Date();				
var year=date.getFullYear();	
var month=date.getMonth()+1;	
var day=date.getDate();				
var hh=date.getHours();		
var mi=date.getMinutes();				
var ss=date.getSeconds();				
var wk="周"+"日一二三四五六".charAt(date.getDay());			
document.getElementById("div5").innerHTML=year+"-"+month+"-"+day+" "+hh+":"+mi+":"+ss+" "+wk;			}		
	
