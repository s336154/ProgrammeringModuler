//Here they used løkkene ; "if" followed by "else if" and then followed "else" løkke to introduce many cases

package kontrollstruktur1;
//Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år).
// Oppdater oppgavene over slik at programmet skriver ut meldingene
//Du er for ung til å ta førerkort for bil
//Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
//Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane. *;

public class KS1oppgave4 {
    public static void main(String[] args) {
        String innAlder = showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);
        if (alder < 18) {
            showMessageDialog(null, "Du er for ung til å ta førerkort !");
        } else if (alder < 70) {
            showMessageDialog(null, "Du kan ta førerkort for bil og " +
                    " du trenger ikke legeskjekker!");
        } else {
            showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil " +
                    "men du ma ha årlige legesjkker ! "); }}}



