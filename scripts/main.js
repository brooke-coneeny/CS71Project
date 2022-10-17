import OSM from 'ol/source/OSM';
import TileLayer from 'ol/layer/Tile';
import {Map, View} from 'ol';
import {fromLonLat} from 'ol/proj';

new Map({
  target: "#map",
  layers: [
    new TileLayer({
      source: new OSM(),
    }),
  ],
  view: new View({
    center: fromLonLat([0, 0]),
    zoom: 2,
  }),
});

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