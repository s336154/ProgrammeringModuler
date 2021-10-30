package Eksam2019;

import java.util.Arrays;
    // Det står ikke eksplisitt i oppgaven at det ikke skal forekomme samme tall
// flere ganger, men i lotto er det ikke samme tall i en rekke
// Det trekkes ikke mye for ikke å sjekke om samme tall er i rekken

    class Trekning {
        public int[] vinnere(){
            int[] vinnere = new int[7];
            int i = 0;
            while (i < 7){
                // I oppgaven står det * 33 + 1.
                // Det er feil, men det godtas som fullgodt svar.
                int random = (int)(Math.random() * 34 + 1);
                // sjekk om random ligger i arrayet fra før
                boolean funnet = false;
                for (int j=0; j<7 ;j++){
                    if(vinnere[j]==random){
                        funnet = true;
                    }
                }
                if(!funnet){
                    vinnere[i]=random;
                    i++;
                }
            }
            Arrays.sort(vinnere);
            return vinnere;
        }
    }
    public class Oppgave2 {
        public static void main(String[] args){
            Trekning enTrekning = new Trekning();
            int[] vinnere = enTrekning.vinnere();
            System.out.print("Vinnerene er ");
            for(int v : vinnere){
                System.out.print(v+" ");
            }
        }
    }

