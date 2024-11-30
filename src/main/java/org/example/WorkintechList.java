package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {

    @Override
    public boolean add(Object o) {

        if(!this.contains(o)){
            return super.add(o);
        }

        return false;
    }

    public void sort(){
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean superReturned = super.remove(o);
        sort();
        return superReturned;
    }
}
