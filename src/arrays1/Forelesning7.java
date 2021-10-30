//Vi bruker ikke inverted commas mellom tall!! som alder for eksempel

package arrays1;

class Person7{
    public String navn;
    public int alder;
}

public class Forelesning7 {
    public static void main(String [] args){
        Person7 [] liste = new Person7[2];
        Person7 ole = new Person7();
        ole.navn="Ole";
        ole.alder=22;

        liste[0]=ole;

        Person7 line = new Person7();
        line.navn ="Line";
        line.alder=21;

        liste[1]=line;

        for (int i=0; i<liste.length; i++) {
            System.out.println(liste[i].navn+" "+liste[i].alder);
        }

    }
}
