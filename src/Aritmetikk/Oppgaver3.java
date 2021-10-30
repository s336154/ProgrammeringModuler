//Something went wrong here!!
// I wrote showMessageDialog instead of showInputDialog at the first time

package Aritmetikk;
//Lag et program som regner ut arealet av et rektangel. Programmet skal lese inn lengden og bredden på rektangelet.
// Regn så ut  arealet og skriver ut svaret på følgende måte:
// ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.


import static javax.swing.JOptionPane. *;
public class Oppgaver3 {
    public static void main(String [] args){
        double lengde = Double.parseDouble(showInputDialog("Skriv inn lengden til rektangelet:"));
        double bredde= Double.parseDouble(showInputDialog("Skriv inn breddet til rektangelet:"));
        double areal = lengde*bredde;
        showMessageDialog(null,"”Et rektangel med bredde "+bredde+" cm og lengde "+lengde+" cm har et arealet på "+areal+" cm^2.");
    }
     /*   String innLengde = showInputDialog("Skriv inn lengden:");
        String innBredde = showInputDialog("Skriv inn bredden:");
        double lengde =Double.parseDouble(innLengde);
        double bredde = Double.parseDouble(innBredde);
        double areal = lengde * bredde ;
        System.out.print("Et rektangel med bredde "+bredde+" cm og lengde "+lengde+
       " cm har et areal på "+areal+" cm^2");

    } */
}
