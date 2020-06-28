/**
 * 
 * 
 * 
 */
function RefreshCode(obj) {

  $(obj).attr("src", "ValidateCode.ashx?temp=" + Math.random());

}

function validation(){
	if(f1.username.value.length<2||f1.username.value.length>10){
		alert("您输入的用户名为:"+f1.username.value+"不符合2-10位长度规则,请重新输入");
		return;
	}if(f1.password1.value.length<6||f1.password1.value.length>10
			&&f1.password2.value.length<6||f1.password2.value.length>10&&f1.password1.value==f1.password2.value){
		alert("您两次输入的密码为:"+f1.password1.value+"\t"+","+f1.password2.value+"应该在6至18位长度");		
		return;
	}if(f1.password1.value!=f1.password2.value){		
		alert( "您两次输入的密码为:"+f1.password1.value+"\t"+","+f1.password2.value+"您输入密码两次不一致");
		return;
	}if(f1.xb.value.length==0){		
		alert("性别选项不能为空");
		return;
	}
		
}


 