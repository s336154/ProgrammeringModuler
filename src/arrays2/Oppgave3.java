//THIS WAS DIFFERENT!!

package arrays2;
//Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
// Skriv kode for å konvertere dette til et ArrayList. Skriv så ut denne ArrayListen.
import java.util.ArrayList ;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] liste1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};


     ArrayList<Integer> liste2 = new ArrayList<>(); // BRUK <Integer> når det er nummeric values!!
        for(int i : liste1)
        { liste2.add(i); }
        for(int i = 0; i < liste2.size(); i++)
        { System.out.print(liste2.get(i)+" "); } // Notice "liste.get().attrivute" !! */
        }
    }


//THERE IS A DIFFERENCE BETWEEN HELTALLS-ARRAYET AND HELTALLS ARRAYLIST!!