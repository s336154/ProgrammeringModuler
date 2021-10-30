// "for ( int i = 0; i<10; i++)" retunenrer  "1,2,3,4,5,6,7,8,9"

package arrays2;

//Bruk samme array som i oppgave 1. Legg til tallene 10 og 11 i arrayet.
// Slett så elementene med tallene 2 og 3.
// Skriv så ut hele arrayet med en for-løkke. Bruk size() for å finne lengden i arrayet.

import java.util.ArrayList ;
public class Oppgave2 {
    public static void main(String [] args) {
        ArrayList<Integer> liste = new ArrayList<>(); // BRUK <Integer> når det er nummeric values!!
        for (int i = 0; i < 10; i++)
        { liste.add(i); }
        liste.add(10);
        liste.add(11);
        liste.remove(2);
        liste.remove(3);

              for(int i = 0; i< liste.size(); i++) // Notice "liste.size" here !
              { System.out.print(liste.get(i) + " "); } }} // Notice "liste.get().attrivute" !!

//THERE IS A DIFFERENCE BETWEEN HELTALLS-ARRAYET AND HELTALLS ARRAYLIST!!