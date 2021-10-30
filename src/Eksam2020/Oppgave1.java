package Eksam2020;
import static javax.swing.JOptionPane.*;

class KonverterTemperatur{
    public static double tilCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
    public static double tilFahrenheiht(double Celcius){
        return Celcius * 1.8 + 32;
    }
}



public class Oppgave1 {

    public static void main (String [] args){


        double celisus = Double.parseDouble(showInputDialog("Skriv inn gardene i Celcius:"));
        double fahernheit = Double.parseDouble(showInputDialog("Skriv inn gardene i Faherheit:"));
        String ut = celisus+" C blir "+ String.format("%.2f",KonverterTemperatur.tilFahrenheiht(celisus))+"F  \n "+
              fahernheit+"F blir "+String.format("%.2f",KonverterTemperatur.tilCelsius(fahernheit))+"C";
        showMessageDialog(null,ut);

        //      KonverterTemperatur.tilCelsius(fahrenheit)+" C");
    //    System.out.println(celisus+" C blir "+
       //         KonverterTemperatur.tilFahrenheiht(celisus)+" F");

       // System.out.println(fahrenheit+" F blir "+
          //      KonverterTemperatur.tilCelsius(fahrenheit)+" C");
    }
}


