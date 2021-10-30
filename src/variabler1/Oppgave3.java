package variabler1;
//Utvid oppgave 2 med adresse, poststed og postnr. Les inn dataene i flere
// inputbox'er og skriv det ut i en setning f.eks :
// Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo. Ole’s alder er 21 år.

import static javax.swing.JOptionPane. *;

public class Oppgave3 {
    public static void main(String[] args) {
        String fornavn = showInputDialog("Skriv inn fornavn;");
        String etternavn = showInputDialog("Skriv inn etternavn");
        String alder = showInputDialog("Skriv inn alderen");
        String adresse = showInputDialog("Skriv inn adressen");
        String postnr = showInputDialog("Skriv inn postnnmmeret");
        String poststed = showInputDialog("Skriv inn post sted");

       /* String ut = fornavn+" "+etternavn+" bor i "+adresse+" som har postnummer "+postnr+" i "+poststed+
                ". "+fornavn+"'s alder er "+alder+" år. "; */
        showMessageDialog(null, fornavn+" "+etternavn+" bor i "+adresse+" som har postnummer "+postnr+" i "+poststed+
                ". "+fornavn+"'s alder er "+alder+" år. ");
    }
}