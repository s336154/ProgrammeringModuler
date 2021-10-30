//Here there was a problem yu have to fix!!
// I just needed to add "" here as well!!

package klasserOgObjekter2;
// nødvendige import-setning(er)
import static javax.swing.JOptionPane. *;
 class Konto {

    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
    private String navn;
    private String kontonummer;
    private double saldo;
    //  Kontruktør som skal gi startverdier til ALLE attributtene
     public Konto(String navn, String kontonummer, double saldo){
         this.navn= navn;
         this.kontonummer= kontonummer;
         this.saldo= saldo; }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
     public void utskrift(){
         String ut = "Kontonavn : "+navn+" \n Kontonummer : "+kontonummer+" \n Saldo : "+String.format("%.2f", saldo)+ " kr";
         showMessageDialog(null, ut); } //we write string.format when we dont define the variable as double!

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */
     public String settInn(double beløp){
         saldo += beløp;
         return "Den nye saldoen er "+String.format("%.2f", saldo);} //we write string.format when we dont define the variable as double!

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */
     public String taUt( double beløp){
         String ut = " "; // here i have definert varible her fordi samme varibel skal brukes igjen og igjen senere

         if(beløp <= saldo ){
             saldo = saldo - beløp;
             ut = "Den nye saldoen er : "+String.format("%.2f", saldo);} //we write string.format when we dont define the variable as double!
         else{ ut= "Ikke dekning på konto!"; }
         return ut; }} // end of class Konto

public class Oppgave5 {
     public static void main(String [] args){

        String kontonavn = showInputDialog("Angi kontonavn");
         String kontonr = showInputDialog("Angi kontonummer");
         double saldo = Double.parseDouble(showInputDialog("Angi saldo:"));

         Konto sparekonto = new Konto(kontonavn,kontonr,saldo); // variabelene ble definert først!!
     //    Konto sparekonto = new Konto("Sari Ali","12345678",234567);

         System.out.println(sparekonto.settInn(2000));
         System.out.println(sparekonto.taUt(10));
         System.out.println(sparekonto.settInn(2000));
         sparekonto.utskrift(); }} // vi må oprete et objekt slik at vi får brukt denne varibelen med void
