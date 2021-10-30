package variabler1;
//Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i System.out.

import static javax.swing.JOptionPane. *;

public class Oppgave5 {
    public static void main(String[] args) {
        String fornavn = showInputDialog("Skriv inn fornavn;");
        String etternavn = showInputDialog("Skriv inn etternavn");
        String alder = showInputDialog("Skriv inn alderen");
        String adresse = showInputDialog("Skriv inn adressen");
        String postnr = showInputDialog("Skriv inn postnnmmeret");
        String poststed = showInputDialog("Skriv inn poststed");

        String ut = "Navn : " + fornavn + " " + etternavn + "\n" +
                "Adresse : " + adresse + "\n" +
                "Postnummer : " + postnr + "\n" +
                "Poststed : " + poststed + "\n" +
                "Alder : " + alder + " år.";
        System.out.println(ut);
    }
}