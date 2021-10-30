package variabler2;
// Endre på programmet i oppgave 3 slik at du skriver at det skrives inn tall og
// ikke vanlig tekst i input-boksene. Bruk try og catch for å få dette til.
// Dersom det ikke skrives inn tall sett input til 0.

// Her presenters det funksjonen gjennomsnittet
//I tillegg er det løkkene ; try og catch som er nye ..

import static javax.swing.JOptionPane.*;


public class Oppgave4 {
    public static void main(String[] args) {
        String innTall1 = showInputDialog("Skriv inn et desmaltall:");
        String innTall2 = showInputDialog("Skriv inn et desmaltall til:");
        String innTall3 = showInputDialog("Skriv inn enda et desmaltall:");

        double tall1, tall2, tall3;

        try {
            tall1 = Double.parseDouble(innTall1);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        } catch (Exception e) {
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
        }
        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = +sum / 3;

        showMessageDialog(null, "Summen av tallene " + tall1 + "," + tall2 + " og " + tall3 + " er " + sum + ". \n Gjennomsnittet av de tallene er " + gjennomsnitt);
        System.out.print("Summen av tallene " + tall1 + "," + tall2 + " og " + tall3 + " er " + sum + ". \n Gjennomsnittet av de tallene er " + gjennomsnitt);


    }
}