function sendRequestForELocation(sLocation, miles) {
    var listLoc = [];
    var xhttp = new XMLHttpRequest();
    const url = "http://localhost:8080/get-path/\"Clothier_Hall\"/2";
    xhttp.open("GET", url, true);
    //xhttp.open("GET", "http://localhost:8090/get-path/\"" + sLocation + "\"/" + miles, true);
    xhttp.send();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        listLoc = this.responseText.split(",");
        for(let i = 0; i < listLoc.length; i++) {
          listLoc[i] = listLoc[i].split('"').join('');
        }
        console.log(listLoc);
        alert(listLoc);
        display_route(miles, sLocation, listLoc);
        appendPath(listLoc, miles);
      }
    };
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
    const url = "http://localhost:8090/get-path/\"Clothier_Hall\"/2";
    xhttp.open("GET", url, true);
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
