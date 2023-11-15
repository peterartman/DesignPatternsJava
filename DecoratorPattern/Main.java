package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        ComponentBase component = new ConcreteComponentA();
        ComponentBase decoratedComponent = new ConcreteDecorator(component);

        decoratedComponent.operation();

        component = new ConcreteComponentB();
        decoratedComponent = new ConcreteDecorator(component);

        decoratedComponent.operation();
    }
}
