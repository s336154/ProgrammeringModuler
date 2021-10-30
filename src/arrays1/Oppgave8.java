//THIS IS A REAL ADVANCED INPUT DIALOG BOX!
// I DIDNT CHECK THIS ONE ON 03.11.20

//Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever - poengene er mellom 0 og 100.
//Lag et program som først leser inn hvor mange poengsummer som skal leses inn.
// Så skal det opprettes et heltalls-array med riktig lengde (fra input).
// Deretter skal det leses inn poengsummer via en løkke samtidig som arrayet fylles.
// Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette på skjermen.
// (Det er mulig å løse denne oppgaven enklere uten å bruke array, men oppgaven trener på bruk av arrays).
//Bruk gjerne try/catch ved parsing av input og spør igjen om tall dersom det ikke er oppgitt riktig.

package arrays1;
import static javax.swing.JOptionPane. *;

public class Oppgave8 {
    public static void main(String[] args) {
        int antall, poeng;
        String innAntall, innPoeng;

        innAntall = showInputDialog("Hvor mange poengsummer skal leses inn!");

        try{ antall= Integer.parseInt(innAntall); }

        catch(Exception e){
            antall = 0;
            showMessageDialog(null, "Feil, det ble ikke satt noe antall, avslutter!"); }

        int [] poengsum = new int[antall];
        while (antall>0) {
            innPoeng =showInputDialog("Skriv inn poengsum");
            try{
                poeng = Integer.parseInt(innPoeng);
                poengsum[antall]= poeng;
                antall --; }

            catch(Exception e){
                showMessageDialog(null, "feil i input av poengsum, trykk Enter"); } }

        int sum = 0 ;
        for (int i : poengsum ) { sum += i; }
        if (poengsum.length>0){
            double gjennomsnitt = (double)sum/poengsum.length;
            showMessageDialog(null, "Gjennomsnittet er "
                    +String.format("%.2f", gjennomsnitt)); }}}

//THERE IS A DIFFERENCE BETWEEN HELTALLS-ARRAYET AND HELTALLS ARRAYLIST!!