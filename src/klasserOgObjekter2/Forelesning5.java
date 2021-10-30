package klasserOgObjekter2;
class Person2{
    private int alder;
    public int getAlder() {
        return alder;
    }
    public void setAlder(int alder) {
        if(alder>0){
            this.alder = alder;
        }
    }
}

public class Forelesning5 {
    public static void main(String [] args){
        Person2 person1 = new Person2();
        person1.setAlder(23);
        System.out.print("Alderen er " +person1.getAlder()+ " år");
    }
}

// OBSERVE THIS ONE CAREFULLY!!