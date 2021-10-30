//Here they introduced the modulus function!!

package Aritmetikk;
//Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
// Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver.
// Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren.
// Skriv ut resultatet på følgende form: ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.
import static javax.swing.JOptionPane. *;
public class Oppgaver7 {
    public static void main(String[] args) {

        int antallPizza = Integer.parseInt(showInputDialog("Skriv inn antall pizza er"));
        int antallPersoner = Integer.parseInt(showInputDialog("Skriv inn antall personer"));
        int antallSlices = Integer.parseInt(showInputDialog("Skriv inn antall slices er"));

        int antallSlicesPerPerson = (antallPizza * antallSlices) / antallPersoner;
        int rest = (antallPizza * antallSlices) % antallPersoner;

        System.out.print("Dersom man er " + antallPersoner + " personer og har " + antallPizza + " pizzaer" +
                "med " + antallSlices + " slices pr. pizza får hver person" +
                antallSlicesPerPerson+" og " + rest + " blir til overs. ");
    }
}


//HERE REST WAS UNIQUE FORMULA !!