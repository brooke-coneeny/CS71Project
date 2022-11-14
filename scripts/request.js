function sendRequestForELocation(sLocation, miles) {
    var listLoc = [];
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        listLoc = this.responseText.split(",");
      }
    };
    const url = "/\"Clothier_Hall\"/2";
    xhttp.open("GET", url);
    xhttp.withCredentials = true;
    xhttp.send();

    // xhttp.open("GET", "localhost:8080/get-path/\"" + sLocation + "\"/" + miles, true);
    // xhttp.send();
    return listLoc;
  }

  function sendRequestForAllLocation() {
    var listLoc = [];
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        listLoc = this.responseText.split(",");
        for(var i = 0; i < listLoc.length(); i++) {
            console.log(listLoc[i]);
        }
      }
    };
    xhttp.open("GET", "/get-locations", true);
    xhttp.send();
  }

  function sendRequestForLogIn(username, password) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        $("#name").text(this.responseText);
      }
    };
    xhttp.open("GET", "/login/" + username + "/" + password, true);
    xhttp.send();
  }
