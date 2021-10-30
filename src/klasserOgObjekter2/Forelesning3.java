package klasserOgObjekter2;
// Pass på å skille mellom objektene som du installisere ved å skrive; Objekt1, Objekt2, Objekt3 ..osv
// Pass på å endre nummeret i helle arket
 class Bil3 {
    public static double rekkevidde(double tank, double forbruk) {
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
   void skrivut(){
      //  double rekkevidde = Bil3.rekkevidde(80, 0.8);
        System.out.print("Rekkevidden til bilen er "+Bil3.rekkevidde(80, 0.8)+" mil"); }}

public class Forelesning3 {
    public static void main(String[] args) {
        Bil3 toyota = new Bil3();
        toyota.skrivut();


    /* double rekkevidde = Bil3.rekkevidde(80, 0.8);
     System.out.print("Rekkevidden til bilen er "+rekkevidde+" mil"); */
    }
}
