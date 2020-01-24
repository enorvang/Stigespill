package entities;

import java.util.HashMap;
import java.util.Map;

public class Brett {
    private int antallRuter;
    private Map<Integer, Rute> ruteKart;


    public Brett(int antall){
        ruteKart = new HashMap<>();
        for(int i = 0; i < antall; i++){
            int a = antallRuter++;
            ruteKart.put(a, new Rute(a));
        }
        //mapper ruter med slangehode
        ruteKart.put(99, new Rute(99, 54));
        ruteKart.put(70, new Rute(70, 55));
        ruteKart.put(52, new Rute(52, 42));
        ruteKart.put(25, new Rute(25, 2));
        ruteKart.put(95, new Rute(95, 72));

        //mapper ruter med start på stige
        ruteKart.put(6, new Rute(6, 25));
        ruteKart.put(11, new Rute(11, 40));
        ruteKart.put(60, new Rute(60, 85));
        ruteKart.put(46, new Rute(46, 90));
        ruteKart.put(17, new Rute(17, 69));
    }

    public int getAntallRuter(){ //Kun for testing
        return antallRuter;
    }

    public HashMap<Integer, Rute> getRuteKart(){
        return (HashMap<Integer, Rute>) this.ruteKart;
    }
}
