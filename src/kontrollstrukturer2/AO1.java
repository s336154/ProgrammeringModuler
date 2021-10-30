// THERE WAS SOMETHING WRONG HERE!!

package kontrollstrukturer2;

//Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer.
// Programmet skal lese inn to og to verdier, lengden på turen i km og hvor mye bensin som ble brukt.
// Les inn ved hjelp av inputbokser (JOptionPane). Når lengden på turen er 0 eller negativ avsluttes innlesningen
// og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.

import static javax.swing.JOptionPane. *;
public class AO1 {
    public static void main(String[] args) {
        String innKM, innLiter;
        double antallKM, antallLiter;
        double totaltAntallLiter=0, totaltKM=0; // used in addition thats why "=0"
        do{
            innKM = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antallKM = Double.parseDouble(innKM);
            innLiter = showInputDialog("Skriv inn antall liter som er brukt på turen!");
            antallLiter = Double.parseDouble(innLiter);
            totaltAntallLiter += antallLiter;
            totaltKM += antallKM;
        }while (antallKM > 0); // denomenater must be positive!!
        double snitt = totaltAntallLiter / totaltKM * 10;
        showMessageDialog(null, "Gjennomsnittlig forbruk pr mil er "+snitt+" liter");
    }
}


/*    public static void main(String[] args) {
        String innKM, innLiter;
        double antallKM, antallLiter;
        double totaltAntallLiter=0, totaltKM=0;
        do{
            innKM = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antallKM = Double.parseDouble(innKM);
            innLiter = showInputDialog("Skriv inn antall liter som er brukt på turen!");
            antallLiter = Double.parseDouble(innLiter);
            totaltAntallLiter += antallLiter;
            totaltKM += antallKM;
        }while (antallKM > 0);
        double snitt = totaltAntallLiter / totaltKM * 10;
        showMessageDialog(null, "Gjennomsnittlig forbruk pr mil er "+snitt+" liter");
    }
}
*/
