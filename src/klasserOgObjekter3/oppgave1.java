package klasserOgObjekter3;


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
        }}

    class Bil11{
        public String typeBetegnelse;
        public Dato førstegangsRegistert;
        public String kjennetegn;

        public Bil11(String typeBetegnelse,Dato førstegangsRegistrert, String kjennetegn){
            this.typeBetegnelse = typeBetegnelse;
            this.førstegangsRegistert = førstegangsRegistrert;
            this.kjennetegn = kjennetegn; }

        public String toString(){
            String ut = "Typebetegnelse : "+typeBetegnelse+"\n"+
                    "Første gangs registreringsdato : "+førstegangsRegistert+"\n"+
                    "Kjennetegn : "+kjennetegn;
            return ut; }}


public class oppgave1 {

        public static void main(String[] args) {
            Bil11 [] register = new Bil11 [100];

            Dato dato1 = new Dato(1,3,2015);

            Bil11 volvo = new Bil11("Vovlo T5",dato1,"DP23456");

            Dato dato2 = new Dato(4,10,2016);

            Bil11 audi = new Bil11("Audi R8",dato2,"DR45678");

            register[0]=volvo;
            register[1]=audi;

            for (Bil11 enBil11 : register){
                if(enBil11 != null){
                    System.out.println(enBil11);
                    System.out.println("-----"); }}}}

