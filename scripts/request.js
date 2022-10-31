function sendRequestForELocation(sLocation, miles) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        $("#route-to-take").text("Route: " + sLocation + " to " + this.responseText);
      }
    };
    xhttp.open("GET", "/" + sLocation + miles, true);
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
    xhttp.open("GET", "/get-locations", true);
    xhttp.send();
  }

  function sendRequestForSignUp() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        
      }
    };
    xhttp.open("GET", "/" + username + "-signup", true);
    xhttp.send();
  }

  function sendRequestForLogIn() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        
      }
    };
    xhttp.open("GET", "/" + username + "-login", true);
    xhttp.send();
  }