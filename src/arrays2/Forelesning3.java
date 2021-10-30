package arrays2;
import java.util.ArrayList;
class Person3 {
    public String navn;
    public int alder;
}

public class Forelesning3 {
    public static void main(String[] args) {
        ArrayList<Person3> personer = new ArrayList<>();
        Person3 ole = new Person3();
        ole.navn = "Ole";
        ole.alder = 45;
        personer.add(ole);
        Person3 dedrick = new Person3();
        dedrick.navn = "Dedrick";
        dedrick.alder = 39;
        personer.add(dedrick);
        for (Person3 enPerson3 : personer)
            System.out.println(enPerson3.navn + " " + enPerson3.alder);
    }
}
