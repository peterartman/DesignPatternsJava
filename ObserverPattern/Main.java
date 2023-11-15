package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);
        subject.attach(observer);

        subject.setState("New state");
    }
}
