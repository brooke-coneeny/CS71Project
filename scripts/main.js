var miles;
var startLocation;
var endLocation = "Science Center";

$("#confirm").click(function() {
    miles = $("#miles").val();
    startLocation = $("#dropdownMenuButton").text();
    if($.isNumeric(miles)) {
        $("#not-a-number").hide();
        $("#take-a-walk").collapse('toggle');
        $("#distance-to-travel").text("Miles: " + String(miles));
        $("#route-to-take").text("Route: " + startLocation + " to " + endLocation);
        sendRequestForAllLocation();
    } else {
        $("#not-a-number").show();
    }
    display_route(miles, startLocation);
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