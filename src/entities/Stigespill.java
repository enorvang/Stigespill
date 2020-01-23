package entities;

public class Stigespill {
    private Brett brett;
    private Spiller[] spillere;
    private Terning terning;

    public Stigespill(int antallSpillere){
        brett = new Brett();
        spillere = new Spiller[antallSpillere];
        terning = new Terning();
    }
}
