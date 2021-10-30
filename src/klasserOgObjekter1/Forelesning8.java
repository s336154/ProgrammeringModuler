//This is way shorter than the last example!!

//Variabelen navn kan være uten attributer/parametere
//Variabelen navn kan være med parametere "String fornavn, String etternavn"
// når vi bruker parameterere eller parenteser så sluttes det med "return"
// når "void" brukes så følges det med "System.out.print()"
//NÅR vi skriver "static" then we dont have to instansiere et objekt senere !!


//Here we have not instasiert et objekt som "new Bil" !!
// Here we wrote static after "public ______ varibel()" !!
// THIS ONE WAS REALLLLLY SHOOOOOORT !!

package klasserOgObjekter1;

class Bil8 {
    public static double rekkevidde(double tank, double forbruk) {
        double rekkevidde = tank / forbruk ;
        return rekkevidde;
    }
}

public class Forelesning8 {
    public static void main(String [] args) {
     //   double rekkevidde = Bil8.rekkevidde(876.09,345.792);
      //  System.out.print("Rekkevidden til bilen er "+rekkevidde+" mil");

        System.out.print("Rekkevidden til bilen er "+Bil8.rekkevidde(876.09,345.792)+" mil");
    }
}
 //This is exactly like the previous one but much sj\horter!!