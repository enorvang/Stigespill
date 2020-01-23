package entities;

public class Brett {
    private Rute[][] ruter;

    public Brett(){
        ruter = new Rute[10][10];
        for(int i = 0; i < ruter.length; i++){
            for (int j = 1; j <= ruter[i].length; j++){ //Starter på rute #1 og går til rute #10
                ruter[i][j] = new Rute(j);
            }
        }
    }
}
