package variabler2;
//Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn.
// Vis så dette resultatet via 1) Meldingsboks og 2) System.out.

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane. *;
public class Oppgave3 {
    public static void main(String [] args) {
        String innTall1 = showInputDialog("Skriv inn et desmaltall:");
        String innTall2 = showInputDialog("Skriv inn et desmaltall til:");
        String innTall3 = showInputDialog("Skriv inn enda et desmaltall:");
        double tall1 = Double.parseDouble(innTall1);
        double tall2 =  Double.parseDouble(innTall2);
        double tall3 =  Double.parseDouble(innTall3);
        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = +sum/3 ;
        showMessageDialog(null, "Summen av tallene "+tall1+","+tall2+" og "+tall3+" er "+sum+". \n Gjennomsnittet av de tallene er "+gjennomsnitt);
        System.out.print("Summen av tallene "+tall1+","+tall2+" og "+tall3+" er "+sum+". \n Gjennomsnittet av de tallene er "+gjennomsnitt);


    }

}
