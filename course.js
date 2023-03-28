let oop = parseFloat(prompt("enter your OOP score"));
let few = parseFloat(prompt("enter your Front End Web score"));
let hci = parseFloat(prompt("enter your Human-computer interaction score"));
let linux = parseFloat(prompt("enter your Linux score"));

var scores = [];    
var total=0;
var avg=0;

scores.push(oop, few, hci, linux);
document.write("<h3>Your scores are: </h3>" + scores);

for(var i=0; i<scores.length; i++){
    total += scores[i];
}
document.write("<h3>total is: </h3>"+total);

for(var i=0; i<scores.length; i++){
    avg = total/scores.length;
}
document.write("<h3>Average is: </h3>"+avg);