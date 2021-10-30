//THIS WAS TOTALLY DIFFERENT FROM THE OTHERS!!
// NO "Arraylist" in "import java.util. *;"

package arrays2;
import java.util. *;

public class Forelesning10 {
    public static void main(String [] args){
        ArrayList<Integer>liste = new ArrayList<>();
        liste.add(23);
        liste.add(22);
        liste.add(-2);
        liste.add(-5);

        int indeks = liste.indexOf(22);
        liste.remove(indeks);

        Collections.sort(liste); //This is the new function here!! Variables are arranged in +ing order!

        for(int tall : liste)
        { System.out.print(tall+" "); } }}
