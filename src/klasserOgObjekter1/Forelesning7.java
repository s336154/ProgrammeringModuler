//This looks more practical!!
//WAAAAAY shorter

//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!

package klasserOgObjekter1;

class Bil7 {
    public double rekkevidde(double tank, double forbruk) {
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}
public class Forelesning7 {
    public static void main(String [] args) {
        Bil7 BMW =  new Bil7();

        //  double rekkevidde = BMW.rekkevidde(66.907 , 71.23);
      //  System.out.print("Rekkevidden til bilen er "+rekkevidde+" mil");

        System.out.print("Rekkevidden til bilen er "+BMW.rekkevidde(66.907 , 71.23)+" mil");
    }
}
