//Here they used løkke "switch" and classes "case" and "break" ;

package kontrollstruktur1;

//Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:
//Sommer : juni, juli, august
//Høst : september, oktober, november
//Vinter: desember, januar, februar,
//Vår : mars, april, mai,
//b) Lag deretter et program som løser det med bruk av switch.

import static javax.swing.JOptionPane. *;
public class KS1oppgave5b {
    public static void main(String [] args) {
        String måned= showInputDialog( "Skriv inn måneden (f.eks mars)");
        switch (måned){
            case "juni":
            case "juli":
            case "august":
                showMessageDialog( null, "Det er sommer");
            break;
            case "september":
            case "oktober":
            case "november":
                showMessageDialog( null, "Det er høst");
                break;
            case "desember":
            case "januar":
            case "februar":
                showMessageDialog( null, "Det er vinter");
                break;
            case "mars":
            case "april":
            case "mai":
                showMessageDialog( null, "Det er vår");
                break;
            default:
                showMessageDialog( null, "Feil i input, ikke gyldig måned"); } } }

