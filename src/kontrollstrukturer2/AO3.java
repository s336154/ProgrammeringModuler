//THIS WAS RIGHT!!

package kontrollstrukturer2;
//Lag et program som beregner skatten til tre personer. Skatten er 30 % frem til 500.000 kr og 50 % over.
// Les inn navn og inntekt på de 3 personene og vis den samme informasjonen med hvor mye skatt de kan forvente seg.
import static javax.swing.JOptionPane.*;

public class
AO3 {
    public static void main(String[] args) {
        String innInntekt; //im defining it here
        double inntekt;
        double skatt;
      String ut = ""; // im defining it here
        for (int i = 1;i < 4; i++){
            innInntekt=showInputDialog("Skriv inn inntekten til personen");
            inntekt = Double.parseDouble(innInntekt);
            if(inntekt > 500_000){
                skatt = (inntekt-500_000)*0.5;
                skatt += 500_000 * 0.3;
            }
            else{
                skatt = inntekt * 0.3;
            }
         ut += "Inntekt på "+innInntekt+" kr gir skatt på "+skatt+" kr\n";
        }
        showMessageDialog(null, ut);
    }}

