//Do you see "int[] tabell" & " for(int verdi : tabell) {}"

package arrays1;

public class Forelesning6 {
    public static void main(String [] args) {
        String[] tabell = {"Per", "Ole", "Line"};
        for (String verdi : tabell) {
            System.out.println(verdi); //instead of naming it as liste it has been named verdi!!
        }
    }
}

