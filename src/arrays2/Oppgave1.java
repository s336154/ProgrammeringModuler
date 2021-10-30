//THIS WAS VERY DIFFFERENT FROM THE ONES WE HAD ON THE LECTURE!!
// THERE WAS : liste.get()
//We had to type : liste.add(i) before the System.out.println

package arrays2;

//Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
//Skriv ut element nummer 3 og 6 med System.out

import java.util.ArrayList;
public class Oppgave1 {
    public static void main(String [] args){
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            liste.add(i);
        }
      /*  System.out.println(liste); */
        System.out.println("Element nr 3 er "+liste.get(3)); // Notice "liste.get().attrivute" !!
        System.out.println("Element nr 6 er "+liste.get(6));
    }
}

//THERE IS A DIFFERENCE BETWEEN HELTALLS-ARRAYET AND HELTALLS ARRAYLIST!!