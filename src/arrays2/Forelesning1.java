package arrays2;

public class Forelesning1 {
    public static void main(String[] args) {
        int[][] tabell = new int[3][3];
        tabell[0][0] = 1;
        tabell[0][1] = 2;
        tabell[0][2] = 3;
        tabell[1][0] = 4;
        tabell[1][1] = 5;
        tabell[1][2] = 6;
        tabell[2][0] = 4;
        tabell[2][1] = 5;
        tabell[2][2] = 6;
        for (int i = 0; i < 3; i++) { // 3 is the index
            for (int j = 0; j < 3; j++) { // 3 is the index
                System.out.println(tabell[i][j]);
            }
        }
    }
}