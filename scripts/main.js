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
    } else {
        $("#not-a-number").show();
    }
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

/******************************************************************
 * Start of TomTom Map SDK code
 */
const API_KEY = 'zjqAcEr9qywkLXAs1Cg5xGVr6x4q3vcd';
const APPLICATION_NAME = 'SwatMoves';
const APPLICATION_VERSION = '1.0';
const SWARTHMORE_COLLEGE = {lng: -75.3499, lat: 39.9010};

tt.setProductInfo(APPLICATION_NAME, APPLICATION_VERSION);

var map = tt.map({
  key: API_KEY,
  container: 'map-div',
  center: SWARTHMORE_COLLEGE,
  zoom: 12
});

async function fetchLoc() {
    const response = await tt.services.fuzzySearch({
      key: API_KEY,
      query: document.querySelector('#map-query').value,
    })
    if(response.results) {
        map = tt.map({
        key: API_KEY,
        container: 'map-div',
        center: response.results[0].position,
        zoom: 12
        });
    }
  }

/******************************************************************
 * End of TomTom Map SDK code
 */