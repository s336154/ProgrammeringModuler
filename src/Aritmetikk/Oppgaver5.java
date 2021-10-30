//Here they introduced string.format .2f% variabel
// "String omkretsenMedToDesimaler" brukes for å få 2 desimaler = String.format("%.2f" , omkretsen)

package Aritmetikk;
//Lag et program som regner om fra fahrenheit til celsius.
// Les inn verdien for fahrenheit og regn ut tilsvarende celsius med følgende formel:
// C = (F-32)/1.8. Skriv så ut resultatet i Celsius.


import static javax.swing.JOptionPane. *;

public class Oppgaver5 {
    public static void main(String [] args){
        String innGraderIFahernheit = showInputDialog("Skriv inn gradene i Fahernheit");
        double graderFaherenheit = Double.parseDouble(innGraderIFahernheit);
        double graderCelsius = (graderFaherenheit-32)/1.8;
        String graderCelsiusMedtoDesimaler = String.format("%.2f", graderCelsius);
        System.out.print(innGraderIFahernheit+" grader F gir "+graderCelsiusMedtoDesimaler+" grader C.");
    }
}
