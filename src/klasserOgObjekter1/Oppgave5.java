//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"

//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!

package klasserOgObjekter1;
//Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
// Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.
//Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.

class Kalkulator{

    public static double addere(double tall1, double tall2){
      double sum = tall1 + tall2;
        return sum; }

    public static double subtraktere(double tall1, double tall2){
       double subtraksjon = tall1 - tall2;
        return subtraksjon; }

    public static double multiplisere(double tall1, double tall2){
       double multiplikasjon = tall1 * tall2;
        return multiplikasjon; }

    public static double dividere(double tall1, double tall2){
        double divisjon = tall1/tall2;
        return divisjon; }}

public class Oppgave5 {
    public static void main(String [] args){
System.out.println(" 2+2 = "+Kalkulator.addere(2,2));
        System.out.println(" 2-2 = "+Kalkulator.subtraktere(2,2));
        System.out.println(" 2*2 = "+Kalkulator.multiplisere(2,2));
        System.out.println(" 2/2 = "+Kalkulator.dividere(2,2)); }}

//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!