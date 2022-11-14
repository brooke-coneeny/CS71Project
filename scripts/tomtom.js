/******************************************************************
 * Start of TomTom Map SDK code
 */
 const API_KEY = 'zjqAcEr9qywkLXAs1Cg5xGVr6x4q3vcd';
 const APPLICATION_NAME = 'SwatMoves';
 const APPLICATION_VERSION = '1.0';
 
 const PARRISH_HALL = {
    lng: -75.35419467875656, 
    lat: 39.90524432327209
};

const MARY_LYONS = {
    lng: -75.35403663216876,
    lat: 39.89573181458555
};

 const DANAWELL = {
    lng: -75.35730477508594,
    lat: 39.90350141354039
 };

 const CLOTHIER = {
    lng: -75.3549274020721,
    lat: 39.9044050151029
 };

 const KOHLBERG = {
    lng: -75.3549107732364,
    lat: 39.90602968091944
 };

 const SCIENCE_CENTER = {
     lng: -75.35570622718119,
     lat: 39.9061061340093
 };

 const BEARDSLEY = {
    lng: -75.35483304809978,
    lat: 39.90680644906328
};

const SINGER = {
    lng: -75.35397655974329,
    lat: 39.90744045787755
};

const MCCABE = {
    lng: -75.35268525789385,
    lat: 39.905496621905044
};

const WILLETS = {
    lng: -75.35164810207202,
    lat: 39.905969900531005
};

const MERTZ = {
    lng: -75.35149093090779,
    lat: 39.90393404329635
};

const SHARPLES = {
    lng: -75.3537541872761,
    lat: 39.903531810128854
};

