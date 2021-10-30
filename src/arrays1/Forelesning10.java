//This was a bit different!!
// for-løkke here looks like the one in Arrays2

package arrays1;

class Person10 {
    public String navn;
            public int alder;
}
public class Forelesning10 {

    private static void endrePerson10(Person10[] innListe, String nyttNavn){
        innListe[0].navn = nyttNavn;
    }

    public static void main(String[] args) {
        Person10[] liste = new Person10[2];
        Person10 ole = new Person10();
        ole.navn ="Ole";
        ole.alder = 23;
        liste[0] = ole;
        Person10 dedrick = new Person10();
        dedrick.navn="Dedrick";
        dedrick.alder=39;
        liste[1]= dedrick ;
        endrePerson10(liste, "Finn");
        for(Person10 enPerson10 : liste){
            System.out.println(enPerson10.navn+" "+enPerson10.alder); //instead of naming it as liste it has been named enPerson10!!
        }
    }
}
