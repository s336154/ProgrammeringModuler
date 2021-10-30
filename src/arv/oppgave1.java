// from 27 to 73 is different

package arv;
//Lag en klasse Kjøretøy som er super-klassen til Bil og Motorsykkel.
// Motorsykkelklassen skal ha de samme attributtene som Bil-klassen i refererte oppgave (typebetegnelse, førstegangsregisterering og kjennetegn).
// Bil-klassen skal i dette tilfellet ha en ny attributt : lastekapasitet (i kg).
//Skriv om koden for "Register for Motorvogn" for å implementere det overstående.
// Husk å bruke polyformisme ved å opprette arrayet med typen "Kjøretøy".

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år; }

    private static String månedsnavn( int måned ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( måned > 0 && måned < 13 )
            return navn[ måned - 1 ];
        else
            return "ukjent måned"; }

    public String toString(){
        return dag+" "+månedsnavn(måned)+" "+år;
    }
}
class Kjøretøy{
    public String typeBetegnelse;
    public Dato førstegangsRegistert;
    public String kjennetegn;

    public Kjøretøy(String typeBetegnelse,Dato førstegangsRegistrert, String kjennetegn){
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistrert;
        this.kjennetegn = kjennetegn; } }

class Motorsykkel extends Kjøretøy{
    public Motorsykkel(String typeBetegnelse,Dato førstegangsRegistrert, String kjennetegn) { // nothing new to be added!!
        super(typeBetegnelse,førstegangsRegistrert,kjennetegn); }

    public String toString(){
        String ut = "Typebetegnelse : "+typeBetegnelse+"\n"+
                "Første gangs registreringsdato : "+førstegangsRegistert+"\n"+
                "Kjennetegn : "+kjennetegn;
        return ut; } }

class Bil extends Kjøretøy{
    public int lastekapasitet;

    public Bil(String typeBetegnelse,Dato førstegangsRegistrert, String kjennetegn,
               int lastekapasitet){
        super(typeBetegnelse,førstegangsRegistrert,kjennetegn);
        this.lastekapasitet = lastekapasitet; }
    public String toString(){
        String ut = "Typebetegnelse : "+typeBetegnelse+"\n"+
                "Første gangs registreringsdato : "+førstegangsRegistert+"\n"+
                "Kjennetegn : "+kjennetegn+"\n"+
                "Lastekapasitet : "+lastekapasitet+" kg";
        return ut; } }

public class oppgave1 {

    public static void main(String[] args) {
        Kjøretøy [] register = new Kjøretøy [100];

        Dato dato1 = new Dato(1,3,2015);

        Bil volvo = new Bil("Vovlo T5",dato1,"DP23456",450);

        Dato dato2 = new Dato(4,10,2016);

        Motorsykkel ducati = new Motorsykkel("Ducati",dato2,"DR4567");

        register[0]=volvo;
        register[1]=ducati;

        for (Kjøretøy etKjøretøy : register){
            if(etKjøretøy !=null){
                System.out.println(etKjøretøy);
                System.out.println("-----");
            }
        }
    }


}
