//HERE THEY USED VARIABEL "ukedag" and function "ukedag.eguals" and løkke "if"
//THIS WAS VERY SIMPLE

package kontrollstruktur1;

public class Forelesning1 {
    public static void main(String [] args){
        String ukedag = "onsdag";

        if (ukedag.equals("mandag")) { System.out.print("Det er første dag i uken"); }
        if (ukedag.equals("tirsdag")) { System.out.print("Det er andre dag i uken"); }
        if (ukedag.equals( "onsdag")) { System.out.print("Det er tredje dag i uken"); }
        if (ukedag.equals( "torsdag")) { System.out.print("Det er fjerde dag i uken"); }
        if (ukedag.equals("fredag")) { System.out.print("Det er femte dag i uken"); }
        if (ukedag.equals("lørdag")  || ukedag.equals("søndag" )) { System.out.print("Det er helg! "); } } }
