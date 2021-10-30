//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
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
//This was even more common than the last one!!
class Person5 {
    public String navn;
    public int fødselsår;
    public int alder(int årastall) {
         int alder = årastall - fødselsår;
         return alder;
     }
}

public class Forelesning5 {
    public static void main(String [] args) {
        Person5 person1 = new Person5();
        person1.navn="Sari Ali";
        person1.fødselsår = 1992;
           //     int alder = person1.alder(2020);
        //System.out.print(person1.navn+" er "+alder+ " år " );
        System.out.print(person1.navn+" er "+person1.alder(2020)+ " år " );
    }
}

//I liked this one!!