//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!

package klasserOgObjekter1;
// Når man instansiererer objekter med suffix 1,2,3..osv så må samme suffix skrives i hele arket..
class Bil1 {
    public String farge;
}

public class Forelesning1 {
    public static void main(String [] args) {
        Bil1 bil1 = new Bil1();
        Bil1 bil2 = new Bil1();
        bil1.farge="rød";
        bil2.farge="grønn";
        Bil1 bil3 = new Bil1();
        bil3.farge="blå";
        System.out.print("Fargen til bil 2 er " +bil2.farge);
    }
}
