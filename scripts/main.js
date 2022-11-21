var miles;
var startLocation;
var endAtStart;
var listLocation = [];

$("#open-take-a-walk").click(function(){
    $("#log-in").collapse('hide');
});

$("#DanaHall-HallowellHall-DanawellHall-Wharton").click(function() {
    $("#dropdownMenuButton").text("Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton");
});

$("#ClothierHall").click(function() {
    $("#dropdownMenuButton").text("Clothier_Hall");
});

$("#UnderhillMusicLibrary-KohlbergHall").click(function() {
    $("#dropdownMenuButton").text("Underhill_Music_Library-Kohlberg_Hall");
});

$("#CornellLibrary-ScienceCenter").click(function() {
    $("#dropdownMenuButton").text("Cornell_Library-Science_Center");
});

$("#BeardsleyHall-PearsonHall-TrotterHall").click(function() {
    $("#dropdownMenuButton").text("Beardsley_Hall-Pearson_Hall-Trotter_Hall");
});

$("#SingerHall").click(function() {
    $("#dropdownMenuButton").text("Singer_Hall");
});

$("#McCabeLibrary").click(function() {
    $("#dropdownMenuButton").text("McCabe_Library");
});

$("#WilletsHall-WorthHall").click(function() {
    $("#dropdownMenuButton").text("Willets_Hall-Worth_Hall");
});

$("#DavidKempHall-AlicePaulHall-Mertz").click(function() {
    $("#dropdownMenuButton").text("David_Kemp_Hall-Alice_Paul_Hall-Mertz");
});

$("#SharplesDiningHall").click(function() {
    $("#dropdownMenuButton").text("Sharples_Dining_Hall");
});

$("#PittengerHall-PalmerHall-RobertsHall-NPPRApartments").click(function() {
    $("#dropdownMenuButton").text("Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments");
});

$("#Matchbox").click(function() {
    $("#dropdownMenuButton").text("Matchbox");
});

$("#confirm").click(function() {
    miles = $("#miles").val();
    $("#miles").val("");
    startLocation = $("#dropdownMenuButton").text();
    $("#dropdownMenuButton").text("Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton");
    endAtStart = $("#flexCheckDefault").is(':checked');
    alert(endAtStart);
    if($.isNumeric(miles)) {
        $("#not-a-number").hide();
        $("#take-a-walk").collapse('toggle');
        sendRequestForELocation(startLocation, miles, endAtStart);
    } else {
        $("#not-a-number").show();
    }
});

$("#log-in-button").click(function(){
    var username = $("#username").val();
    $("#username").val("");
    var password = $("#password").val();
    $("#password").val("");
    //sendRequestForLogIn(username, password);
    $("#name").text(username);
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
    $("#name").text("Guest");
});

function appendPath(path, miles) {
    listLocation = path;
    clearPath();
    $("#distance-to-travel").append("<p class='route-text'>You will be walking for " + miles + " miles!</p>");
    $("#route-to-take").append("<p class='route-text'>You will be walking to these locations</p>");
    $("#route-to-take").append("<ol>");
    for(var i = 0; i < path.length - 1; i++) {
        $("#route-to-take").append("<li class='route-text-" + i + "' onclick='displayPath(" + i + ")'>" + path[i] + " to " + path[i + 1] + "</li>");
    }
    $("#route-to-take").append("</ol>");
    $("#route-complete").append("<button class='btn btn-secondary' id='walk-complete' onclick='clearPath()'>Walk Completed!</button>");
}

function displayPath(start) {
    var path = [listLocation[start], listLocation[start + 1]];
    display_route(miles, path[0], path);
}

function clearPath() {
    $("#distance-to-travel").empty();
    $("#route-to-take").empty();
    $("#route-complete").empty();
}