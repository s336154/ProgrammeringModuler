package arrays2;

public class Forelesning2 {
    public static void main(String [] args){
        int [][] tabell1 ={{1,2,3},{2,4,6},{4,8,12}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(tabell1[i][j]+" ");
            }
        System.out.println();
        }
        for(int [] liste : tabell1){
            for (int tall : liste){
                System.out.print(tall+"\n");
            }
        System.out.print("\n");
        }

    }

}

