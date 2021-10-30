//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!
package klasserOgObjekter1;

class Person2 {
    public String navn(String fornavn, String etternavn) {
        String navn = fornavn + " " + etternavn;
        return navn;
    }
}

public class Forelesning2 {
    public static void main(String [] args) {
        Person2 enPerson = new Person2();
    //   String etNavn = enPerson.navn("Sari", "Ali");
     //   enPerson.navn("Sari", "Ali");
        System.out.println( enPerson.navn("Sari", "Ali"));
     //   System.out.println(etNavn);
    }
}
