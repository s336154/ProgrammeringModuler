package arrays2;
//OPPGAVE5
//Det er definert et to-dimensjonalt helttalls-array (se under). Hver rad tilsvarer en filmanmelders "score" av 4 filmer (kolonner).
//  4	6	2	5
//  7	9	4	8
//  6	9	3	7
// Lag et program som beregner gjennomsnittlig "score" for de 4 forskjellige filmene og skriver ut resultatet.

//OPPGAVE6
//Utvid oppgave 6 til også å lese inn matrisen (det to-dimensjonale arrayet) fra brukeren.
//Først skal man kunne lese inn antall anmeldere (rader) og antall filmer (kolonner).
//Så skal arrayet defineres og man skal lese inn "scores".
//Bruk gjerne try/catch for å sikre at man leser inn korrekte tall. Sjekk også om tallene er mellom 0 og 9.


import static javax.swing.JOptionPane.*;

/*
Det er definert et to-dimensjonalt helttalls-array
Hver rad tilsvarer en filmanmelders "score" av 5 filmer (kolonner).

..lese inn matrisen (det to-dimensjonale arrayet) fra brukeren.
Først skal man kunne lese inn antall anmeldere (rader) og antall filmer (kolonner).
Så skal arrayet defineres og man skal lese inn "scores".

Lag et program som beregner gjennomsnittlig "score" for de 5 forskjellige filmene og
skriver ut resultatet.

Bruk gjerne try/catch for å sikre at man leser inn korrekte tall.
Sjekk også om tallene er mellom 0 og 9.
*/

public class Oppgave5_6 {
    public static void main(String[] args) {

        // merk : i besvarelsen starter anmelder og filmer med index 0
        // dette er gjort for ikke å introdusere med kompleksitet enn nødvendig.

        int antallAnmeldere, antallFilmer;
        String innAnmeldere = showInputDialog("Hvor mange anmeldere?");
        try{
            antallAnmeldere = Integer.parseInt(innAnmeldere);
        }
        catch(Exception e){
            antallAnmeldere = 0;
        }
        String innFilmer = showInputDialog("Hvor mange filmer?");
        try{
            antallFilmer = Integer.parseInt(innFilmer);
        }
        catch(Exception e){
            antallFilmer = 0;
        }
        if (antallFilmer==0 || antallAnmeldere == 0){
            showMessageDialog(null, "Programmet stoppes, ikke angitt korrekt informasjon");
        }
        else{
            // lag arrayet
            int [] [] tabell = new int [antallAnmeldere] [antallFilmer];
            // les inn verdiene via dobbelt forløkke
            int score;
            String innScore;

            for (int i = 0; i < antallAnmeldere; i++){
                for (int j = 0; j < antallFilmer; j++){
                    innScore = showInputDialog("Skriv inn score for anmelder "+i+" og film "+j+" (0-9)");
                    try{
                        score = Integer.parseInt(innScore);
                        if (score >= 0 && score <=9)
                        { tabell[i][j]=score; } }

                    catch(Exception e)
                    { showMessageDialog(null,"Ikke gyldig input, ignorert dette"); } } }

            // skriver ut for å sjekke
            String ut = "";
            for (int i = 0; i < antallAnmeldere; i++){
                ut+="Anmelder "+i+" : ";
                for (int j = 0; j < antallFilmer; j++)
                { ut+= tabell[i][j]+" "; }
                ut+="\n"; }
            System.out.println(ut);

            // gennomsnitt for filmene:
            double snitt;
            ut = "Gjennomsnittet er : \n";
            for (int i = 0; i < antallFilmer; i++){
                snitt = 0;
                for (int j = 0; j < antallAnmeldere; j++){
                    snitt += tabell[j][i];
                }
                snitt = snitt / antallAnmeldere;
                ut+="Film "+ i +" : "+snitt+"\n";
            }
            showMessageDialog(null, ut);
        }
    }
}
