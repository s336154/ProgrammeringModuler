//når man skriver "println" så blir svarene sorteret i en kollon!! med "print" blir det som en rad på samme linje

package kontrollstrukturer2;

// Lag en while-løkke som viser alle tallene fra 0 til 10 på hver sin linje under hverandre (0 til og med 9).

public class oppgave5 {
    public static void main(String [] args) {
        int i = 0;
        while(i < 10){
            i++;
            System.out.println(i);
        }
    }
}
