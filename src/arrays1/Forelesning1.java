package arrays1;

public class Forelesning1 {
    public static void main(String [] args){
        int [] tabell = {1,3,2,5,6};
        int sum=0;

        for(int i=0; i<tabell.length; i++) {
            sum += tabell[i];} // REMEMBER TO CLOSE THE BRACKETS AFTER FOR-LØKKER!
            System.out.print(sum);
        }
    }

