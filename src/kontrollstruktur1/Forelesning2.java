//Løkke "switch" and classes "case" and "break" and "default"

package kontrollstruktur1;

public class Forelesning2 {
    public static void main(String [] args){
        String ukedag = "onsdag";
        switch (ukedag) {
            case "mandag":
                System.out.print("Det er første dag i uken");
                break;
            case "tirsdag":
                System.out.print("Det er andre dag i uken");
                break;
            case "onsdag":
                System.out.print("Det er tredje dag i uken");
                break;
            case "torsdag":
                System.out.print("Det er fjerde dag i uken");
                break;
            case "fredag":
                System.out.print("Det er femte dag i uken");
                break;
            case "lørdag":
            case "søndag":
                System.out.print("Det er helg!");
                break;
            default:
                System.out.print("Det er ikke en ukedag!");
                break; }}}
