function updateTime(){
    var now=new Date();
    var hours = now.getHours();
    var min = now.getMinutes();
    var sec = now.getUTCSeconds();
    var msec = now.getMilliseconds();
    var timedisplay = hours+ ":" +min+ ":" +sec+ ":" +msec;
    var timeelement = document.getElementById("timedisplay");
    timeelement.innerHTML = timedisplay;
}
setInterval(updateTime);
