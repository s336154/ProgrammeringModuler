package kontrollstrukturer2;
//Lag en primtallsgenerator. Det vil si liste ut alle primtall fra 0 og opp til et valgt tall.
// Et primtall er et tall som bare er delelig med 1 og seg selv.

public class VO2 {

        public static void main(String[] args) {

            int n = 100;
            int i = 1;
            while(i <= n) {
                int c=0;
                for(int j=1;j<=i;j++) {
                    if( i % j == 0) {
                        c++; // øk teller; delelig med
                    } }
                if(c==2) { System.out.println(""+i); }
                i++; } }}

//I couldnt understand this one!!