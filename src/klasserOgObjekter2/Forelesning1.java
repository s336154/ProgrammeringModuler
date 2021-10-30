// we write "String"/"int"/"double" before attributen til "getVariable" and it is followed by "{return variabel;}"
//we write "void" before attributen til"setVaribel(String/double/int variabel){" followed by "this.variable=variabel;}"

package klasserOgObjekter2;
// Pass på å skille mellom objektene som du installisere ved å skrive; Objekt1, Objekt2, Objekt3 ..osv
// Pass på å endre nummeret i helle arket
 class Bil {
     public int tank;
     public double rekkevidde(double forbruk){
         double rekkevidde = tank/forbruk;
         return rekkevidde;
     }
 }
public class Forelesning1 {
     public static void main(String [] args) {
         Bil volvo = new Bil();
         volvo.tank = 80;
         double literPerMil = 0.8;
     //    double rekkevidde = volvo.rekkevidde(literPerMil);
         System.out.print("Rekkevidden til bilen er "+volvo.rekkevidde(literPerMil)+" mil");
     }

}
