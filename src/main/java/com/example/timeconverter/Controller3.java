package com.example.timeconverter;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.ResourceBundle;

public class Controller3 implements Initializable {
    @FXML
    ComboBox<String> sltCountry;
    @FXML
    TextField sysTime;
    @FXML
    TextField cnvTime;
    @FXML
    SplitPane sPane;
    @FXML
    TextField timeDiff;
    Stage window;
    Scene scene;
    Parent root;
    DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("hh:mm a");
    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("E, dd/M/yyyy");
    String timeSys;
    String dateSys;
    String timeCnv;
    String dateCnv;
    LocalTime nowTime;
    LocalDate nowDate;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        sltCountry.setItems(FXCollections.observableArrayList(
                "	Afghanistan	" ,
                "	Albania	" ,
                "	Algeria	" ,
                "	American Samoa	" ,
                "	Andorra	" ,
                "	Angola	" ,
                "	Anguilla	" ,
                "	Antarctica	" ,
                "	Antigua and Barbuda	" ,
                "	Argentina	" ,
                "	Armenia	" ,
                "	Aruba	" ,
                "	Australia	" ,
                "	Austria	" ,
                "	Azerbaijan	" ,
                "	Bahamas	" ,
                "	Bahrain	" ,
                "	Bangladesh	" ,
                "	Barbados	" ,
                "	Belarus	" ,
                "	Belgium	" ,
                "	Belize	" ,
                "	Benin	" ,
                "	Bermuda	" ,
                "	Bhutan	" ,
                "	Bolivia, Plurinational State of	" ,
                "	Bonaire, Sint Eustatius and Saba	" ,
                "	Bosnia and Herzegovina	" ,
                "	Botswana	" ,
                "	Brazil	" ,
                "	British Indian Ocean Territory	" ,
                "	Brunei Darussalam	" ,
                "	Bulgaria	" ,
                "	Burkina Faso	" ,
                "	Burundi	" ,
                "	Cambodia	" ,
                "	Cameroon	" ,
                "	Canada	" ,
                "	Cape Verde	" ,
                "	Cayman Islands	" ,
                "	Central African Republic	" ,
                "	Chad	" ,
                "	Chile	" ,
                "	Christmas Island	" ,
                "	Cocos (Keeling) Islands	" ,
                "	Colombia	" ,
                "	Comoros	" ,
                "	Congo	" ,
                "	Congo, the Democratic Republic of the	" ,
                "	Cook Islands	" ,
                "	Costa Rica	" ,
                "	Croatia	" ,
                "	Cuba	" ,
                "	Curaçao	" ,
                "	Cyprus	" ,
                "	Czech Republic	" ,
                "	Côte d'Ivoire	" ,
                "	Denmark	" ,
                "	Djibouti	" ,
                "	Dominica	" ,
                "	Dominican Republic	" ,
                "	Ecuador	" ,
                "	Egypt	" ,
                "	El Salvador	" ,
                "	Equatorial Guinea	" ,
                "	Eritrea	" ,
                "	Estonia	" ,
                "	Ethiopia	" ,
                "	Falkland Islands (Malvinas)	" ,
                "	Faroe Islands	" ,
                "	Fiji	" ,
                "	Finland	" ,
                "	France	" ,
                "	French Guiana	" ,
                "	French Polynesia	" ,
                "	French Southern Territories	" ,
                "	Gabon	" ,
                "	Gambia	" ,
                "	Georgia	" ,
                "	Germany	" ,
                "	Germany	" ,
                "	Ghana	" ,
                "	Gibraltar	" ,
                "	Greece	" ,
                "	Greenland	" ,
                "	Grenada	" ,
                "	Guadeloupe	" ,
                "	Guam	" ,
                "	Guatemala	" ,
                "	Guernsey	" ,
                "	Guinea	" ,
                "	Guinea-Bissau	" ,
                "	Guyana	" ,
                "	Haiti	" ,
                "	Holy See (Vatican City State)	" ,
                "	Honduras	" ,
                "	Hong Kong	" ,
                "	Hungary	" ,
                "	Iceland	" ,
                "	India	" ,
                "	Indonesia	" ,
                "	Iran, Islamic Republic of	" ,
                "	Iraq	" ,
                "	Ireland	" ,
                "	Isle of Man	" ,
                "	Italy	" ,
                "	Jamaica	" ,
                "	Japan	" ,
                "	Jersey	" ,
                "	Jordan	" ,
                "	Kazakhstan	" ,
                "	Kenya	" ,
                "	Kiribati	" ,
                "	Korea, Democratic People's Republic of	" ,
                "	Korea, Republic of	" ,
                "	Kuwait	" ,
                "	Kyrgyzstan	" ,
                "	Lao People's Democratic Republic	" ,
                "	Latvia	" ,
                "	Lebanon	" ,
                "	Lesotho	" ,
                "	Liberia	" ,
                "	Libya	" ,
                "	Liechtenstein	" ,
                "	Lithuania	" ,
                "	Luxembourg	" ,
                "	Macao	" ,
                "	Macedonia, the Former Yugoslav Republic of	" ,
                "	Madagascar	" ,
                "	Malawi	" ,
                "	Malaysia	" ,
                "	Maldives	" ,
                "	Mali	" ,
                "	Malta	" ,
                "	Marshall Islands	" ,
                "	Martinique	" ,
                "	Mauritania	" ,
                "	Mauritius	" ,
                "	Mayotte	" ,
                "	Mexico	" ,
                "	Micronesia, Federated States of	" ,
                "	Moldova, Republic of	" ,
                "	Monaco	" ,
                "	Mongolia	" ,
                "	Montenegro	" ,
                "	Montserrat	" ,
                "	Morocco	" ,
                "	Mozambique	" ,
                "	Myanmar	" ,
                "	Namibia	" ,
                "	Nauru	" ,
                "	Nepal	" ,
                "	Netherlands	" ,
                "	New Caledonia	" ,
                "	New Zealand	" ,
                "	Nicaragua	" ,
                "	Niger	" ,
                "	Nigeria	" ,
                "	Niue	" ,
                "	Norfolk Island	" ,
                "	Northern Mariana Islands	" ,
                "	Norway	" ,
                "	Oman	" ,
                "	Pakistan	" ,
                "	Palau	" ,
                "	Palestine, State of	" ,
                "	Palestine, State of	" ,
                "	Panama	" ,
                "	Papua New Guinea	" ,
                "	Paraguay	" ,
                "	Peru	" ,
                "	Philippines	" ,
                "	Pitcairn	" ,
                "	Poland	" ,
                "	Portugal	" ,
                "	Portugal	" ,
                "	Puerto Rico	" ,
                "	Qatar	" ,
                "	Romania	" ,
                "	Russian Federation	" ,
                "	Rwanda	" ,
                "	Réunion	" ,
                "	Saint Barthélemy	" ,
                "	Saint Helena, Ascension and Tristan da Cunha	" ,
                "	Saint Kitts and Nevis	" ,
                "	Saint Lucia	" ,
                "	Saint Martin (French part)	" ,
                "	Saint Pierre and Miquelon	" ,
                "	Saint Vincent and the Grenadines	" ,
                "	Samoa	" ,
                "	San Marino	" ,
                "	Sao Tome and Principe	" ,
                "	Saudi Arabia	" ,
                "	Senegal	" ,
                "	Serbia	" ,
                "	Seychelles	" ,
                "	Sierra Leone	" ,
                "	Singapore	" ,
                "	Sint Maarten (Dutch part)	" ,
                "	Slovakia	" ,
                "	Slovenia	" ,
                "	Solomon Islands	" ,
                "	Somalia	" ,
                "	South Africa	" ,
                "	South Georgia and the South Sandwich Islands	" ,
                "	South Sudan	" ,
                "	Spain	" ,
                "	Sri Lanka	" ,
                "	Sudan	" ,
                "	Suriname	" ,
                "	Svalbard and Jan Mayen	" ,
                "	Swaziland	" ,
                "	Sweden	" ,
                "	Switzerland	" ,
                "	Syrian Arab Republic	" ,
                "	Taiwan, Province of China	" ,
                "	Tajikistan	" ,
                "	Tanzania, United Republic of	" ,
                "	Thailand	" ,
                "	Timor-Leste	" ,
                "	Togo	" ,
                "	Tokelau	" ,
                "	Tonga	" ,
                "	Trinidad and Tobago	" ,
                "	Tunisia	" ,
                "	Turkey	" ,
                "	Turkmenistan	" ,
                "	Turks and Caicos Islands	" ,
                "	Tuvalu	" ,
                "	Uganda	" ,
                "	Ukraine	" ,
                "	United Arab Emirates	" ,
                "	United Kingdom	" ,
                "	United States	" ,
                "	United States Minor Outlying Islands	" ,
                "	Uruguay	" ,
                "	Uzbekistan	" ,
                "	Vanuatu	" ,
                "	Venezuela, Bolivarian Republic of	" ,
                "	Viet Nam	" ,
                "	Virgin Islands, British	" ,
                "	Virgin Islands, U.S.	" ,
                "	Wallis and Futuna	" ,
                "	Western Sahara	" ,
                "	Yemen	" ,
                "	Zambia	" ,
                "	Zimbabwe	" ,
                "	Åland Islands	"


                ));
        nowTime = LocalTime.now();
        timeSys = formatterTime.format(nowTime);
        nowDate = LocalDate.now();
        dateSys = formatterDate.format(nowDate);
        sysTime.setText(timeSys+" || "+dateSys);
    }
    public void clickCnvBtn(){
        timeNowFunc();
        ZoneId id = ZoneId.of(userSelect(sltCountry.getValue()));
        ZonedDateTime z = ZonedDateTime.now();
        ZonedDateTime sysZone = ZonedDateTime.of(nowDate,nowTime,z.getZone());
        ZonedDateTime zoneTime = sysZone.withZoneSameInstant(id);
        timeCnv=formatterTime.format(zoneTime);
        dateCnv=formatterDate.format(zoneTime);

        cnvTime.setText(timeCnv+" || "+dateCnv);
        //Time Difference
        int sysHour,sysMin,hour,min,diffH,diffM;
        sysHour=z.getHour();
        sysMin=z.getMinute();
        hour=zoneTime.getHour();
        min=zoneTime.getMinute();
        diffH=sysHour-hour;
        diffM=sysMin-min;
        String sHour=String.valueOf(diffH);
        String sMin=String.valueOf(diffM);
        if(diffH==1&&diffM<0){
            sHour="0";
        }
        timeDiff.setText(sHour+" Hours : "+sMin+" Minutes");

    }
    public void timeNowFunc(){
        nowTime = LocalTime.now();
        timeSys = formatterTime.format(nowTime);
        nowDate = LocalDate.now();
        dateSys = formatterDate.format(nowDate);
        sysTime.setText(timeSys+" || "+dateSys);
    }
    public void clickONExitP3(ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Exit");
        alert.setHeaderText("You are about to exit!!");
        alert.setContentText("You sure you want to Exit!");
        if(alert.showAndWait().get()== ButtonType.OK){
            window=(Stage) sPane.getScene().getWindow();
            window.close();
        }
    }
    public void clickONHome(ActionEvent e) throws IOException {
        window = (Stage)((Node)e.getSource()).getScene().getWindow();
        FXMLLoader loadd = new FXMLLoader(getClass().getResource("View1.fxml"));
        root=loadd.load();
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }
    public String userSelect(String x){
        switch(x){
            case "	Afghanistan	": return "Asia/Kabul";
            case "	Albania	": return "Europe/Tirane";
            case "	Algeria	": return "Africa/Algiers";
            case "	American Samoa	": return "Pacific/Pago_Pago";
            case "	Andorra	": return "Europe/Andorra";
            case "	Angola	": return "Africa/Luanda";
            case "	Anguilla	": return "America/Anguilla";
            case "	Antarctica	": return "Antarctica/Casey";
            case "	Antigua and Barbuda	": return "America/Antigua";
            case "	Argentina	": return "America/Argentina/Buenos_Aires";
            case "	Armenia	": return "Asia/Yerevan";
            case "	Aruba	": return "America/Aruba";
            case "	Australia	": return "Antarctica/Macquarie";
            case "	Austria	": return "Europe/Vienna";
            case "	Azerbaijan	": return "Asia/Baku";
            case "	Bahamas	": return "America/Nassau";
            case "	Bahrain	": return "Asia/Bahrain";
            case "	Bangladesh	": return "Asia/Dhaka";
            case "	Barbados	": return "America/Barbados";
            case "	Belarus	": return "Europe/Minsk";
            case "	Belgium	": return "Europe/Brussels";
            case "	Belize	": return "America/Belize";
            case "	Benin	": return "Africa/Porto-Novo";
            case "	Bermuda	": return "Atlantic/Bermuda";
            case "	Bhutan	": return "Asia/Thimphu";
            case "	Bolivia, Plurinational State of	": return "America/La_Paz";
            case "	Bonaire, Sint Eustatius and Saba	": return "America/Kralendijk";
            case "	Bosnia and Herzegovina	": return "Europe/Sarajevo";
            case "	Botswana	": return "Africa/Gaborone";
            case "	Brazil	": return "America/Araguaina";
            case "	British Indian Ocean Territory	": return "Indian/Chagos";
            case "	Brunei Darussalam	": return "Asia/Brunei";
            case "	Bulgaria	": return "Europe/Sofia";
            case "	Burkina Faso	": return "Africa/Ouagadougou";
            case "	Burundi	": return "Africa/Bujumbura";
            case "	Cambodia	": return "Asia/Phnom_Penh";
            case "	Cameroon	": return "Africa/Douala";
            case "	Canada	": return "America/Atikokan";
            case "	Cape Verde	": return "Atlantic/Cape_Verde";
            case "	Cayman Islands	": return "America/Cayman";
            case "	Central African Republic	": return "Africa/Bangui";
            case "	Chad	": return "Africa/Ndjamena";
            case "	Chile	": return "America/Punta_Arenas";
            case "	Christmas Island	": return "Indian/Christmas";
            case "	Cocos (Keeling) Islands	": return "Indian/Cocos";
            case "	Colombia	": return "America/Bogota";
            case "	Comoros	": return "Indian/Comoro";
            case "	Congo	": return "Africa/Brazzaville";
            case "	Congo, the Democratic Republic of the	": return "Africa/Kinshasa";
            case "	Cook Islands	": return "Pacific/Rarotonga";
            case "	Costa Rica	": return "America/Costa_Rica";
            case "	Croatia	": return "Europe/Zagreb";
            case "	Cuba	": return "America/Havana";
            case "	Curaçao	": return "America/Curacao ";
            case "	Cyprus	": return "Asia/Famagusta ";
            case "	Czech Republic	": return "Europe/Prague";
            case "	Côte d'Ivoire	": return "Africa/Abidjan";
            case "	Denmark	": return "Europe/Copenhagen";
            case "	Djibouti	": return "Africa/Djibouti";
            case "	Dominica	": return "America/Dominica";
            case "	Dominican Republic	": return "America/Santo_Domingo";
            case "	Ecuador	": return "America/Guayaquil";
            case "	Egypt	": return "Africa/Cairo";
            case "	El Salvador	": return "America/El_Salvador";
            case "	Equatorial Guinea	": return "Africa/Malabo";
            case "	Eritrea	": return "Africa/Asmara";
            case "	Estonia	": return "Europe/Tallinn";
            case "	Ethiopia	": return "Africa/Addis_Ababa";
            case "	Falkland Islands (Malvinas)	": return "Atlantic/Stanley";
            case "	Faroe Islands	": return "Atlantic/Faroe";
            case "	Fiji	": return "Pacific/Fiji";
            case "	Finland	": return "Europe/Helsinki";
            case "	France	": return "Europe/Paris";
            case "	French Guiana	": return "America/Cayenne";
            case "	French Polynesia	": return "Pacific/Gambier";
            case "	French Southern Territories	": return "Indian/Kerguelen";
            case "	Gabon	": return "Africa/Libreville";
            case "	Gambia	": return "Africa/Banjul";
            case "	Georgia	": return "Asia/Tbilisi";
            case "	Germany	": return "Europe/Berlin";
            case "	Ghana	": return "Africa/Accra";
            case "	Gibraltar	": return "Europe/Gibraltar";
            case "	Greece	": return "Europe/Athens";
            case "	Greenland	": return "America/Danmarkshavn";
            case "	Grenada	": return "America/Grenada";
            case "	Guadeloupe	": return "America/Guadeloupe";
            case "	Guam	": return "Pacific/Guam";
            case "	Guatemala	": return "America/Guatemala";
            case "	Guernsey	": return "Europe/Guernsey";
            case "	Guinea	": return "Africa/Conakry";
            case "	Guinea-Bissau	": return "Africa/Bissau";
            case "	Guyana	": return "America/Guyana";
            case "	Haiti	": return "America/Port-au-Prince";
            case "	Holy See (Vatican City State)	": return "Europe/Vatican";
            case "	Honduras	": return "America/Tegucigalpa";
            case "	Hong Kong	": return "Asia/Hong_Kong";
            case "	Hungary	": return "Europe/Budapest";
            case "	Iceland	": return "Atlantic/Reykjavik";
            case "	India	": return "Asia/Kolkata";
            case "	Indonesia	": return "Asia/Jakarta";
            case "	Iran, Islamic Republic of	": return "Asia/Tehran";
            case "	Iraq	": return "Asia/Baghdad";
            case "	Ireland	": return "Europe/Dublin";
            case "	Isle of Man	": return "Europe/Isle_of_Man";
            case "	Italy	": return "Europe/Rome";
            case "	Jamaica	": return "America/Jamaica";
            case "	Japan	": return "Asia/Tokyo";
            case "	Jersey	": return "Europe/Jersey";
            case "	Jordan	": return "Asia/Amman";
            case "	Kazakhstan	": return "Asia/Almaty";
            case "	Kenya	": return "Africa/Nairobi";
            case "	Kiribati	": return "Pacific/Kanton";
            case "	Korea, Democratic People's Republic of	": return "Asia/Pyongyang";
            case "	Korea, Republic of	": return "Asia/Seoul";
            case "	Kuwait	": return "Asia/Kuwait";
            case "	Kyrgyzstan	": return "	Asia/Bishkek";
            case "	Lao People's Democratic Republic	": return "Asia/Vientiane";
            case "	Latvia	": return "Europe/Riga";
            case "	Lebanon	": return "Asia/Beirut";
            case "	Lesotho	": return "Africa/Maseru";
            case "	Liberia	": return "Africa/Monrovia";
            case "	Libya	": return "Africa/Tripoli";
            case "	Liechtenstein	": return "Europe/Vaduz";
            case "	Lithuania	": return "Europe/Vilnius";
            case "	Luxembourg	": return "Europe/Luxembourg";
            case "	Macao	": return "Asia/Macau";
            case "	Macedonia, the Former Yugoslav Republic of	": return "Europe/Skopje";
            case "	Madagascar	": return "Indian/Antananarivo";
            case "	Malawi	": return "Africa/Blantyre";
            case "	Malaysia	": return "Asia/Kuala_Lumpur";
            case "	Maldives	": return "Indian/Maldives";
            case "	Mali	": return "Africa/Bamako";
            case "	Malta	": return "Europe/Malta";
            case "	Marshall Islands	": return "Pacific/Kwajalein";
            case "	Martinique	": return "America/Martinique";
            case "	Mauritania	": return "Africa/Nouakchott";
            case "	Mauritius	": return "Indian/Mauritius";
            case "	Mayotte	": return "Indian/Mayotte";
            case "	Mexico	": return "America/Bahia_Banderas";
            case "	Micronesia, Federated States of	": return "Pacific/Chuuk";
            case "	Moldova, Republic of	": return "Europe/Chisinau";
            case "	Monaco	": return "Europe/Monaco";
            case "	Mongolia	": return "Asia/Choibalsan";
            case "	Montenegro	": return "Europe/Podgorica";
            case "	Montserrat	": return "America/Montserrat";
            case "	Morocco	": return "Africa/Casablanca";
            case "	Mozambique	": return "Africa/Maputo";
            case "	Myanmar	": return "Asia/Yangon";
            case "	Namibia	": return "Africa/Windhoek";
            case "	Nauru	": return "Pacific/Nauru";
            case "	Nepal	": return "Asia/Kathmandu";
            case "	Netherlands	": return "Europe/Amsterdam";
            case "	New Caledonia	": return "Pacific/Noumea";
            case "	New Zealand	": return "Pacific/Auckland";
            case "	Nicaragua	": return "America/Managua";
            case "	Niger	": return "Africa/Niamey";
            case "	Nigeria	": return "Africa/Lagos";
            case "	Niue	": return "Pacific/Niue";
            case "	Norfolk Island	": return "Pacific/Norfolk";
            case "	Northern Mariana Islands	": return "Pacific/Saipan";
            case "	Norway	": return 	"Europe/Oslo";
            case "	Oman	": return "Asia/Muscat";
            case "	Pakistan	": return "Asia/Karachi";
            case "	Palau	": return "Pacific/Palau";
            case "	Palestine, State of	": return 	"Asia/Gaza";
            case "	Panama	": return "America/Panama";
            case "	Papua New Guinea	": return "Pacific/Bougainville";
            case "	Paraguay	": return "America/Asuncion";
            case "	Peru	": return "America/Lima";
            case "	Philippines	": return "Asia/Manila";
            case "	Pitcairn	": return "Pacific/Pitcairn";
            case "	Poland	": return "Europe/Warsaw";
            case "	Portugal	": return "Atlantic/Azores";
            case "	Puerto Rico	": return "America/Puerto_Rico";
            case "	Qatar	": return "Asia/Qatar";
            case "	Romania	": return "Europe/Bucharest";
            case "	Russian Federation	": return "Asia/Anadyr";
            case "	Rwanda	": return "Africa/Kigali";
            case "	Reunion	": return "Indian/Reunion";
            case "	Saint Bartholemy	": return "America/St_Barthelemy ";
            case "	Saint Helena, Ascension and Tristan da Cunha	":return "Atlantic/St_Helena";
            case "	Saint Kitts and Nevis	": return "America/St_Kitts";
            case "	Saint Lucia	": return "America/St_Lucia";
            case "	Saint Martin (French part)	": return "America/Marigot";
            case "	Saint Pierre and Miquelon	": return "America/Miquelon";
            case "	Saint Vincent and the Grenadines	": return "America/St_Vincent";
            case "	Samoa	": return "Pacific/Apia";
            case "	San Marino	": return "Europe/San_Marino";
            case "	Sao Tome and Principe	": return "Africa/Sao_Tome";
            case "	Saudi Arabia	": return "Asia/Riyadh";
            case "	Senegal	": return "Africa/Dakar";
            case "	Serbia	": return "Europe/Belgrade";
            case "	Seychelles	": return "Indian/Mahe";
            case "	Sierra Leone	": return "Africa/Freetown";
            case "	Singapore	": return "Asia/Singapore";
            case "	Sint Maarten (Dutch part)	": return "America/Lower_Princes";
            case "	Slovakia	": return "Europe/Bratislava";
            case "	Slovenia	": return "Europe/Ljubljana";
            case "	Solomon Islands	": return "Pacific/Guadalcanal";
            case "	Somalia	": return "Africa/Mogadishu";
            case "	South Africa	": return "Africa/Johannesburg";
            case "	South Georgia and the South Sandwich Islands	": return "Atlantic/South_Georgia";
            case "	South Sudan	": return "Africa/Juba";
            case "	Spain	": return "Africa/Ceuta";
            case "	Sri Lanka	": return "Asia/Colombo";
            case "	Sudan	": return "Africa/Khartoum";
            case "	Suriname	": return "America/Paramaribo";
            case "	Svalbard and Jan Mayen	": return "Arctic/Longyearbyen";
            case "	Swaziland	": return "Africa/Mbabane";
            case "	Sweden	": return "Europe/Stockholm";
            case "	Switzerland	": return "Europe/Zurich";
            case "	Syrian Arab Republic	": return "Asia/Damascus";
            case "	Taiwan, Province of China	": return "Asia/Taipei";
            case "	Tajikistan	": return "Asia/Dushanbe";
            case "	Tanzania, United Republic of	": return "Africa/Dar_es_Salaam";
            case "	Thailand	": return "Asia/Bangkok";
            case "	Timor-Leste	": return "Asia/Dili";
            case "	Togo	": return "Africa/Lome";
            case "	Tokelau	": return "Pacific/Fakaofo";
            case "	Tonga	": return "Pacific/Tongatapu";
            case "	Trinidad and Tobago	": return "America/Port_of_Spain";
            case "	Tunisia	": return "Africa/Tunis";
            case "	Turkey	": return "Europe/Istanbul";
            case "	Turkmenistan	": return "Asia/Ashgabat";
            case "	Turks and Caicos Islands	": return "America/Grand_Turk";
            case "	Tuvalu	": return "Pacific/Funafuti";
            case "	Uganda	": return "Africa/Kampala";
            case "	Ukraine	": return "Europe/Kiev";
            case "	United Arab Emirates	": return "Asia/Dubai";
            case "	United Kingdom	": return "Europe/London";
            case "	United States	": return "America/Adak";
            case "	United States Minor Outlying Islands	": return "Pacific/Midway";
            case "	Uruguay	": return "America/Montevideo";
            case "	Uzbekistan	": return "Asia/Samarkand";
            case "	Vanuatu	": return "Pacific/Efate";
            case "	Venezuela, Bolivarian Republic of	": return "America/Caracas";
            case "	Viet Nam	": return "Asia/Ho_Chi_Minh";
            case "	Virgin Islands, British	": return "America/Tortola";
            case "	Virgin Islands, U.S.	": return "America/St_Thomas";
            case "	Wallis and Futuna	": return "Pacific/Wallis";
            case "	Western Sahara	": return "Africa/El_Aaiun";
            case "	Yemen	": return "Asia/Aden";
            case "	Zambia	": return "Africa/Lusaka";
            case "	Zimbabwe	": return "Africa/Harare";
            case "	Åland Islands	": return "Europe/Mariehamn";
            default: break;
        }
        return "Asia/Dhaka";
    }
}
