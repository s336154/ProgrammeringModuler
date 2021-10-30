//This was interesting bcz it was without writing name inside the bracket in "personer.remove()"

package arrays2;
import java.util.ArrayList ;
class Person5 {
    public String navn;
    public int alder;
}
    public class Forelesning5 {
        public static void main(String[] args) {
            ArrayList<Person5> personer = new ArrayList<>();
            Person5 ole = new Person5();
            ole.navn = "Ole";
            ole.alder = 45;
            personer.add(ole);
            Person5 dedrick = new Person5();
            dedrick.navn = "Dedrick";
            dedrick.alder = 39;
            personer.add(dedrick);
            personer.remove(0); // You could have wrote the name of the variable here instead
            for (Person5 enPerson5 : personer)
                System.out.println(enPerson5.navn + " " + enPerson5.alder);
        }

    }


