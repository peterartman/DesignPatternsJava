package ObserverPattern;

class ConcreteSubject extends SubjectBase {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        state = newState;
        notifyObservers();
    }
}
