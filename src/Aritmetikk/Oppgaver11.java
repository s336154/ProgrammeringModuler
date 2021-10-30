//THIS WAS VERY DIFFERENT!!

package Aritmetikk;
//Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen).
// F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13. Tips: 751 % 10 = 1 og 751 / 10 = 75.

import static javax.swing.JOptionPane. *;

public class Oppgaver11 {
    public static void main(String [] args){
        String innTall = showInputDialog("Skriv inn et tall mellom 0 og 1000");
        int tall = Integer.parseInt(innTall);
        int utTall = tall;
        int sum = 0;

        int enkeltTall= tall%10;
        sum += enkeltTall;
        tall = tall/10;

        enkeltTall= tall % 10;
        sum +=enkeltTall;
        tall = tall/10;

        sum += tall;

        System.out.print("Tversummen av tallet "+utTall+" er "+sum );

    }
}


// THIS WAS SO DIFFERENT TOO!!