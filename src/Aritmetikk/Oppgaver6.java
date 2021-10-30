package Aritmetikk;
//Lag et program som leser inn et beløp i amerikanske dollar (USD) og regner om og skriver ut tilsvarende beløp i norske kroner.
// Benytt dagens valutakurs fra nettet.
import static javax.swing.JOptionPane. *;
public class Oppgaver6 {
    public static void main(String [] args) {
        String innValuta = showInputDialog("Skriv inn antall us-dollar (USD)");
        int valuta = Integer.parseInt(innValuta);
        double norskeKroner = valuta * 8.50 ;
        System.out.print(valuta+" USD tilsvarer "+ norskeKroner+" NOK");
    }
}
