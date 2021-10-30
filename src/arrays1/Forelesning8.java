//Slide 11 av 14 og fremover!

package arrays1;

class Person8{
    public String navn;
    public int alder;
}

public class Forelesning8 {
    public static void main(String [] args){
        Person8[] liste = new Person8[3];
        Person8 ole = new Person8();
        ole.navn="Ole";
        ole.alder=45;
        liste[0]= ole;
        Person8 line = new Person8();
        line.navn="Line";
        line.alder=65;
        liste [1]=line;

        for(int i=0 ; i<liste.length; i++){
            if(liste[i] != null) {
                System.out.println(liste[i].navn+" "+liste[i].alder);
            }
        }

    }
}
