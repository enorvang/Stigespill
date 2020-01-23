package entities;

public class Spiller {
    private String navn;
    private Brikke brikke;

    public Spiller(String navn){
        this.navn = navn;
    }

    private void setBrikke(Brikke brikke){
        this.brikke = brikke;
    }

    public Brikke getBrikke(){
        return brikke;
    }
}
