package variabler2;
//Lag et program som leser inn tre desimaltall.
// Programmet skal så summere disse tallene og vise summen i System.out.

//Here I did a mistake which waas writing "etDesmatall1,etDesimaltall2..osv istedenfor "innTall1,innTall2,innTall3"
//In addition to this I wrote Integer.parseInt instead of Double.parseDouble

import static javax.swing.JOptionPane. *;

public class Oppgave2 {
    public static void main(String [] args){
        /*
        double tall1 = Double.parseDouble("Skriv inn et desimaltall:");
        double tall2 = Double.parseDouble("Skriv inn et desimaltall til:");
        double tall3 = Double.parseDouble("Skriv inn et desimaltall til:"); }
         double sum = tall1 +  tall2 + tall3;
    System.out.print("Summen av desimaltallene er "+sum);
        */
        String innTall1 = showInputDialog("Skriv inn et desmaltall:");
        String innTall2 = showInputDialog("Skriv inn et desmaltall til:");
        String innTall3 = showInputDialog("Skriv inn enda et desmaltall:");
        double tall1 = Double.parseDouble(innTall1);
        double tall2 =  Double.parseDouble(innTall2);
        double tall3 =  Double.parseDouble(innTall3);
        double sum = tall1 + tall2 + tall3;
        System.out.print("Summen av desimaltallene "+tall1+","+tall2+" og "+tall3+" er "+sum);

    }
}
