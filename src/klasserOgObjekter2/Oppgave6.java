package klasserOgObjekter2;
//Det skal lages en klasse kalt Vind.
// Denne klassen skal beregne ut i fra en oppgitt vindhastighet i km/t om det er stille (mindre enn 2 km/t)
// og om det er orkan (mer enn 120 km/t).
//Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).
// Formelen for Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i.
// Bruk gjerne Math.pow funksjonen for å foreta beregningen.
//Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.

import static javax.swing.JOptionPane. *;

class Vind{
    private double vindhastighet = 0.0 ;

    public Vind(double vindhastighet){
            this.vindhastighet = vindhastighet;
        }

        public double getvindhastighet(){
            return vindhastighet;
        } // defined here bcz it is private and is going to be used later

    /*public double getVindhastighet(){
        return vindhastighet;
    } */

    public boolean erOrkan() {
        if (vindhastighet > 120.0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean erStille() {
        if (vindhastighet < 2.0){
            return true;
        }
        else{
            return false;
        }
    }

    public double getknop() {
                double knop = vindhastighet / 1.852;
                return knop; }

            public int getBeaufort() {
                int beaufort = (int) (Math.pow(vindhastighet / 3.01, 0.6666) + 0.5); // 0,66 is the exponent here!
                if (beaufort > 12) { beaufort = 12; }
                return beaufort; } }


public class Oppgave6 {
                public static void main(String [] args){

                 //   String innVind = showInputDialog("Oppgi vindhastighet : ");
                    double vind = Double.parseDouble(showInputDialog("Oppgi vindhastighet : "));

                    Vind sjekkVind = new Vind(vind);

                    String ut = "vindhastigheten er "+sjekkVind.getvindhastighet()+" \n";
                    if (sjekkVind.erOrkan()){
                        ut+="Det er orkan!\n";
                    }
                    if(sjekkVind.erStille()){
                        ut+="Det er stille\n";
                    }

                    String knop = String.format("%.2f", sjekkVind.getknop());
                    ut += "Det er "+knop+" knop.\n";
                    ut += "Og det tilsvarer "+sjekkVind.getBeaufort()+" på beaufort-skalen";
                    showMessageDialog(null, ut); }
}


// THIS IM NOT SO FAMILIAR WITH!!