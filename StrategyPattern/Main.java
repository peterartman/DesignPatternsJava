package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ConcreteStrategyA());
        client.callAlgorithm();

        client.strategy = new ConcreteStrategyB();
        client.callAlgorithm();

        client.strategy = new ConcreteStrategyC();
        client.callAlgorithm();
    }
}
