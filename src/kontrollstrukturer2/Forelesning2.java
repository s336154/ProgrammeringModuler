package kontrollstrukturer2;
// skriv partallene ved å øke tallene fra 0 med 2. dvs, "formel = i+2"
public class Forelesning2 {
    public static void main(String [] args) {
    //    for (int i = 0; i < 20; i += 2) {
        int teller = 0 ; //I modified this one
        while (teller < 10 ) {
           teller = teller + 2;
         //   teller += 2;
            System.out.print(teller+ " ");
//System.out.print(i+ " ");
        }
    }
}
