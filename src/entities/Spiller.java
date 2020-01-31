package entities;

/**
 * @author Espen Norvang & Morten Sund
 */
public class Spiller {
    private String navn;
    private Brikke brikke;
    private boolean flyttetTilStart;


    /**
     * Lager en ny spiller..
     *
     * @param navn navn på spilleren
     */
    public Spiller(String navn) {
        this.navn = navn;
        this.flyttetTilStart = false;
    }

    public String getNavn() {
        return navn;
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
        int sum;
        do {
            sum = terning.trill();
            if (flyttetTilStart && sum != 6) {
                System.out.println("[" + navn.toUpperCase() + "] trillet " + sum + " | Må trille 6 for å flytte brikke.");
                break;
            }

            brikke.flytt(sum);
            System.out.println("[" + navn.toUpperCase() + "] trillet " + sum + " | FLYTT "
                    + (brikke.getRute().getNummer() - sum) + " -> " + brikke.getRute().getNummer());
            
            if (brikke.getRute().harSlange()) {
                int nyPos = brikke.getRute().getMapping();
                System.out.println("!!! TRAFF SLANGE !!! FLYTT " + brikke.getRute().getNummer() + " -> " + nyPos);
                brikke.flyttTilNyPosisjon(nyPos);
            }
            if (brikke.getRute().harStige()) {
                int nyPos = brikke.getRute().getMapping();
                System.out.println("!!! TRAFF STIGE !!! FLYTT " + brikke.getRute().getNummer() + " -> " + nyPos);
                brikke.flyttTilNyPosisjon(nyPos);
            }
            if (sum == 6) {
                System.out.println("***Du fikk 6, nytt kast!***");
                antallSeksere++;
                if (antallSeksere == 3) {
                    brikke.flyttTilNyPosisjon(1);
                    System.out.println("Tre seksere på rad - " + navn + " flyttes til start");
                    break;
                }

            }

        } while (sum == 6);
    }

}
