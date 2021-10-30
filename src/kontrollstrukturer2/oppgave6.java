// where you set the curly parentheses has something to say about the result you get!! SO BE CAREFUL!!

package kontrollstrukturer2;
//Lag en while-løkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)

public class oppgave6 {
    public static void main(String [] args){
        int produkt = 0;
        int i = 0;
        while(i < 10)
        { produkt *= i; i++;}
            System.out.println("Summen av alle tallene mellom 0 og 9 er "+produkt );

    }
}
