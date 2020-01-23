package entities;

public class Brett {
    private Rute[][] ruter;
    private int antallRuter;

    public Brett(){
        ruter = new Rute[10][10];
        antallRuter = 0;

        for(int i = 0; i < ruter.length; i++){
            if(i % 2 == 0){
                for (int j = 0; j < ruter[i].length; j++){ //Starter på rute #1 og går til rute #10
                    ruter[i][j] = new Rute(antallRuter++);
                }
            }else {
                for(int j = ruter[i].length-1; j >= 0; j--){
                    ruter[i][j] = new Rute(antallRuter++);
                }
            }

        }
    }

    public int getAntallRuter(){ //Kun for testing
        return antallRuter;
    }
}
