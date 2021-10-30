//Here "0" was the first number on the løkke!!

//når man skriver "println" så blir svarene sorteret i en kollon!! med "print" blir det som en rad på samme linje

package kontrollstrukturer2;

// Lag en forløkke som viser alle partall mellom fra 0 til 20 med et mellomrom mellom tallene (0 til og med 18).

public class oppgave3 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i+=2){ // i = i + 2
            System.out.print(i + " ");
        }
    }
}