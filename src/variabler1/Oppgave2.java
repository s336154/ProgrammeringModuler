package variabler1;
//Utvid oppgave 1 med å lese inn alderen.
//Programmet skal så vise følgende i meldingsboksen (f.eks inndata):
// ”Alderen til Ole Olsen er 21 år.”

import static javax.swing.JOptionPane. *;

public class Oppgave2 {
    public static void main(String[] args) {
        String fornavn = showInputDialog("Skriv inn fornavn;");
        String etternavn = showInputDialog("Skriv inn etternavn");
        String alder = showInputDialog("Skriv inn alderen");
        String navn = fornavn + " " + etternavn;
        showMessageDialog(null, "Alderen til "+navn+" er " +alder+" år");

    }
}