package kontrollstrukturer2;
//Ref. forrige oppgave. Lag et program som finner de to største tallene av 10 heltall. En ekstra variabel må brukes.
import static javax.swing.JOptionPane.*;
public class AO5 {
        public static void main(String[] args) {

            int nummer;
            int størsteTall=0;
            int nestStørsteTall=0;

            for (int teller=0; teller<=10; teller++){
                nummer = Integer.parseInt(showInputDialog("Skriv inn et heltall nummer "+teller+":"));
                if(størsteTall < nummer){
                    nestStørsteTall = størsteTall;
                    størsteTall = nummer;
                }else if(nummer > nestStørsteTall){
                    nestStørsteTall = nummer;
                }
            }
            showMessageDialog(null, "Det største tallet er "+størsteTall+"\n"+
                    "Det nest største tallet er "+nestStørsteTall);
        }
    }
