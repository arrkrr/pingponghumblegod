function CheckUsername(){
    var username = document.getElementById("email").value
    var pwd = document.getElementById("pwd").value
if(username=="202100188@my.apiu.edu" && pwd=="Asd,car22"){
    document.getElementById("message").innerHTML="logged successfully";
} else{
    document.getElementById("message").innerHTML="Wrong username or password";
}
}