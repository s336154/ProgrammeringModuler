// Here is a new function that we never used before
// try to use this function in rekkevidde exercises
//når man skriver "println" så blir svarene sorteret i en kollon!! med "print" blir det som en rad på samme linje

package kontrollstrukturer2;
//Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)

public class
oppgave4 {
   public static void main(String [] args){
        int sum = 0;
        int teller = 0;
        for( int i = 0; i<100; i+=2) { sum += i; teller++;}
        double gjennomsnitt = (double)sum/(double)teller;
        System.out.println("Summen av alle partallene fra 0 til 98 er "+sum);
        System.out.println("Gjennomsnittet av alle partallene fra 0 til 98 er "+gjennomsnitt);
    } /*
  public static void main(String [] args){
      int sum = 0;
      int i = 0;
      for( i = 0; i<100; i+=2) { sum += i;}

      System.out.println("Summen av alle partallene fra 0 til 98 er "+sum);

  }*/
}
