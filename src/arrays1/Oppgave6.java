//I couldnt get the answer from the first time here!!

package arrays1;
//Lag et program som sjekker om to heltalls-arrays er like.
// Bruk løkker, ikke innebygd java klasse/metode.

public class Oppgave6 {
    public static void main(String[] args) {
        int[] liste1 = {45, 34, 5, 8, 20, 2, 23, 25};
        int[] liste2 = {45, 34, 5, 8, 20, 2, 23, 25};

  /*      if (liste1.length != liste2.length) {
            System.out.println("Arrayene er ikke like da er de ikke like nege");
        } else {
            boolean like = true;
            for (int i = 0; i < liste1.length; i++) {
                like = false;
            }
        } */

        if (liste1.length==liste2.length)
        { System.out.println("Arrayene er like!"); }

        else { System.out.println("Arrayene er ikke like!!"); } }}

//THERE IS A DIFFERENCE BETWEEN HELTALLS-ARRAYET AND HELTALLS ARRAYLIST!!