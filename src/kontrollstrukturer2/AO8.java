package kontrollstrukturer2;
//Palindrom er en sekvens med tegn som kan leses likt begge veier. Feks. 12321 er et palindrom.
// Skriv et program som leser inn et 5 sifret heltall og avgjør om dette er et palindrom eller ikke.
// Dersom ikke tallet er 5 siffer,
// les inn tallet på nytt. Tips: Bruk heltallsdivisjon og modulus for å finne de ulike sifrene i tallet.

    import static javax.swing.JOptionPane.*;

public class AO8 {
        public static void main(String[] args) {
            int nummer, tall1, tall2;
            do{
                nummer = Integer.parseInt(showInputDialog("Skriv inn et femsifret heltall:"));
            } while (nummer<10_000 || nummer>100_000);

            // her er nummer mellom 10_000 og 99_999
            // sjekk første og siste tall
            boolean palindrom1 = false;
            boolean palindrom2 = false;
            tall1 = nummer / 10_000;
            tall2 = nummer % 10;
            if(tall1==tall2){
                palindrom1 =true;
            }
            nummer = (nummer - tall1*10_000)/10;
            // sjekk første og siste tall
            tall1 = nummer / 100;
            tall2 = nummer % 10;
            if(tall1==tall2){
                palindrom2 =true;
            }
            if(palindrom1 && palindrom2){
                showMessageDialog(null,"Palindrom");
            }
            else{
                showMessageDialog(null,"IKKE palindrom");
            }
        }
    }

    //i HAVE TO REVISE THIS ONE!!