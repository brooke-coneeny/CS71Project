var miles;
var startLocation;
var endLocation = "Science Center";

$("#open-take-a-walk").click(function(){
    $("#log-in").collapse('hide');
});

$("#science-center").click(function() {
    $("#dropdownMenuButton").text("Dana_Hall/Hallowell_Hall/Danawell_Hall/Wharton");
});

$("#parrish").click(function() {
    $("#dropdownMenuButton").text("Clothier_Hall");
});

$("#ml").click(function() {
    $("#dropdownMenuButton").text("Underhill_Music_Library/Kohlberg_Hall");
});

$("#willets").click(function() {
    $("#dropdownMenuButton").text("Cornell_Library/Science_Center");
});

$("#nppr").click(function() {
    $("#dropdownMenuButton").text("Beardsley_Hall/Pearson Hall/Trotter_Hall");
});

$("#singer").click(function() {
    $("#dropdownMenuButton").text("Singer_Hall");
});
$("#McCabe_Library").click(function() {
    $("#dropdownMenuButton").text("McCabe_Library");
});
$("#Willets_Hall/Worth_Hall").click(function() {
    $("#dropdownMenuButton").text("Willets_Hall/Worth_Hall");
});
$("#David_Kemp_Hall/Alice_Paul_Hall/Mertz").click(function() {
    $("#dropdownMenuButton").text("David_Kemp_Hall/Alice_Paul_Hall/Mertz");
});
$("#Sharples_Dining_Hall").click(function() {
    $("#dropdownMenuButton").text("Sharples_Dining_Hall");
});
$("#Pittenger_Hall/Palmer_Hall/Roberts_Hall/NPPR_Apartments").click(function() {
    $("#dropdownMenuButton").text("Pittenger_Hall/Palmer_Hall/Roberts_Hall/NPPR_Apartments");
});
$("#Matchbox").click(function() {
    $("#dropdownMenuButton").text("Matchbox");
});



$("#confirm").click(function() {
    miles = $("#miles").val();
    startLocation = $("#dropdownMenuButton").text();
    if($.isNumeric(miles)) {
        $("#not-a-number").hide();
        $("#take-a-walk").collapse('toggle');
        sendRequestForELocation(startLocation, miles);
    } else {
        $("#not-a-number").show();
    }
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

$("#walk-complete").click(function(){
    $("#take-a-walk").collapse('hide');
});

function appendPath(path, miles) {
    $("#distance-to-travel").empty();
    $("#route-to-take").empty();
    $("#route-complete").empty();
    $("#distance-to-travel").append("<p class='route-text'>You will be walking for " + miles + "!</p>");
    $("#route-to-take").append("<p class='route-text'>You will be walking to these locations</p>");
    $("#route-to-take").append("<ol>");
    for(var i = 0; i < path.length; i++) {
        $("#route-to-take").append("<li class='route-text'>" + path[i] + "</li>");
    }
    $("#route-to-take").append("</ol>");
    $("#route-complete").append("<button class='btn btn-secondary' id='walk-complete'>Walk Completed!</button>");
}