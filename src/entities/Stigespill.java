package entities;

public class Stigespill implements Runnable {

    private Brett brett;
    private Spiller[] spillere;
    private Terning terning;

    public Stigespill(int antallSpillere) {
        brett = new Brett();
        spillere = new Spiller[antallSpillere];
        terning = new Terning(); //standard terning med 6 øyne
    }

    @Override
    public void run() {
        while(spillere[0].getBrikke().getRute().getNummer() != 100){

                
        }
    }
}
