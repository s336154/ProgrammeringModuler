package FXML;

public class Kodebrikke {

    /*

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

class KodeGenerator {
    private int[] kodeArray;
    private Random r = new Random();
    private int nyKodeIndeks = 0; // behandlet som "i" i oppgaven!!

    public KodeGenerator( int antall ) {
            kodeArray = new int[antall];
            genererKoder();
    }

    private void genererKoder() {

       // Fyller  kodeArray med tilfeldige, 6-sifrede tall.
       // NB! Det laveste mulige tallet skal være 100000, og det høyeste 999999.
       // (notice that we often use "for-løkke" when instansiering listes)

        for( int i = 0; i < kodeArray.length; i++) {
        kodeArray[i] = 100000 + r.nextInt(900000); // we are adding the object(function)
    }
}

    public String nyKode(int maksAntall) {
        // returnerer ny kode fra arrayet eller en feilmelding ved array-slutt
        if(nyKodeIndeks<maksAntall)
        { return Integer.toString(kodeArray[nyKodeIndeks++]); }
        return "Maks antall!";
    }

    public String formaterBrukteKoder() {
        // løp igjennom arrayet og formater kodene med \n i mellom
        // kodene fra og med 0 til nyKodeIndeks er "brukte" koder
        String ut="";
        for( int i = 0; i < nyKodeIndeks; i++)
        { ut+=kodeArray[i]+"\n"; }

        return ut;
    }}

public class Controller {

    // husk denne!
    public final int MAKS_ANTALL=10;
    private KodeGenerator generator = new KodeGenerator(MAKS_ANTALL);

    @FXML
    private Label lblGamleKoder;

    @FXML
    private Label lblNyKode;

    @FXML
    void gamleKoder(ActionEvent event) {
        lblGamleKoder.setText(generator.formaterBrukteKoder());
    }

    @FXML
    void nyKode(ActionEvent event) {
        lblNyKode.setText(generator.nyKode(MAKS_ANTALL));
    }
} */

}
