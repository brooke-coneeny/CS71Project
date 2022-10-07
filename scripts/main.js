$("#confirm").click(function() {
    var miles = $('#miles').val();
    var location = $('#dropdownMenuButton').text();
    alert(
        "Miles: " + String(miles) + "\n" +
        "Location: " + location
    );
});

$("#science-center").click(function() {
    $('#dropdownMenuButton').text("Science Center");
});

$("#parrish").click(function() {
    $('#dropdownMenuButton').text("Parrish");
});

$("#ml").click(function() {
    $('#dropdownMenuButton').text("Mary Lyons");
});

$("#willets").click(function() {
    $('#dropdownMenuButton').text("Willets");
});

$("#nppr").click(function() {
    $('#dropdownMenuButton').text("PPR Apartments");
});