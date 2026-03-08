function recommendInternship(){

let name = document.getElementById("name").value
let skills = document.getElementById("skills").value
let cgpa = document.getElementById("cgpa").value

fetch("http://localhost:8080/api/recommend",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body: JSON.stringify({

name:name,
skills:skills,
cgpa:cgpa

})

})

.then(response => response.json())

.then(data =>{

let result = ""

data.forEach(function(item){

result += item.role + " at " + item.company + "<br>"

})

document.getElementById("result").innerHTML = result

})

}