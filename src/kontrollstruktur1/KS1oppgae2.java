// Here they used "if" løkke two times

package kontrollstruktur1;

//Les inn en heltallsvariabel "alder".
//Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :
//”Du kan ta førerkortet for bil da du er gammel nok” eller
//”Du er for ung til å ta førerkort for bil”.
//Gjør dette uten bruk av en else-setning (bruk to if-setninger).
import static javax.swing.JOptionPane. *;

public class KS1oppgae2 {
    public static void main(String [] args){
        String innAlder = showInputDialog ("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);
        if (alder >= 18) {
            showMessageDialog( null, "Du kan ta førerkort for bil da er du gammel nok !"); }
        if (alder <18) {
            showMessageDialog( null, "Du er for ung til å ta førerkort for bil !"); } }}
