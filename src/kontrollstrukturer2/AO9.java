package kontrollstrukturer2;
//Skriv et program som regner ut fakultet til et tall. n! = n*(n-1)*(n-2)*...*1.
//F. eks 5! = 5*4*3*2*1 = 120
//Programmet skal lese inn tallet og skrive ut resultatet.

import static javax.swing.JOptionPane.*;
public class

AO9 {
    public static void main(String[] args) {
        int nummer = Integer.parseInt(showInputDialog("Skriv inn et heltall for fakultet:"));
        int utNummer = nummer;
        int resultat=nummer;
        for (int i=nummer-1; i>0;i--){
            resultat *=i;
        }
        showMessageDialog(null,utNummer+"! er "+resultat);
    }
}

