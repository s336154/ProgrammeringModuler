// for-løkke here looks like the one in Arrays2
// Do you see "Person9 [] liste" &    "for(Person9 enPerson9 : liste)"

package arrays1;
class Person9 {
    public String navn;
    public int alder;
}

public class Forelesning9 {
    public static void main(String [] args) {
        Person9 [] liste = new Person9[2];

        Person9 ole = new Person9();
            ole.navn="Ole";
            ole.alder=45;

            liste[0]= ole;

            Person9 dedick = new Person9();
            dedick.navn="Dedick";
            dedick.alder=39;

            liste[1]= dedick;

            for(Person9 enPerson9 : liste)

                System.out.println(enPerson9.navn+" "+enPerson9.alder); //instead of naming it as liste it has been named enPerson9!!!!


    }
}

