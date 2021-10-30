//HERE THEY INTRODUCED ATTRIBUTE "måned", function "måned.eguals" by using løkkene "if" and "else if" and they used "or" "||"
// They wrote "String måned" without "innmåned"

package kontrollstruktur1;

//Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:
//Sommer : juni, juli, august
//Høst : september, oktober, november
//Vinter: desember, januar, februar,
//Vår : mars, april, mai,
//a) Lag først et program som løser det med if /else

import static javax.swing.JOptionPane. *;

public class KS1oppgave5 {

    public static void main(String[] args) {

        String måned= showInputDialog( "Skriv inn måneden (f.eks mars)");

if ( måned.equals("juni") || måned.equals("juli") || måned.equals("august")){
    showMessageDialog( null, "Det er sommer"); }

else if ( måned.equals("september") || måned.equals("oktober") || måned.equals("november")) {
    showMessageDialog( null, "Det er høst"); }

else if(måned.equals("desember") || måned.equals("januar") || måned.equals("februar")){
    showMessageDialog( null, "Det er vinter"); }

else if(måned.equals("mars") || måned.equals("april") || måned.equals("mai")){
    showMessageDialog( null, "Det er vår"); }

else{ showMessageDialog(null, "Det er ikke en gyldig måned!"); } }}

