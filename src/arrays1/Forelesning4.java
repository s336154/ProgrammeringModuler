//Do you see "int[] liste4" & " for(int verdi : liste4) {}"

package arrays1;

public class Forelesning4 {
    public static void main(String[] args) {
        int[] liste4 = new int[5];
        liste4[0] = 1;
        liste4[1] = 3;
        liste4[2] = 2;
        liste4[3] = 5;
        liste4[4] = 6;
        for (int verdi : liste4) {
            System.out.print(verdi + " ");
        }
    }
}