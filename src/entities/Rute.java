package entities;

/**
 * @author Espen Norvang & Morten Sund
 */
public class Rute {
    private int nummer;
    private int mapping;

    public Rute(int nummer) {
        this.nummer = nummer;
        this.mapping = nummer;
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

    public boolean harStige(){
        return getMapping() > getNummer();
    }

    public boolean harSlange(){
        return getMapping() < getNummer();
    }
}
