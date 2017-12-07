function course(e){
    if(e == "OOAD"){
        window.location.href = "/teacher/course/homePage/OOAD";
    }
    else{
        window.location.href = "/teacher/course/homePage";
    }
};
function deleteCourse(e) {
<<<<<<< HEAD
    var r = confirm("确认删除"+e+"?");
=======
    var r = confirm("确认删除？");
>>>>>>> ce10782f232280b1b484d1b6650dd0bc57aa8e1a
    if( r == true){
        alert("取消成功");
        $("#"+e).remove();
    }
};
