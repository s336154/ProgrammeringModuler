// Here they used "if" followed by "else"

package kontrollstruktur1;
//Les inn en heltallsvariabel. Skriv så ut en tekst
// ”Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet”.
// Dvs. at du må ha en beslutning som tester på om alderen eller mellom 18 og 20.
// Dersom dette ikke er tilfelle skriv ut ”Du er enten umyndig eller så kan du kjøpe hva du vil på polet”.
import static javax.swing.JOptionPane. *;
public class KS1oppgave1 {
    public static void main(String[] args) {
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);
        if (alder >= 18 && alder <= 20) {
            showMessageDialog(null, "Du er myndig, men kan ikke kjøpe alkohol " +
                    " med mere enn 22 % på polet"); }
        else {
            showMessageDialog(null, "Du er enten umyndig eller så kan du kjøpe hva du " +
                    " vil på polet!"); } }}
