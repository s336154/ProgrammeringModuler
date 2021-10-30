package klasserOgObjekter2;

//HERE we didnt need to write "return" as we wrote instead "this.variabel" !!
// Pass på å skille mellom objektene som du installisere ved å skrive; Objekt1, Objekt2, Objekt3 ..osv
// Pass på å endre nummeret i helle arket
class Person {
    public String navn;
    public int fødselsår;

    public Person (String navn, int fødselsår){
        this.navn = navn;
        this.fødselsår = fødselsår;
    }
        }

public class Forelesning4 {
    public static void main(String [] args){
        Person person1 = new Person("Line Jensen", 1999);
        System.out.print(person1.navn+ " er født i " +person1.fødselsår);
    }
}
