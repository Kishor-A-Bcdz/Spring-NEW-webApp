$(document).ready(function(){
$.ajax({
    url:"http://localhost:8080/users"
}).then(function(data){
    $(".firstname").append(data.first_name);
    $(".lastname").append(data.last_Name);
    $(".age").append(data.age);


});

});