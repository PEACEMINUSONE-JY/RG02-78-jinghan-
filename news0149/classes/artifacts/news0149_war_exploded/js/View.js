/**
 * 
 * 
 * 
 * 
 * 
 */

 function test_item(n){
  var menu = document.getElementById("menu");
  var menuli = menu.getElementsByTagName("li");
  for(var i = 0; i< menuli.length;i++){
   menuli[i].className= "";
   menuli[n].className="yes";
   document.getElementById("test"+ i).className = "no";
   document.getElementById("test"+ n).className = "content";
  }
 }
