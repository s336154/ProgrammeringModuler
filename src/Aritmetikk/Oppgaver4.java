// "String omkretsenMedToDesimaler" brukes for å få 2 desimaler = String.format("%.2f" , omkretsen);

package Aritmetikk;
//Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
// Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte:
// ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”
//Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler.
import static javax.swing.JOptionPane. *;
public class Oppgaver4 {
    public static void main(String [] args){
        String innRadius = showInputDialog("Skriv inn radiusen");
        double radius = Double.parseDouble(innRadius);
        double omkrets = 2 * 3.14 * radius ;
       String omkretsMedToDesimaler = String.format("%.2f", omkrets);
        System.out.print("Omkretsen til sirkelen med "+radius+" cm som radius blir "+
                omkretsMedToDesimaler+" cm. ");
    }
}

// HERE WE HAVE DONE THE STEP WITH omkretsMedToDesimaler after we were done with everything else in the exercise
