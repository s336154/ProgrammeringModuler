package klasserOgObjekter2;
// something went wrong here
// Pass på å skille mellom objektene som du installisere ved å skrive; Objekt1, Objekt2, Objekt3 ..osv
// Pass på å endre nummeret i helle arket
class Bil2 {
    public double rekkevidde( double forbruk, double tank ) {
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}

public class Forelesning2 {
    public static void main(String [] args) {
      Bil2 volvo = new Bil2();
      /*  double rekkevidde= volvo.rekkevidde (  80 , 0.8);

        System.out.print("Rekkevidden til bilen er "+rekkevidde+ "mil"); */
        System.out.print("Rekkevidden til bilen er "+volvo.rekkevidde(  80 , 0.8)+ "mil");
    }
}
