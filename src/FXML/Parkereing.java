package FXML;

/* class Bil{
    public String bilNummer;
    public Date startTid;
    public int plass;
    public boolean kortTid; // true = korttids parkering

    public Bil(String bilNummer, Date startTid, boolean kortTid) {
        // konstruktør
    }

    public String formaterKvittering(){
        // formater kvitteringen etter oppgitt format
    }

    public double getPris(){
        // returner 10 eller 20 kroner avhengig av kortTid eller ikke
    }
    public double avgift(){
        // regner ut tiden som er gått i timer og ganger med prisen
    }
}

class Parkeringshus{
    // opprett arrayet av biler

    public void reserverPlass(Bil enBil){
        // legg bilen i arrayet
    }

    public String frigjørPlass(String bilNummeret){
        /*
        ** må finne bilen i arrayet
        ** når den er funnet slett den fra arrayet
        ** og formater kvitteringen som returneres
        ** dersom bilen ikke finnes skal man returnere en passenede tekst

    }
            }

public class FXMLDocumentController {

    // opprett parkeringshuset

    @FXML
    private Label lblAvgift;

    @FXML
    private TextField txtBilnummer;

    @FXML
    void kjørUt(ActionEvent event) {
        // kall frigjør plass og legg ut kvitteringen i lblAvgift
    }

    @FXML
    void regKorttid(ActionEvent event) {
        // opprett en bil
        // og kall på reserver plass
    }

    @FXML
    void regLangtid(ActionEvent event) {
        // opprett en bil
        // og kall på reserver plass
    }
} */

public class Parkereing {

    /* package sample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

class Bil{
    public String bilNummer;
    public Date startTid;
    public int plass;
    public boolean kortTid;

    public Bil(String bilNummer, Date startTid, boolean kortTid) {
        this.bilNummer = bilNummer;
        this.startTid = startTid;
        this.kortTid = kortTid; }

    public String formaterKvittering(){
        String startDatoTid = new SimpleDateFormat("dd.MM.YYYY HH:mm").format(startTid);
        String nå = new SimpleDateFormat("dd.MM.YYYY HH:mm").format(new Date()); // bcz "Date nå" has not been formed yet!!
        String ut = "Kvittering for bilnr "+bilNummer+"\n";
        ut+="Start tid :"+startDatoTid+" til "+nå+"\n"+"Betalt "+avgift()+" kr";
        return ut;
    }

    public double getPris(){
        if(this.kortTid)
        { return 20.0; }
        else { return 10.00; }
    }

    public double avgift(){
        Date nå = new Date(); // we r defining it here bcz we r goin 2 use the function nxt
        long varighet = nå.getTime() - startTid.getTime(); // "long" =  10 desimalers nøyaktighet
        // riktig antall millisekunder i en time er 3_600_000 (when divided by 10_000 result = 360)
        int timer = (int)varighet/10_000; // gir mulighet for å teste (10 sekunder)
        double pris = timer * getPris();
        return pris;
    }
}

class Parkeringshus{
    public ArrayList<Bil> parkering = new ArrayList<>();

    public void reserverPlass(Bil enBil)
    { parkering.add(enBil);}


    public String frigjørPlass(String bilNummeret){
        // må finne bilen i arrayet
        for (Bil enBil : parkering){
            if (enBil.bilNummer.equals(bilNummeret)){
                // bilen er funnet
                parkering.remove(enBil);
                return enBil.formaterKvittering(); } } //closes the brackets of "for-løkke" !!

        return "Fant ikke bilen!"; // otherwise if this wasnt the case, we skipped typing else here !!
    } }

public class Controller {

    Parkeringshus pHus = new Parkeringshus();

    @FXML
    private Label lblAvgift;

    @FXML
    private TextField txtBilnummer;

    @FXML
    void kjørUt(ActionEvent event) {
        String melding = pHus.frigjørPlass(txtBilnummer.getText());
        lblAvgift.setText(melding);
    }

    @FXML
    void regKorttid(ActionEvent event) {
        // opprett en bil
        Date nå = new Date();
        Bil enBil = new Bil(txtBilnummer.getText(),nå,true); // "true" bcz "this.korttid" !!
        pHus.reserverPlass(enBil);
    }

    @FXML
    void regLangtid(ActionEvent event) {
        // opprett en bil
        Date nå = new Date();
        Bil enBil = new Bil(txtBilnummer.getText(),nå,false); "false" bcz not "this.korttid" !!
        pHus.reserverPlass(enBil);
    }
} */
}
