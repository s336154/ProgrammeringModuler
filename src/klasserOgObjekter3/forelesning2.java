package klasserOgObjekter3;


    class Bil2{
        public String farge;
        public static int antallHjul = 4;
    }

public class forelesning2 {
        public static void main(String[] args) {
            Bil2 volvo = new Bil2();
            volvo.farge = "Rød";
            volvo.antallHjul=5;
            System.out.println("Fargen :" + volvo.farge);
            System.out.println("Antall hjul :" + volvo.antallHjul);
        }
    }



