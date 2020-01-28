package entities;

/**
 * @author Espen Norvang
 */
public class Spiller {
    private String navn;
    private Brikke brikke;

    /**
     * Lager en ny spiller..
     * @param navn navn på spilleren
     */
    public Spiller(String navn) {
        this.navn = navn;
    }

    private void setBrikke(Brikke brikke) {
        this.brikke = brikke;
    }

    public Brikke getBrikke() {
        return brikke;
    }


    /**
     * Spiller et trekk for spilleren
     * @param terning objekt som bestemmer hvor langt spillerens brikke skal flyttes
     */
    public void spillTrekk(Terning terning) {
        Integer sum = terning.trill();
        brikke.flytt(sum);
    }
}
