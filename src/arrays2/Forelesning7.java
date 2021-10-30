//HERE IT WAS WITHOUT "&&" AND I ADDED JUST TO TRY IT!!
//I CHANGED LOTS IN  THIS ONE!!

package arrays2;
import java.util.ArrayList ;
class Person7{
    public String navn;
    public int alder;}

    public class Forelesning7 {
        public static void main(String[] args) {
            ArrayList<Person7> personer = new ArrayList<>();
            Person7 ole = new Person7();
            ole.navn = "Ole";
            ole.alder = 45;
            personer.add(ole);

            Person7 dedrick = new Person7();
            dedrick.navn = "Dedrick";
            dedrick.alder = 39;
            personer.add(dedrick);

    /*        personer.remove(ole); */

            if (personer.contains(ole) )
            { System.out.println("Liste inneholder ole!"); }

            else if (personer.contains(dedrick))
            { System.out.println("Liste innholder Dedrick!"); }

            else if (personer.contains(ole) && personer.contains(dedrick))
            { System.out.println("Da er begge Ola og Dedrick er i liste!"); }

            else { System.out.println("Ole og Dedrick er ikke begge to i lista!"); } }}


