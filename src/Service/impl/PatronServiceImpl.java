package Service.impl;

import Models.Patron;
import Service.PatronService;

import java.util.HashMap;
import java.util.Map;

public class PatronServiceImpl implements PatronService {

    Map<String,Patron> mp = new HashMap<>();

    @Override
    public void addPatron(Patron patron) {
        if(!mp.containsKey(patron.getPatronId())){
            mp.put(patron.getPatronId(),patron);
        }else {
            System.out.println("Patron with same details exists");
        }
    }

    @Override
    public void updatePatron(Patron patron) {
            mp.put(patron.getPatronId(),patron);
    }

    @Override
    public Patron getPatron(String id) {
        return mp.get(id);
    }
}
