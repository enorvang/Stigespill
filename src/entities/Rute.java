package entities;

public class Rute {
    private int nummer;
    private int mapping;

    public Rute(int nummer) {
        this.nummer = nummer;
        mapping = nummer;
    }

    public Rute(int nummer, int mapping) {
        this.nummer = nummer;
        this.mapping = mapping;
    }

    public int getNummer() {
        return this.nummer;
    }

    public int getMapping() {
        return this.mapping;
    }


}
