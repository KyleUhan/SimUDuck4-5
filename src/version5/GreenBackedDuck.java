/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5;

/**
 *
 * @author Kyle
 */
public class GreenBackedDuck implements FlyAndQuackAndSwimGroup {

    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;
    private SwimStrategy swimStrategy;

    public GreenBackedDuck(FlyStrategy flyStrategy, QuackStrategy quackStrategy, SwimStrategy swimStrategy) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
        this.swimStrategy = swimStrategy;
    }

    @Override
    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    @Override
    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void setSwimStrategy(SwimStrategy swimStrategy) {
        this.swimStrategy = swimStrategy;
    }

    @Override
    public void performQuack() {
        quackStrategy.quack();
    }

    @Override
    public void performFly() {
        flyStrategy.fly();
    }

    @Override
    public void performSwim() {
        swimStrategy.swim();
    }

    @Override
    public void display() {
        System.out.println("I'm a Green Backed Duck");
    }

}
