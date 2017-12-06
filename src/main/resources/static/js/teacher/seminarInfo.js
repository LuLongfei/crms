function topicInfo(e){
    if ( e == "A"){
        window.location.href = "/teacher/course/topicInfo/A";
    }
    else{
        window.location.href = "/teacher/course/topicInfo/B";
    }
};


$("#topicAdd").click(function(){
    window.location.href = "/teacher/course/createTopic";
});

$("#returnButton").click(function(){
    window.location.href = "/teacher/course/homePage/OOAD";
});

$("#grade").click(function () {
    window.location.href = "/teacher/course/grade";
})

