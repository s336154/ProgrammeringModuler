package Arbeidskrav4;
//Oppgave 2
//Klasser,  objekter og arrays.

// (1) Lag en klasse kalt «SjekkArray». Denne skal ha en statisk metode som heter «summer».
// Denne metoden tar to heltall og et heltalls-array som innparametere og returnerer et heltall med summen.
// Lag kode for å summere arryet fra posisjonen fra og med første parameter til og med posisjonen oppgitt som andre parameter.

// (2) Lag en ny statisk metode i klassen kalt «arrayLike».
// Denne metoden skal ta to heltall-arrays inn og sjekke om de er like (et og et element er likt).
// Dersom de er det (og like lange) så returnerer metoden «true», ellers «false».
// Lag kode for å sjekke to arrays med denne metoden i main-metoden.

// (3) Lag så en ny statisk metode kalt «arrayEksisterer» som skal finne ut av om det finnes et tall i et oppgitt array.
// Metoden skal ha et array inn og så et heltall som man skal sjekke om ligger i arrayet.
// Metoden skal returnere «true» eller «false» avhengig av om tallet finnes eller ikke.
// Lag kode for å sjekke om et tall eksisterer med denne metoden i main-metoden

class SjekkArray{
    // 1)
    public static int summer (int tall1, int tall2, int[] liste){
        int sum = 0;
        if(tall1 > 0 && tall2 < liste.length){
            for (int i = tall1; i <= tall2; i++) //notice that we always use this "for-løkke" when typing "liste[i]" later !!
            { sum += liste[i]; } }
        return sum; }

    // 2)
    public static boolean arrayLike(int [] liste1, int[] liste2){
        if (liste1.length != liste2.length) // de er like lange !
        { return false; }
        for (int i = 0; i < liste1.length; i++) //notice that we always use this "for-løkke" when typing "liste[i]" later !!
        { if (liste1[i] != liste2[i]) // et og et element er likt!
            { return false; } }
        return true; }
    // 3)
    public static boolean arrayEksisterer(int [] liste, int tall){
        for(int i : liste)
        { if(i == tall)
        { return true; } }
        return false; }
}

public class Oppgave2 {

    public static void main(String[] args) {
        int [] liste =  {2,4,6,12,78,45,3,42,5,-7};
        // 1)
        int tall1 = 2;
        int tall2 = 4;
        int sum = SjekkArray.summer(tall1, tall2, liste);
        System.out.println("Summen av listen fra "+tall1+" til "+tall2+" er "+sum);
        // 2)
        int [] liste2 =  {2,4,6,12,78,45,3,42,5,-8};
        if (SjekkArray.arrayLike(liste, liste2)){
            System.out.println("Arrayene er like");
        }
        else{
            System.out.println("Arrayene er ikke like!");
        }
        // 3)
        if(SjekkArray.arrayEksisterer(liste, tall1)){
            System.out.println("Tallet "+tall1+" eksisterer i arrayet");
        }
        else{
            System.out.println("Tallet "+tall1+" eksisterer IKKE i arrayet");
        }
    }
}
