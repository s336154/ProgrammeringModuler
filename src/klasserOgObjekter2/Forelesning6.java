package klasserOgObjekter2;
// They got differenet age in the forelesning!!
//This was way longer than the last one !!
class Person3 {
    private int alder;

   /*  public Person3(int alder) {
        if (alder > 0) {
            this.alder = alder;
        }
    } */

    public int getAlder() {
        return alder;
    }
    public void setAlder(int alder) {
        if (alder > 0) {
            this.alder = alder; } }}

    public class Forelesning6 {
    public static void main(String [] args){
        Person3 person1 = new Person3() ;
        person1.setAlder(26);
        System.out.print("Alderen er " +person1.getAlder()+" år"); }}