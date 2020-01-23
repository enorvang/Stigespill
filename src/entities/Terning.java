package entities;

public class Terning {
    private int antallOyne;

    public Terning(int antallOyne){
        this.antallOyne = antallOyne;
    }

    public int trill(){
        return (int) Math.floor(Math.random()*antallOyne);
    }

}
