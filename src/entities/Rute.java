package entities;

/**
 * @author Espen Norvang & Morten Sund
 */
public class Rute {
    private int nummer;
    private int mapping;

    /**
     * Konstruktør for en standard rute
     * @param nummer nummeret på ruten
     */
    public Rute(int nummer) {
        this.nummer = nummer;
        this.mapping = nummer;
    }

    /**
     * Konstruktør for rute med mapping som viser hvilken rute en stige / slange er mappet mot
     * * @param nummer nummeret på denne ruten
     * @param mapping nummeret på ruten denne ruten er mappet til
     */
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

    /**
     * Sjekker om rute er starten på en stige
     * @return
     */
    public boolean harStige(){
        return getMapping() > getNummer();
    }

    /**
     * Sjekker om rute er starten på en slange
     * @return
     */
    public boolean harSlange(){
        return getMapping() < getNummer();
    }
}
