package entities;

public class Stigespill {

    private Brett brett;
    private Spiller[] spillere;
    private Terning terning;

    public Stigespill( int antallSpillere) {
        brett = new Brett(); //standard brett med 100 ruter
        spillere = new Spiller[antallSpillere];
        terning = new Terning(); //standard terning med 6 øyne
    }

}
