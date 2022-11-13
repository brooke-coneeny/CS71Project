function sendRequestForELocation(sLocation, miles) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        $("#route-to-take").text("Route: " + sLocation + " to " + this.responseText);
      }
    };
    const url = "http://localhost:8090/get-path/\"Clothier_Hall\"/2";
    xhttp.open("GET", url, true);
    xhttp.send();
  }

  function sendRequestForAllLocation() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        for(var i = 0; i < locations.length(); i++) {
            console.log(this.responseText[i]);
        }
      }
    };
    const url = "http://localhost:8090/get-path/\"Clothier_Hall\"/2";
    xhttp.open("GET", url, true);
    xhttp.send();
  }