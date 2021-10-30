//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!

// This was more relevant than the last one!!

package klasserOgObjekter1;

class Person4{
    public String navn;
    public int fødselsår;

    public int alder() {
        int alder = 2020 - fødselsår;
        return alder; // here we had to define the variable bcz we didnt wtite void in the start
    }
}

public class Forelesning4 {
    public static void main(String [] args) {
        Person4 person1 = new Person4();
        person1.navn="Sari Ali";
        person1.fødselsår= 1992;
      //  int alder = person1.alder();
      //  System.out.print(person1.navn+ " er " +alder+ " år ");
        System.out.print(person1.navn+ " er " +person1.alder()+ " år. ");

    }
}
