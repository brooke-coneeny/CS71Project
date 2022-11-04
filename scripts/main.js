var miles;
var startLocation;
var endLocation = "Science Center";
var listLoc = [];

$("#confirm").click(function() {
    miles = $("#miles").val();
    startLocation = $("#dropdownMenuButton").text();
    if($.isNumeric(miles)) {
        $("#not-a-number").hide();
        $("#take-a-walk").collapse('toggle');
        listLoc = sendRequestForELocation(startLocation, miles);
        display_route(miles, startLocation, listLoc);
        appendPath(listLoc);
    } else {
        $("#not-a-number").show();
    }
});

$("#open-take-a-walk").click(function(){
    $("#log-in").collapse('hide');
});

$("#science-center").click(function() {
    $("#dropdownMenuButton").text("Science Center");
});

$("#parrish").click(function() {
    $("#dropdownMenuButton").text("Parrish");
});

$("#ml").click(function() {
    $("#dropdownMenuButton").text("Mary Lyons");
});

$("#willets").click(function() {
    $("#dropdownMenuButton").text("Willets");
});

$("#nppr").click(function() {
    $("#dropdownMenuButton").text("PPR Apartments");
});

$("#log-in-button").click(function(){
    var username = $("#username").val();
    var password = $("#password").val();
    sendRequestForLogIn(username, password);
    $("#log-in").collapse('toggle');
    $("#open-log-in").hide();
    $("#sign-out").show();
});

$("#open-log-in").click(function(){
    $("#take-a-walk").collapse('hide');
});

$("#sign-out").click(function(){
    $("#sign-out").hide();
    $("#open-log-in").show();
});

function appendPath(path, miles) {
    $("#distance-to-travel").append("<p class='route-text'>You will be walking for " + miles + "!</p>");
    $("#route-to-take").append("<p class='route-text'>You will be walking to these locations</p>");
    $("#route-to-take").append("<ol>");
    for(var i = 0; i < path.length(); i++) {
        $("#route-to-take").append("<li class='route-text'>" + path[i] + "</li>");
    }
    $("#route-to-take").append("</ol>");
    $("#route-complete").append("<button class='btn btn-secondary' id='walk-complete'>Walk Completed!</button>");
}