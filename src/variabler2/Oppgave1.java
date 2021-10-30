package variabler2;
//Lag et program som leser inn alderen din (et heltall).
// Vis så denne i en meldingsbox sammen med en tekst f.eks som ”Min alder er 19 år.”

import static javax.swing.JOptionPane. *;

public class Oppgave1 {
    public static void main(String [] main){
        int alder = Integer.parseInt(showInputDialog("Skriv inn alderen din:"));
        showMessageDialog(null,"Min alder er "+alder+" år.");
    }

        /* String innAlder = showInputDialog("Skriv inn alderen din : ");
        int alder = Integer.parseInt(innAlder);
        showMessageDialog(null, "Min alder er "+alder+" år:");
    } */

}

