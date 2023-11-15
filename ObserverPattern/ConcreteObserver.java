package ObserverPattern;

class ConcreteObserver extends ObserverBase {
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    public void update() {
        String subjectState = subject.getState();
        System.out.println(subjectState);
    }
}
