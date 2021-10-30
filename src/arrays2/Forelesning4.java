package arrays2;

import java.util.ArrayList ;
class Person4 {
    public String navn;
    public int alder;


    public static class Forelesning4 {
        public static void main(String[] args) {
            ArrayList<Person4> personer = new ArrayList<>();
            Person4 ole = new Person4();
            ole.navn = "Ole";
            ole.alder = 45;
            personer.add(ole);
            Person4 dedrick = new Person4();
            dedrick.navn = "Dedrick";
            dedrick.alder = 39;
            personer.add(dedrick);
            personer.remove(ole); // You could have just wrote the index here !!
            for (Person4 enPerson4 : personer)
                System.out.println(enPerson4.navn + " " + enPerson4.alder);
        }

    }
}


