package Eksam2020;
/*
    class Person{
        private String navn;
        private String personnummer;
        private int alder;
       // <Skriv en konstruktør for attributtene>
        public Person(String navn, String personnummer, int alder){
            this.navn=navn;
            this.alder=alder;
            this.personnummer=personnummer;}

      //  <Skriv en toString() metode>
        public String toString(){
            String ut =  "Navn: "+navn+"\n"+
                    "Personnummer: "+personnummer+"\n"+
                    "Alder: "+alder;
            return ut; } }

    class Pasient extends Person {
        private String diagnose;

       // <Skriv en konstruktør>
        public Pasient(String navn, String personnummer, int alder, String diagnose){
            super(navn,personnummer, alder);
            this.diagnose=diagnose;}


       // <Skriv en toString() metode>
       public String toString() {
           return super.toString() +
                   "Diagnose: "+diagnose;}
    }

    class Lege extends Person{

       // <Opprett et pasient-array med 100 plasser>
       Pasient [] liste = new Pasient[100];

        //<Opprett en konstruktør>
        public Lege(String navn, String personnummer, int alder, Pasient [] liste) {
            super(navn,personnummer, alder);
            this.liste=liste;}
        public String toString() {
            return super.toString()+"\n"+
                    "Pasient liste: "+liste;}

        //<Skriv en toString() metode>
    }

public class Oppgave2 {
        public static void main(String[] args) {
            Pasient [] liste = new Pasient[2];
            Pasient Ola = new Pasient("Ola Jensen", "22039023023", 30, "Hodepinne");
            Pasient Arne = new Pasient("Arne Aursand", "02078924245", 31, "Ondt i kneet");



            // <Opprett to pasienter med deres egne diagnoser>

            //<Opprett en lege>
            Lege enLege = new Lege("Henrik Olsen", "011270456789", 50,liste);
        

                System.out.println(enLege);

                //<Legg de to pasientene inn i legens pasient-array>
                // <Skriv ut alle dataene på System.out.print ved hjelp av lege-objektet>
            }
        }}

*/