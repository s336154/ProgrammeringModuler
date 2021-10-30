// This was a bit long to be builded

package kontrollstrukturer2;

//Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
//Finn også gjennomsnittet.

public class oppgave8 {
    public static void main(String [] args){
        int sum  = 0;
        int teller = 0;
        int i = 0;
        while (i<100)
        { sum += i; i += 2; teller++; }
        double gjennomsnitt = (double)sum/(double)teller;

            System.out.println("Summen av alle partallene mellom 0 og 98 er "+sum);
        System.out.println("Gjennomsnitt av alle partallene mellom 0 og 98 er "+gjennomsnitt);
        }}

//PLEASE NOTCE THE WAY THEY SUMMED THE EVEN NUMBERS