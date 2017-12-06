function seminar(e){
    if(e == "seminar1"){
        console.log("seminar1");
        window.location.href = "/teacher/course/seminarInfo/finish";
    }
    else{
        console.log("seminar2");
        window.location.href = "/teacher/course/seminarInfo";
    }
};
function classInfo(e){
    window.location.href = "/teacher/course/classInfo";
};

$("#classAdd").click(function () {
    window.location.href = "/teacher/course/createClass";
});

$("#seminarAdd").click(function () {
    window.location.href = "/teacher/course/createSeminar";
});

$("#return").click(function () {
    window.location.href = "/teacher/course";
})