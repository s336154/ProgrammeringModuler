//REVISE THIS ONE AGAIN!

package arrays1;
//Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.

public class Oppgave7 {
    public static void main(String [] args){

        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};

        int partall =liste[0];
        int oddetall=liste[0];

        for(int i : liste)

        {
            if(i%2==0){ partall++; }
            else{ oddetall++; }
        }

        System.out.println("Liste inneholder "+partall+" partall");
        System.out.println("Liste inneholder "+oddetall+" oddetall"); }}

//THERE IS A DIFFERENCE BETWEEN HELTALLS-ARRAYET AND HELTALLS ARRAYLIST!!