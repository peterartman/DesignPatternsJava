package ObserverPattern;

import java.util.ArrayList;

abstract class SubjectBase {
    private ArrayList<ObserverBase> observers = new ArrayList<>();

    public void attach(ObserverBase o) {
        observers.add(o);
    }

    public void detach(ObserverBase o) {
        observers.remove(o);
    }

    public void notifyObservers() { 
        for (ObserverBase o : observers) {
            o.update();
        }
    }
}
