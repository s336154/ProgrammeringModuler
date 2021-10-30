// when u use "void" instead of "int" then you must type "System.out" right after the sentences
// You have to build these codes with the same order!!
// Here it was little different


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

class Person3 {
    public String navn;
    public int fødselsår;
    public void alder() {
        int alder = 2020 - fødselsår;
        System.out.print( alder+ " år "); // when we write it slik so we can get "år" at the end
    }
}

public class Forelesning3 {
    public static void main(String [] args) {
        Person3 person1 = new Person3();
        person1.navn = "Sari Ali";
        person1.fødselsår = 1992;
        System.out.print(person1.navn+ " er ");
        person1.alder();
    }
}
