//Here there was for-løkke and the personer.size instead of liste.length and tabel.length
// & there was also personer.get().attribute

package arrays2;
import java.util.ArrayList ;
class Person8{
    public String navn;
    public int alder;
}

public class Forelesning8 {
    public static void main(String[] args) {
        ArrayList<Person8> personer = new ArrayList<>();

        Person8 ole = new Person8();
        ole.navn = "Ole";
        ole.alder = 45;
        personer.add(ole);

        Person8 dedrick = new Person8();
        dedrick.navn = "Dedrick";
        dedrick.alder = 39;
        personer.add(dedrick);

        for (int i = 0; i < personer.size(); i++) // This part made us add get to the function below

        { System.out.println(personer.get(i).navn + " " + personer.get(i).alder); } }} //Notice "liste.get().attrivute" !!
