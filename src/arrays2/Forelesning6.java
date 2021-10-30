package arrays2;
import java.util.ArrayList ;
class Person6 {
    public String navn;
    public int alder;
}

    public class Forelesning6 {
        public static void main(String[] args) {
            ArrayList<Person6> personer = new ArrayList<>();
            Person6 ole = new Person6();
            ole.navn = "Ole";
            ole.alder = 45;
            personer.add(ole);
            Person6 dedrick = new Person6();
            dedrick.navn = "Dedrick";
            dedrick.alder = 39;
            personer.add(dedrick);
            personer.clear(); // The whole data have been deleted !!
            for (Person6 enPerson6 : personer)
                System.out.println(enPerson6.navn + " " + enPerson6.alder);
        }

    }
