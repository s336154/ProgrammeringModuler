package Arbeidskrav2;
//Oppgave 1
//Lag et program som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
// Programmet skal starte med å lese inn nedre og øvre grense for summen.
// Dersom innlest øvre grense er mindre enn eller lik nedre grense,
// skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing.
// Når godkj
//
//   ente grenser er lest inn, skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum.
//Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
//Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10. tall i summen.

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {

        int nedreGrense = 0; // we wrting " = 0 " bcz
        int øvreGrense = 0;
        showMessageDialog(null,"Skriv inn to verdier: en nedre og en øvre, større enn nedre." );

        while (nedreGrense >= øvreGrense) {
            try{
              //  String nedreInnStreng = showInputDialog("Skriv inn nedre grense");
                nedreGrense = Integer.parseInt(showInputDialog("Skriv inn nedre grense"));

             //  String øvreInnStreng = showInputDialog("Skriv inn øvre grense\nStørre enn " + nedreGrense);
                øvreGrense = Integer.parseInt(showInputDialog("Skriv inn øvre grense\nStørre enn " + nedreGrense)); }

            catch (Exception e){
                showMessageDialog(null,
                        "Du må skrive inn to gyldige verdier, der øvre grense er større enn nedre grense"); } }

        int sum = 0;
        int teller=0;
        for (int i = nedreGrense; i < øvreGrense; i++) {

            if(teller == 10){
                System.out.print("\n"); // ny linje hvis det er 10 variabler i linjen
               teller=0; }

            teller++;
            sum += i;
            System.out.print(i + "+"); }

        sum += øvreGrense;
        System.out.print(øvreGrense+" =" + sum); }}
