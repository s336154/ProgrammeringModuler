package kontrollstrukturer2;
//Et program skal finne det største tallet av 10 heltall.
// Tallene skal leses inn via Inputbokser og vises som en meldingsboks. Programmet skal bruke tre heltallsvariabler:
//telller; som teller 0 til 10
//nummer; som er tallet som er lest inn
//størst; det til en hver tid største tallet
import static javax.swing.JOptionPane.*;

public class AO4 {
        public static void main(String[] args) {
            int nummer;
            int størst=0;
            for (int teller = 1; teller <= 10; teller++){

             //   String innTall=showInputDialog("Skriv inn heltall nummer "+teller);

                nummer = Integer.parseInt(showInputDialog("Skriv inn heltall nummer "+teller));

                if(nummer>størst)
                { størst = nummer; } }

            showMessageDialog(null,"Det største tallet er "+størst);
        }}

// This was very  very interesting!!