package entities;

public class Stigespill {

    private Brett brett;
    private Spiller[] spillere;
    private Terning terning;

    public Stigespill(int antallSpillere) {
        brett = new Brett(antallSpillere);
        spillere = new Spiller[antallSpillere];
        terning = new Terning(); //standard terning med 6 øyne
    }

}