const MATCHBOX = {
    lng: -75.35518347233639,
    lat: 39.901490073237
};

 const PPR = {
     lng: -75.35161580207222,
     lat: 39.90009680278654
 };
 
 
 tt.setProductInfo(APPLICATION_NAME, APPLICATION_VERSION);
 
 function convertToPoint(t){return{point:{latitude:t.lat,longitude:t.lng}}}function convertToSpeedFormat(t,r){return t+(r||"km/h")}function formatToDurationTimeString(t){var r=moment.utc(1e3*t);if(t>86400){var o=function(t){return{days:Math.floor(t/86400),rest:t%86400}}(t);return o.days+(1===o.days?" day ":" days ")+moment.utc(1e3*o.rest).format("h [h] m [m]")}return t>3600?r.format("H [h] m [m] s [s]"):t>60?r.format("m [m] s [s]"):t>0?r.format("s [s]"):"No delay"}function formatToShortDurationTimeString(t){var r=moment.duration(t,"seconds");return t>3600?r.format("h [h] m [m]"):t>60?r.format("m [m]"):"No delay"}function formatToTimeString(t){return moment(t).format("HH:mm:ss")}function formatToDateString(t){return moment(t).format("DD/MM/YYYY")}function formatToShortenedTimeString(t){return moment(t).format("h:mm a")}function dateTimeStringToObject(t,r){if(!t.match(/^(\d{2})\/(\d{2})\/(\d{4})$/))throw new TypeError("Wrong date format provided. It needs to follow dd/mm/yyyy pattern.");return moment(t+r,"DD/MM/YYYYh:mm A").toDate()}function dateStringToObject(t){return moment(t,"YYYY-MM-DD").toDate()}function formatToDateWithFullMonth(t){return moment(t).format("MMMM D, YYYY")}function formatToExpandedDateTimeString(t){return moment(t).format("dddd, MMM D, HH:mm:ss")}function formatToDateTimeString(t){return moment(t).format("MMM D, HH:mm:ss")}function formatToDateTimeStringForTrafficIncidents(t){return moment(t).format("YYYY-MM-DD HH:mm")}function formatAsImperialDistance(t){var r=Math.round(1.094*t);return r>=1760?Math.round(r/17.6)/100+" mi":r+" yd"}function formatAsMetricDistance(t){var r=Math.round(t);return r>=1e3?Math.round(r/100)/10+" km":r+" m"}function roundLatLng(t){return Math.round(1e6*t)/1e6}function formatCategoryName(t){var r=t.toLowerCase().replace(/_/g," ");return r.charAt(0).toUpperCase()+r.slice(1)}var Formatters={convertToPoint:convertToPoint,convertToSpeedFormat:convertToSpeedFormat,formatToDurationTimeString:formatToDurationTimeString,formatToShortDurationTimeString:formatToShortDurationTimeString,formatToTimeString:formatToTimeString,formatToExpandedDateTimeString:formatToExpandedDateTimeString,formatAsImperialDistance:formatAsImperialDistance,formatAsMetricDistance:formatAsMetricDistance,roundLatLng:roundLatLng,formatToDateString:formatToDateString,formatToShortenedTimeString:formatToShortenedTimeString,dateTimeStringToObject:dateTimeStringToObject,dateStringToObject:dateStringToObject,formatToDateWithFullMonth:formatToDateWithFullMonth,formatCategoryName:formatCategoryName,formatToDateTimeString:formatToDateTimeString,formatToDateTimeStringForTrafficIncidents:formatToDateTimeStringForTrafficIncidents};window.Formatters=window.Formatters||Formatters;
 function InfoHint(t,e,i){this.type=t,this.position=e,this.duration=i,this.element=this._createElement()}InfoHint.prototype.addTo=function(t){return t.appendChild(this.element),this},InfoHint.prototype.isHidden=function(){return this.element.classList.contains("-hidden")},InfoHint.prototype.hide=function(){this.element.classList.add("-hidden")},InfoHint.prototype.show=function(){this.element.classList.remove("-hidden")},InfoHint.prototype.setErrorMessage=function(t){this.element.innerText=t&&(t.message||t.data.message)||"There was an error.",this._createMessage()},InfoHint.prototype.setMessage=function(t){this.element.innerText=t,this._createMessage()},InfoHint.prototype._createElement=function(){var t=document.createElement("div");return t.setAttribute("class",this._getClassList()),t},InfoHint.prototype._createMessage=function(){this.show(),this.duration&&(this.timeout&&window.clearTimeout(this.timeout),this.duration&&(this.timeout=window.setTimeout(this.hide.bind(this),this.duration)))},InfoHint.prototype._createElement=function(){var t=document.createElement("div");return t.setAttribute("class",this._getClassList()),t},InfoHint.prototype._getClassList=function(){return["tt-info-hint","-hidden","-"+this.position,"-"+this.type].join(" ")},window.infoHint=window.InfoHint||InfoHint;
 function isMobileOrTablet(){var i,a=!1;return i=navigator.userAgent||navigator.vendor||window.opera,(/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|mobile.+firefox|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows ce|xda|xiino|android|ipad|playbook|silk/i.test(i)||/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(i.substr(0,4)))&&(a=!0),a}window.isMobileOrTablet=window.isMobileOrTablet||isMobileOrTablet;
 
  var map = tt.map({
     key: API_KEY,
     container: 'map',
     dragPan: !isMobileOrTablet(),
     zoom: 13,
     center: PARRISH_HALL
 });
 map.addControl(new tt.FullscreenControl());
 map.addControl(new tt.NavigationControl());
 
 var popup;
 var routeColors = ['#4a90e2', '#fcba03', '#fc0303', '#03fc84', '#7703fc'];
 var infoHint = new InfoHint('info', 'bottom-center').addTo(document.getElementById('map'));
 
 map.once('load', handleCalculateRouteRequest);
 function addMarkers(feature) {
     var startPoint = feature.geometry.coordinates[0];
     var endPoint = feature.geometry.coordinates[feature.geometry.coordinates.length - 1];
     new tt.Marker({ element: createMarkerElement('start') }).setLngLat(startPoint).addTo(map);
     new tt.Marker({ element: createMarkerElement('finish') }).setLngLat(endPoint).addTo(map);
 }
 function createMarkerElement(type) {
     var element = document.createElement('div');
     var innerElement = document.createElement('div');
     element.className = 'route-marker';
     innerElement.className = 'icon tt-icon -white -' + type;
     element.appendChild(innerElement);
     return element;
 }
 function createPopup(feature, lngLat) {
     popup = new tt.Popup({ className: 'tt-popup', offset: [0, 18] })
         .setLngLat(lngLat)
         .setHTML(
             '<div class="tt-pop-up-container">' +
                 '<div class="pop-up-content -small">' +
                     '<div class="pop-up-result-address">' +
                         'Distance: ' + Formatters.formatAsImperialDistance(feature.lengthInMeters) +
                     '</div>' +
                 '</div>' +
             '</div>'
         )
         .setMaxWidth('none');
     popup.addTo(map);
 }
 var callParameters = {
     key: API_KEY,
     maxAlternatives: 0,
     traffic: false,
     travelMode: 'pedestrian'
 };
 function handleCalculateRouteRequest() {
     tt.services.calculateRoute(callParameters)
         .then(function(response) {
             var features = response.toGeoJson().features;
             features.forEach(function(feature, index) {
                 map.addLayer({
                     'id': 'route' + index,
                     'type': 'line',
                     'source': {
                         'type': 'geojson',
                         'data': feature
                     },
                     'paint': {
                         'line-color': routeColors[index],
                         'line-width': 4
                     }
                 });
                 map.on('mouseover', 'route' + index, onPopupTrigger);
             });
             addMarkers(features[0]);
             var bounds = new tt.LngLatBounds();
             var coordinates = features[0].geometry.coordinates;
             var lngLat = coordinates[Math.floor(coordinates.length / 2)];
             var summary = features[0].properties.summary;
             createPopup(summary, lngLat);
             coordinates.forEach(function(point) {
                 bounds.extend(tt.LngLat.convert(point));
             });
             map.fitBounds(bounds, { duration: 0, padding: 105 });
             infoHint.setMessage('Hover over the route to display a popup with route information');
         });
 }
 function onPopupTrigger(event) {
     infoHint.hide();
     if (popup) {
         popup.remove();
     }
     var feature = JSON.parse(event.features[0].properties.summary);
     createPopup(feature, event.lngLat);
 }
 
 function display_route(miles, startLoc, locationList = []) {
    coordList = [];
     map = tt.map({
         key: API_KEY,
         container: 'map',
         dragPan: !isMobileOrTablet(),
         zoom: 13,
         center: PARRISH_HALL
     });
 
     map.addControl(new tt.FullscreenControl());
     map.addControl(new tt.NavigationControl());
 
     for (let i = 0; i < locationList.length; i++) {
        let loc = locationList[i];
        if (loc === 'Dana_Hall/Hallowell_Hall/Danawell_Hall/Wharton') {
            coordList.push(DANAWELL);
        } else if (loc === 'Clothier_Hall') {
            coordList.push(CLOTHIER);
        } else if (loc === 'Underhill_Music_Library/Kohlberg_Hall') {
            coordList.push(KOHLBERG);
        } else if (loc === 'Cornell_Library/Science_Center') {
            coordList.push(SCIENCE_CENTER);
        } else if (loc === 'Beardsley_Hall/Pearson Hall/Trotter_Hall') {
            coordList.push(BEARDSLEY);
        } else if (loc === 'Singer_Hall') {
            coordList.push(SINGER);
        } else if (loc === 'McCabe_Library') {
            coordList.push(MCCABE);
        } else if (loc === 'Willets_Hall/Worth_Hall') {
            coordList.push(WILLETS);
        } else if (loc === 'David_Kemp_Hall/Alice_Paul_Hall/Mertz') {
            coordList.push(MERTZ);
        } else if (loc === 'Sharples_Dining_Hall') {
            coordList.push(SHARPLES);
        } else if (loc === 'Matchbox') {
            coordList.push(MATCHBOX);
        } else if (loc === 'Pittenger_Hall/Palmer_Hall/Roberts_Hall/NPPR_Apartments') {
            coordList.push(PPR);
        } else {
            alert("Building not found!");
        }
     }

     

     callParameters = {
         key: API_KEY,
         maxAlternatives: 0,
         traffic: false,
         locations: coordList,
         travelMode: 'pedestrian'
     };
     var marker = new tt.Marker({
        draggable: false
    }).setLngLat(coordList[0]).addTo(map);

    var marker = new tt.Marker({
        draggable: false
    }).setLngLat(coordList[coordList.length - 1]).addTo(map);
     
     handleCalculateRouteRequest();
 }
 /******************************************************************
  * End of TomTom Map SDK code
  */