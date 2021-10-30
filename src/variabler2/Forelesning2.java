package variabler2;
//Her vises det et regnestykke med divisjon funksjon .. i det forrige var det addisjon
// slide 8 av 13
import static javax.swing.JOptionPane. *;

public class Forelesning2 {
    public static void main(String [] args) {
        String innStreng1 = showInputDialog("Skriv inn et desimaltall:");
        String innStreng2 = showInputDialog("Skriv inn et desimaltall til");
        double innTall1 = Double.parseDouble(innStreng1);
        double innTall2 = Double.parseDouble(innStreng2);
        double divisjon = innTall1/innTall2;
        String ut = "Divisjonen til "+innTall1+" og "+innTall2+" blir "+divisjon;
        showMessageDialog(null, ut);
        }

    }

