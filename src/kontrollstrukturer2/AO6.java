package kontrollstrukturer2;
public class AO6 {
    public static void main(String[] args) {
        String ut = "N\tN^2\tN^3\tN^4\n";
        for (int i = 1;i <= 10; i++){
            ut+=i+"\t"+Math.pow(i, 2)+"\t"+Math.pow(i, 3)+"\t"+Math.pow(i, 4)+"\t\n";
        }
        System.out.println(ut);
    }
}

