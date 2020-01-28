package entities;

public class Brikke {
    private String farge;
    private Rute rute;
    private Brett brett;

    public Brikke(String farge, Rute rute, Brett brett) {
        this.farge = farge;
        this.rute = rute;
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
    public void flytt(Integer sum){
        Rute nyRute = brett.finnNyRute(getRute(), sum);
        setRute(nyRute);
    }
}
