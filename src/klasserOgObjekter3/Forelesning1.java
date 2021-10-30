//THIS WAS VERY DIFFERENT NOW!!

package klasserOgObjekter3;
    class Bil{
        public String farge;

        @Override  // denne er strengt talt ikke nødvendig
        public String toString(){
            return "Fargen til bilen er "+this.farge;
        }
    }

public class Forelesning1 {
        public static void main(String[] args) {
            Bil bil1 = new Bil();
            bil1.farge = "rød";
            System.out.print(bil1);
        }
    }


