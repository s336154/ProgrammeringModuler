//Do you see "int[] tabell" & " for(int verdi : tabell) {}"

package arrays1;

public class Forelesning5 {
    public static void main(String [] args) {
        int [] tabell = {1,3,2,5,6};
        for(int verdi : tabell) {
            System.out.print(verdi+ " "); //instead of naming it as liste it has been named verdi!!
        }
    }
}
