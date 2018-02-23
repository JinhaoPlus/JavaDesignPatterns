package top.jinhaoplus.Chap17_Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();

    public void addObersver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObersver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
