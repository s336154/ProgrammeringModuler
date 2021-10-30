package kontrollstrukturer2;
// summerer tallene 0-9; 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
public class Forelesning3 {
   public static void main(String [] args){
       int sum = 0;
       for (int i=0; i<10; i++)
       { sum +=i; }
       System.out.print(sum);
   }}
