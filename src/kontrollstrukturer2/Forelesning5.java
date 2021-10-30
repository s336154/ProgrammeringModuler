// multiplikasjon tabell for tallene fra og med 9

package kontrollstrukturer2;

public class Forelesning5 {
    public static void main(String[] args) {
        int produkt;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                produkt = i * j;
                System.out.println(i + "x" + j + "=" + produkt);
            }
        }
    }
}
