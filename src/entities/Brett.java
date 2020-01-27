package entities;

import java.util.HashMap;
import java.util.Map;

public class Brett {
    private final int ANTALL_RUTER_STIGESPILL = 100;
    private Map<Integer, Rute> ruteKart;

    public Brett(){
        ruteKart = new HashMap<>();
        for(int i = 0; i < ANTALL_RUTER_STIGESPILL; i++){
            ruteKart.put(i+1, new Rute(i+1));
        }
    }

    public Brett(int antall){
        ruteKart = new HashMap<>();
        for(int i = 0; i < antall; i++){
            ruteKart.put(i+1, new Rute(i+1));
        }
    }

    public void leggTilSlangerOgStiger(){
        //mapper ruter med slangehode
        ruteKart.put(25, new Rute(25, 2));
        ruteKart.put(52, new Rute(52, 42));
        ruteKart.put(70, new Rute(70, 55));
        ruteKart.put(95, new Rute(95, 72));
        ruteKart.put(99, new Rute(99, 54));

        //mapper ruter med start på stige
        ruteKart.put(6, new Rute(6, 25));
        ruteKart.put(11, new Rute(11, 40));
        ruteKart.put(17, new Rute(17, 69));
        ruteKart.put(46, new Rute(46, 90));
        ruteKart.put(60, new Rute(60, 85));
    }

    public Map<Integer, Rute> getRuteKart(){
        return this.ruteKart;
    }
}
