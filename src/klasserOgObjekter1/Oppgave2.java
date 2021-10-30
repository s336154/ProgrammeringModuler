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
// Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.
// This took time!! you need to revise well!! This was very hard!!
import static javax.swing.JOptionPane. *;
class Bøker2 {
    String tittel;
    double pris;
    String forfatter;
    String IBSN_nummer;

    void skrivut(){
        String ut = "Tittel: "+tittel+" \n Pris: "+pris+" \n Forfatteren: "+forfatter+" \n IBSN nummer: "+IBSN_nummer;
        showMessageDialog(null, ut);
    }
}
public class Oppgave2 {
    public static void main(String [] args){
        Bøker2 bok1 = new Bøker2();
       String forfatter= showInputDialog("forfatternavnet : ");
        String tittel= showInputDialog("Tittelen er :");
        String innPris= showInputDialog("Prisen er ; ");
        String nummer= showInputDialog("IBSN-nummeret er ");
        double pris = Double.parseDouble(innPris);
                bok1.forfatter=forfatter;
        bok1.tittel = tittel;
        bok1.pris = pris;
        bok1.IBSN_nummer = nummer; // we must define these varibles
        bok1.skrivut();

    }
}
