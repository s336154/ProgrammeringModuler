package Eksam2019;

public class Oppgave1 {
    public static void main(String[] args) {
     //   for (int i = 0; i < 100; i += 3) {
          //  System.out.print(i + " ");
      //  }
        // b)
        int sum = 0;
        int antall = 0;
        int tall =2;
        while (tall <= 100) {
            sum += tall;
            tall +=2;
            antall++;
        }
        double gjennomsnitt = sum / (double) antall;

   //    System.out.println("Gjennomsnittet er " + gjennomsnitt);
        System.out.println("Gjennomsnittet er " + tall);
    }
}