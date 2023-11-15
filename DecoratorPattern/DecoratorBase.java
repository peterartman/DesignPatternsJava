package DecoratorPattern;

abstract class DecoratorBase extends ComponentBase {
    private ComponentBase component;

    public DecoratorBase(ComponentBase component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
