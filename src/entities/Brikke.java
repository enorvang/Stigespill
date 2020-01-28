package entities;

/**
 * @author Espen Norvang
 */
public class Brikke {
    private String farge;
    private Rute rute;
    private Brett brett;

    /**
     * Konstruktør for en brikke.
     * @param farge identifiserer brikken
     * @param rute den ruten brikken står på
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
     * @param sum
     */
    public void flytt(Integer terningkast){
        Rute nyRute = brett.finnNyRute(getRute(), terningkast);
        setRute(nyRute);
    }
}
