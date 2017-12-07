
var showNode = $("#showInfo");
var modifyNode = $("#modifyInfo");

function modifyOnclick() {

    showNode.toggle();
    modifyNode.toggle();
}

function submitOnclick() {

    showNode.toggle();
    modifyNode.toggle();
}

$("#submitButton").click(submitOnclick);
$("#modifyButton").click(modifyOnclick);