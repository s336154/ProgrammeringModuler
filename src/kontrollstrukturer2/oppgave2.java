// try multiplication
//når man skriver "println" så blir svarene sorteret i en kollon!! med "print" blir det som en rad på samme linje

package kontrollstrukturer2;
// Lag en forløkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)
public class oppgave2 {
    public static void main(String [] args){
        int sum =0;
        for(int i=0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Summen av alle tallene mellom 0 og 9 er "+sum);

        }
    }

