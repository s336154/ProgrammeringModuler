
package kontrollstruktur1;

// Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).

import static javax.swing.JOptionPane. *;

public class KS1oppgave3 {
    public static void main(String [] args){
        String innAlder = showInputDialog ("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);
        if (alder >= 18) {
            showMessageDialog( null, "Du kan ta førerkort for bil da er du gammel nok !"); }

        else {
            showMessageDialog( null, "Du er for ung til å ta førerkort for bil !"); } }}

