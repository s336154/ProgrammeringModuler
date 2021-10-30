package Arbeidskrav2;
import static javax.swing.JOptionPane.*;

// Oppgave 2 - Tallspill
//Det skal brukes javax.swing sine input- og meldings-bokser i denne oppgaven.
//Oppgaven er å lage et program for et tallspill.
//Programmet skal generere et tilfeldig helt tall (slumptall) mellom 0 og 200 (begge grensene inkludert).
// Spilleren skal prøve å gjette på dette tallet.
// For hver gjetning, som foretas ved at det vises en slik innlesningsboks:

class Tallspill {

    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding)
    { showMessageDialog(null, melding); }

    public void forLite(int tall) {
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        visMelding("Tallet: " + tall + " er for lavt. Gjett igjen");
    }

    public void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        visMelding("Tallet: " + tall + " er for høyt. Gjett igjen"); }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        showMessageDialog(null,"Du klarte det !\n" +
                "Riktig tall var " + gjetning + ". Du brukte " + antall + " forsøk. \n"); }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        int inputVerdi=0;
        int tall = nyttTall();
        int lavestTall = 0;
        int høyestTall = 200;
        int teller = 0; // "teller" = "antall" !!
        boolean spillKjører = true;

        while (spillKjører) {
            String input = showInputDialog(null,
                    "Gjett et tall mellom " + lavestTall + " og " + høyestTall);
            try {
                inputVerdi = Integer.parseInt(input);
                teller++; // this counts the number of failed attempts !!

                if (inputVerdi < tall) { forLite(inputVerdi); }
                else if (inputVerdi > tall) { forStort(inputVerdi); }
                else { avsluttRunde(teller, inputVerdi); spillKjører = false; }
            }

            catch (Exception e) {
                visMelding("Skriv inn et tall mellom " + lavestTall + " og " + høyestTall); } } }}

public class Oppgave2 {
    public static void main(String[] args) {
        Tallspill spill = new Tallspill();
        spill.kjørSpill(); }}
