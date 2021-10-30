//Something went wrong here!!
//I fixed it with "" around %.2f

package klasserOgObjekter2;

//Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:
//Bensinstasjonens sted (en streng)
//Type bensin (en streng)
//Antall liter fylt (et desimaltall)
//Prisen pr. liter (et desimaltall)
//Tidspunkt fylt (en streng)
//Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
// Lag så en metode finnTotalPrisen. Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall.
// Metoden skal da multiplisere antall liter fylt med prisen pr. liter.
//Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
import static java.util.Formatter.*;
class BensinKjøp{
    private String sted;
    private String type;
    private double antallLiter;
    private double prisPerLiter;
    private  String tidspunkt;

    public BensinKjøp(String sted, String type, double antallLiter, double prisPerLiter, String tidspunkt){
        this.sted= sted;
        this.type= type;
        this.antallLiter= antallLiter;
        this.prisPerLiter= prisPerLiter;
        this.tidspunkt= tidspunkt; }

    public String getSted() {
        return sted;
    }
    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getAntallLiter() {
        return antallLiter;
    }
    public void setAntallLiter(double antallLiter) {
        this.antallLiter = antallLiter;
    }

    public double getPrisPerLiter() {
        return prisPerLiter;
    }
    public void setPrisPerLiter(double prisPerLiter) {
        this.prisPerLiter = prisPerLiter;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }
    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public  double finnTotalPrisen(){
        return antallLiter * prisPerLiter;
    }
}
public class Oppgave3 {
    public static void main(String [] main){
        BensinKjøp etKjøp = new BensinKjøp("Asker","95",49,26.50,"10:30");

      /*  double pris = etKjøp.finnTotalPrisen();
        String prisToDesimaler= String.format("%.2f", pris); */

       String prisToDesimaler=  String.format("%.2f", etKjøp.finnTotalPrisen());
        String ut = "Det kostet totalt "+prisToDesimaler+" kroner i "+etKjøp.getSted()+
                " kl "+etKjøp.getTidspunkt();  //bcz it is private values we are writing getVariable
        System.out.print(ut); } }

// I REACHED HERE ON 09.11.20