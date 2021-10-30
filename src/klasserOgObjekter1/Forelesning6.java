
//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!

package klasserOgObjekter1;
class Bil6 {
    public int tank;
    public double rekkevidde(double forbruk) {
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}

public class Forelesning6 {
    public static void main(String [] args) {
        Bil6 toyota =new Bil6();
        toyota.tank = 66;
        double literPerMil = 0.467 ;
      //  double rekkevidde = toyota.rekkevidde(literPerMil);
        //System.out.print("Rekkevidden til bilen er "+rekkevidde+ " mil");
         System.out.print("Rekkevidden til bilen er "+toyota.rekkevidde(literPerMil)+ " mil");
    }
}
