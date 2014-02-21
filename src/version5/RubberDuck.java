package version5;

public class RubberDuck implements QuackGroup {

    private QuackStrategy quackStrategy;

    public RubberDuck(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void performQuack() {
        quackStrategy.quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

}
