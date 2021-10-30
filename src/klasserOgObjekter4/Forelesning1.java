package klasserOgObjekter4;
class Bil{
    public String type;
    public Bil(String type){
        this.type=type;
    }
}

public class Forelesning1 {
    public static void byttType(Bil enBil){
        enBil.type="Audi";
        Bil BMW=new Bil("BMW");
        enBil=BMW;
    }
   public static void main(String [] args){
        Bil volvo = new Bil("Volvo");
        byttType(volvo);
        System.out.println(volvo.type);
   }
}
