package FXML;

/*
class Valuta {
    // sort og kurs
    // konstruktør
}

class Kalkulator {

    // array av Valuta

    public void fyllListe() {
        // legg inn Valuta objekter i arrayet
    }

    public String beregn(String valuta, String beløp) {
        // feilhåndter innlesning av tall
        // dersom det ikke er riktig returner feilmelding
        // ellers returner "Beregnet beløp blir ... kr".
        // bruk DecimalFormat df = new DecimalFormat("####0.00");
        // og df.format() for å få to desimaler

    }
}

public class FXMLDocumentController {

    // opprett kakulatoren her

    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtBeløp, txtValuta;

    @FXML
    void Beregn(ActionEvent event) {
        // kall fyllListe
        // kall beregn og legg resultatet ut i label'en

    }
} */

public class Valuta {

    /*

import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

class Valuta {

    public String sort;
    public double kurs;

    public Valuta(String sort, double kurs) {
        this.sort = sort;
        this.kurs = kurs;
    }}

class Kalkulator {

    public Valuta[] liste = new Valuta[2]; // Vi instansierer listet !!

    public Kalkulator(){   // Konstruktoren til klassen
        Valuta valuta1 = new Valuta("USD", 8.45);
        liste[0] = valuta1;
        Valuta valuta2 = new Valuta("EUR", 9.45);
        liste[1] = valuta2;
    }

    public  String beregn(String valuta, String beløp) {
        boolean funnet=false;
        String ut="";
        for (Valuta enValuta : liste) {
            if (enValuta.sort.equals(valuta)) {
                funnet=true;
                try {
                    double innBeløp = Double.parseDouble(beløp); // bcz the value is integer here!
                    double resultat = innBeløp * enValuta.kurs;
                    DecimalFormat df = new DecimalFormat("####0.00");
                    ut ="Beregnet beløp blir " + df.format(resultat) + " kr ";
                }

                catch (Exception e) {
                    ut =  "Skriv inn tall i beløpet!";
                } } }

        if(!funnet) {
            ut = "Skriv inn korrekt valutasort!";
        }
        return ut;
    }
}

public class Controller {

    private Kalkulator kalkulator = new Kalkulator();

    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtBeløp, txtValuta;

    @FXML
    void Beregn(ActionEvent event) {
        String ut = kalkulator.beregn(txtValuta.getText(),txtBeløp.getText());
        lblResultat.setText(ut);
    }
} */

}
