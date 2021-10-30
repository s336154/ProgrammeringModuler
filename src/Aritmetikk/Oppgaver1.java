//Something went wrong here!!
//"String navn" with no prefixes before "navn"

package Aritmetikk;
//Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel):
// Per Olsen er i dag 32 år. Han er født i 1986. I 2053 er han 67 år og da vil han være pensjonist.
//(Tallene er utifra året 2018).

import static javax.swing.JOptionPane. *;

public class Oppgaver1 {
public static void main(String [] args){
    String navn = showInputDialog("Skriv inn navnet ditt;");
    int alder = Integer.parseInt(showInputDialog("Skriv inn alderen din:"));
    int fødselsår = Integer.parseInt(showInputDialog("Skriv inn ditt fødselsår"));
    int pensjonsår = fødselsår + 67;
    showMessageDialog(null,navn+ " er i dag "+alder+" år. Han er født i "+fødselsår+". I "+pensjonsår+" er han 67 år og da vil han være pensjonist.");
}


    /* String navn = showInputDialog("Skriv inn navnet:");
    String innAlder = showInputDialog("Skriv inn alderen: ");
    int alder= Integer.parseInt(innAlder);
    int fødselsår = 2020 - alder;
    int pensjonsår = fødselsår + 67;
    System.out.print(navn+ " er idag "+alder+" år. Han er født i "+fødselsår);
    System.out.print(". I "+pensjonsår+" er han 67 år og da vil han være pensjonist.");
} */
}