// "void" brukes på metoder som ikke skal returnere noen verdi.

package klasserOgObjekter2;
//Lag en klasse «Person» med følgende private attributter:
//fornavn
//etternavn
//adresse
//telefonnr
//Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.
//Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.
//Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.
class Bøker11{
    String tittel;
    double pris;
    String forfatter;
    String IBSN_nummer;

    void skrivut(){
        System.out.println("Tittelen : "+tittel);
        System.out.println("Prisen : "+pris);
        System.out.println("Forfatteren : "+forfatter);
        System.out.println("IBSN nummer : "+IBSN_nummer);
    }

}
public class Oppgave1 {
    public static void main(String [] args){
        Bøker11 bok1 = new Bøker11();
        bok1.forfatter="Nesbø";
        bok1.pris=345.66;
        bok1.tittel="Kniv";
        bok1.IBSN_nummer="123467782";
        bok1.skrivut();


    }
}
