package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class StateTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
