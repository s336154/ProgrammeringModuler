package FXML;

/* class Film{
    public String tittel;
    public double utLeiePris;
    public Person leidAv;

    // konstruktør inn her

}

class Person{
    public String navn;
    public String telefonnr;

    // konstruktør inn her
}

class FilmUtleie{

    // instansier arrayet her

    public FilmUtleie() {

        // legg inn filmene som skal være til utleie her
        // to filmer holder
    }

    public String leiUt(String navn, String telefonnr, String tittel){
        // sjekk om filmen finnes og at den ikke er leid ut (at leidAv er null)
        // returner meldinger om det var vellykket utleie
        // om ikke filmen fantes
        // eller om filmen fantes men den var utleid

    }

    public String leverInn(String tittel){
        // sjekk om filmen finnes og at den er utleid (at det er et personobjekt på leidAv)
        // dersom dette nullstill person-pekeren i filmen og returner at den ble levert
        // returner feilmelding dersom filmen ikke finnes
        // returner også feilmelding dersom filmen finnes med ikke er utleid

    }

    @Override
    public String toString(){
        // løp igjennom hele registrert og formater

    }
}


public class FXMLDocumentController {

    // instansier Filmutleien her

    @FXML
    private TextField txtKundeNavn;

    @FXML
    private TextField txtKundeTelefon;

    @FXML
    private TextField txtFilmTittel;

    @FXML
    private Label lblOversikt;

    @FXML
    void leiUt(ActionEvent event) {
        // kall leiUt og legg resultatet i oversikts-labelen
    }

    @FXML
    void leverInn(ActionEvent event) {
        // kall lever inn og legg resultatet i oversikts-labelen
    }

    @FXML
    void visUtleie(ActionEvent event) {
        // kall toString metoden og legg resultatet i oversikts-labelen
    }
} */

public class Film {

    /*

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

class Film{
    public String tittel;
    public double utLeiePris;
    public Person leidAv;

    public Film(String tittel, double utLeiePris, Person leidAv) {
        this.tittel = tittel;
        this.utLeiePris = utLeiePris;
        this.leidAv = leidAv;
    }
}

class Person{
    public String navn;
    public String telefonnr;

    public Person(String navn, String telefonnr) {
        this.navn = navn;
        this.telefonnr = telefonnr;
    }
}

class FilmUtleie{
    // bare en film på samme tittel!
    public ArrayList<Film> register = new  ArrayList<>();

    public FilmUtleie() {
        Film nyFilm1 = new Film("Lav sol", 30.0, null);
        register.add(nyFilm1);
        Film nyFilm2 = new Film("Høy sol", 40.0, null);
        register.add(nyFilm2);
    }


    public String leiUt(String navn, String telefonnr, String tittel){
        // sjekk om filmen finnes og at den ikke er leid ut (at leidAv er null)
        String resultat = "";
        boolean funnet = false;
        for (Film enFilm : register){
            if(enFilm.tittel.equals(tittel)){
                // filmen funnet
                funnet=true;
                if(enFilm.leidAv==null){ // null means it is not borrowed!!
                    // det går ann å leie filmen
                    // opprett personobjekt og lenk det inn i filmen
                    Person enPerson = new Person(navn, telefonnr);
                    enFilm.leidAv = enPerson;
                    resultat += "Filmen ble korrekt leid ut\n";
                    resultat += "Prisen er"+enFilm.utLeiePris+" kr";

                }
                else{ // this continues with funnet true
                    resultat += "Filmen ble funnet, men den er leid ut!";
                }
            }
        }
        if(!funnet)
        { resultat += "Filmen finnes ikke";}
        return resultat;
    }

    public String leverInn(String tittel){
        String resultat = "";
        // finn filmen igjen.
        boolean funnet = false;
        for (Film enFilm : register){
            if(enFilm.tittel.equals(tittel)){
                // filmen funnet
                funnet = true;
                if(enFilm.leidAv!=null){
                    // filmen var utleid
                    enFilm.leidAv = null;
                    resultat += "Filmen ble korrekt levert!";
                }
                else{
                    resultat += "Filmen var ikke utleid!";
                }
            }
        }
        if(!funnet){
           resultat += "Filmen ble ikke funnet!";
        }
        return resultat;
    }

    @Override
    public String toString(){
       String ut="";
        // løp igjennom hele registrert og formater
       for (Film enFilm : register){
           ut +="Tittel : "+enFilm.tittel+". Pris "+enFilm.utLeiePris+" kr \n";
           if(enFilm.leidAv!=null){
               ut+="er utleid til "+enFilm.leidAv.navn+" "+enFilm.leidAv.telefonnr+"\n";
           }
           else{
               ut+= "er ikke utleid\n";
           }
           ut+="---------------\n";
       }
       return ut;
    }
}


public class Controller {

    FilmUtleie utleie = new FilmUtleie();

    @FXML
    private TextField txtKundeNavn;

    @FXML
    private TextField txtKundeTelefon;

    @FXML
    private TextField txtFilmTittel;

    @FXML
    private Label lblOversikt;

    @FXML
    void leiUt(ActionEvent event) {
        String resultat;
        resultat=utleie.leiUt(txtKundeNavn.getText(),
                            txtKundeTelefon.getText(),
                            txtFilmTittel.getText());
        lblOversikt.setText(resultat);
    }

    @FXML
    void leverInn(ActionEvent event) {
        String resultat;
        resultat = utleie.leverInn(txtFilmTittel.getText());
        lblOversikt.setText(resultat);
    }

    @FXML
    void visUtleie(ActionEvent event) {
        lblOversikt.setText(utleie.toString());
    }
} */

}
