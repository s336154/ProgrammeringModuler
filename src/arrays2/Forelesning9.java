//Here it was all about the inndex position
//new method : personer.indexOf()

package arrays2;
import java.util.ArrayList ;
class Person9{
    public String navn;
    public int alder;
}

public class Forelesning9 {
    public static void main(String[] args) {
        ArrayList<Person9> personer = new ArrayList<>();
        Person9 ole = new Person9();
        ole.navn = "Ole";
        ole.alder = 45;
        personer.add(ole);

        Person9 dedrick = new Person9();
        dedrick.navn = "Dedrick";
        dedrick.alder = 39;
        personer.add(dedrick);

        int indeks;
        indeks = personer.indexOf(ole);
        indeks = personer.indexOf(dedrick);

            System.out.println("Indeksen til objekt ole : "+indeks);
        }
    }
