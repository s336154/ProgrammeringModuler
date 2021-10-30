package Arbeidkrav1;

 class Sirkel {
    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double diameter(double radius) {
        double diameter = radius * 2;
        return diameter; }
    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r
    public static double omkrets(double radius) {
        double omkrets = 2 * Math.PI * radius;
        return omkrets; }
    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI er en konstant for PI
       Math.pow brukes for å opphøye et tall i en potens, her: radius opphøyd i 2; radius^2.
       Kan også bare bruke radius * radius
     */
    public static double areal(double radius) {
        double areal = Math.PI * Math.pow(radius, 2);
        return areal; } }

public class Oppgave1 {
    public static void main(String[] args){
        double radius = 23.5;
        String areal = String.format("%.2f",Sirkel.areal(radius));
        String omkrets = String.format("%.2f",Sirkel.omkrets(radius));
        String diameter = String.format("%.2f",Sirkel.diameter(radius));
        System.out.println("Arealet av sirkelen med radius "+radius+" er "+areal);
        System.out.println("Omkretsen av sirkelen med radius "+radius+" er "+omkrets);
        System.out.println("Diameteren til sirkelen er med radius "+radius+" er "+diameter);
    }
}


