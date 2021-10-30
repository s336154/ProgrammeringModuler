package variabler2;
// Slide 7 av 13 .. Input til program
import static javax.swing.JOptionPane. *;
public class Forelesning1 {
    public static void main(String [] args) {
        String innStreng1 = showInputDialog("Skriv inn ett helltall:");
        String innStreng2 = showInputDialog("Skriv inn ett heltall:");
        int innTall1 =Integer.parseInt(innStreng1);
        int innTall2 = Integer.parseInt(innStreng2);
        int sum = innTall1 + innTall2;
        String ut = "Summen av tallene "+innTall1+" og "+innTall2+" er "+sum;
        showMessageDialog(null, ut);
    }

}
