package entities;

public class Brikke {
    private String farge;
    private Rute rute;

    public Brikke(String farge, Rute rute) {
        this.farge = farge;
        this.rute = rute;
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


}
