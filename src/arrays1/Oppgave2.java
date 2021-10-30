//THIS WAS DIFFERENT
package arrays1;

//Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
// Finn så gjennomsnittet av alle tallene.
// Summer så alle tallene som er større enn 5.
// Finn så gjennomsnittet av disse. Summer så tallene med en forenklet for-løkke.

public class Oppgave2 {
    public static void main(String [] args){

int [] liste ={1,2,3,4,5,6,7,8,9};
int sum = 0;
for(int i=0; i< liste.length; i++)
{ sum += liste[i]; }
System.out.println("Summen av listen er "+sum);

double gjennomsnitt1 =(double)sum/liste.length;
System.out.println("Gjennomsnitt av de samme tallene er "+gjennomsnitt1);

// i could have skipped writting "int" b4 sum and erased the "2" after it
 sum = 0;
int teller = 0;

 for(int i : liste){
    if(i > 5) { sum += i; teller++; } }  // Dont forget the teller++

System.out.println("Summen av tallene større enn 5 i listen er "+sum);
double gjennomsnitt2 = (double)sum/ teller;
        System.out.print("Gjennomsnitt av de samme tallene er "+gjennomsnitt2); }}
//THERE IS A DIFFERENCE BETWEEN HELTALLS-ARRAYET AND HELTALLS ARRAYLIST!!