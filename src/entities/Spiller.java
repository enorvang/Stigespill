package entities;

/**
 * @author Espen Norvang
 */
public class Spiller {
    private String navn;
    private Brikke brikke;


    /**
     * Lager en ny spiller..
     *
     * @param navn navn på spilleren
     */
    public Spiller(String navn) {
        this.navn = navn;
    }

    public void setBrikke(Brikke brikke) {
        this.brikke = brikke;
    }

    public Brikke getBrikke() {
        return brikke;
    }


    /**
     * Spiller et trekk for spilleren
     *
     * @param terning objekt som bestemmer hvor langt spillerens brikke skal flyttes
     */
    public void spillTrekk(Terning terning) {
        int antallSeksere = 0;
        Integer sum = 0;

        do {
            sum = terning.trill();
            brikke.flytt(sum);
            System.out.println(navn + " trillet " + sum + " flyttet til " + brikke.getRute().getNummer());
            if (sum == 6) {
                System.out.println("***Du fikk 6, nytt kast!***");
                antallSeksere++;
                if (antallSeksere == 3) {
                    brikke.flyttTilStart();
                    System.out.println("Tre seksere på rad - " + navn + "flyttes til 1");
                    break;
                }

            }

        } while (sum == 6);
    }

}
