// "Telefonnr" er "String" not "int"!
// "System.out" was just in the start here!
// This was sooo different!
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
//Lag en klasse kalt Person. Denne skal inneholde følgende attributter:
//navn
//adresse
//telefonnr
//fødselsår
//Lag en metode for å regne ut alderen til en person.
//Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.
//Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:
//Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.
//Opprett et eller flere person objekter i main-metoden for å teste ut.

class Person31 {
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødslesår;
    public int alder(){
        return 2020-fødslesår;
    }  // when u write return then define the variable. ie not void
    public void skrivut(int alder){
        String ut = navn+" med adressen "+adresse+" med telefonnummer "+telefonnr+
                " er "+alder+" år ";
        System.out.println(ut);
    }
}
public class Oppgave3 {
    public static void main(String [] args){
        Person31 enPerson = new Person31();
        enPerson.navn= "Sari Ali";
        enPerson.adresse="Undelstadsveien 115";
        enPerson.telefonnr = "6713711";
        enPerson.fødslesår = 1992;
      //  int alder = enPerson.alder();
        enPerson.skrivut(enPerson.alder());
    }
}

//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!
// NOTICE HOW DIFFERENT THE ALDER ATTRIBUTE IS FROM THE OTHERS HERE!!