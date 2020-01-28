package entities;

public class Terning {
    private final int STANDARD_TERNING = 6;
    private int antallOyne;

    public Terning(){
        this.antallOyne = STANDARD_TERNING;
    }

    //TODO
    //Lage kopp til terning?
    public Terning(int antallOyne){
        this.antallOyne = antallOyne;
    }

    public int trill(){
        return (int) Math.ceil(Math.random()*antallOyne);
//        this.antallOyne = (int) Math.ceil(Math.random()*antallOyne);
    }

    public int getAntallOyne(){
        return antallOyne;
    }


}
