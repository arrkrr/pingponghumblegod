let button = document.getElementById("myButton");
let counter = 0;
button.onclick = function(){
    counter++;
    let display = document.getElementById("cdisplay");
    display.textContent="Button clicked "+counter+" time"
}