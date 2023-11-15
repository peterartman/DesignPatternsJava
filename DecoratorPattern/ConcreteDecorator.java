package DecoratorPattern;

class ConcreteDecorator extends DecoratorBase {
    public ConcreteDecorator(ComponentBase component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("(modified)");
    }
}
