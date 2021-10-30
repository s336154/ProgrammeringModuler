//THIS WAS ONE OF A KIND !!
//THERE WAS SOMETHING WRONG HERE!!

package kontrollstrukturer2;

import static javax.swing.JOptionPane. *;

public class Forelesning7 {
    public static void main(String [] args){
        double sum=0;
        double tall= Double.parseDouble(showInputDialog("Skriv inn et positivt tall. Avslutt med 0"));
        while(tall>0) {
            sum += tall;
            tall = Double.parseDouble(showInputDialog("Skriv inn et positivt tall. Avslutt med 0"));
        tall++;}
        showMessageDialog(null, "Summen av tallene er "+sum);
    }}
 //There is something wwrong with this one !!