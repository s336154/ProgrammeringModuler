//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!

package klasserOgObjekter1;
// Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
//tittel
//pris
//forfatter
//iSBN-nummer
//Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
//Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier.
// Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.

class Bøker1 {
    String tittel;
    double pris;
    String forfatter;
    String IBSN_nummer;

        void skrivut(){
            System.out.println("Tittelen : "+tittel );
            System.out.println("Prisen er : "+pris);
            System.out.println("Forfatteren er : "+forfatter);
            System.out.println("ISBN_nummer : "+IBSN_nummer);
        }
}

public class Oppgave1 {
    public static void main(String [] args){

        Bøker1 bok1 = new Bøker1();

        bok1.forfatter="Nesbø";
        bok1.tittel= "kniv";
        bok1.pris= 345.00;
        bok1.IBSN_nummer="1234446585";

        bok1.skrivut();
    }
}
