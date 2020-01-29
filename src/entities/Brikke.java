package entities;

/**
 * @author Espen Norvang & Morten Sund
 */
public class Brikke {
    private String farge;
    private Rute rute;
    private Brett brett;

    /**
     * Konstruktør for en brikke.
     *
     * @param farge identifiserer brikken
     *
     * @param brett brettet brikken tilhører
     */
    public Brikke(String farge, Brett brett) {
        this.farge = farge;
        this.rute = brett.getRuteKart().get(1);
        this.brett = brett;
    }

    public Rute getRute() {
        return rute;
    }

    public void setRute(Rute rute) {
        this.rute = rute;
    }

    public String getFarge() {
        return this.farge;
    }

    /**
     * Flytter brikken et gitt antall ruter.
     *
     * @param terningkast
     */
    public void flytt(Integer terningkast) {
        if (rute.getNummer() + terningkast <= 100) {
            Rute nyRute = brett.finnNyRute(getRute(), terningkast);
            setRute(nyRute);
        }
    }

    /**
     * Flytter brikken direkte til start
     */
    public void flyttTilStart() {
        Rute nyRute = brett.getRuteKart().get(1);
        setRute(nyRute);
    }

    /**
     * Flytter brikken til ny posisjon
     * @param pos den nye posisjonen det skal flyttes til
     */
    public void flyttTilNyPosisjon(int pos){
        Rute nyRute = brett.getRuteKart().get(pos);
        setRute(nyRute);
    }
}
