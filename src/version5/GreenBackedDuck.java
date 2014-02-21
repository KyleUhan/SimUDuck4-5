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
public class GreenBackedDuck implements FlyAndQuackGroup {

    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;

    public GreenBackedDuck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
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
    public void performQuack() {
        quackStrategy.quack();
    }

    @Override
    public void performFly() {
        flyStrategy.fly();
    }

    @Override
    public void display() {
        System.out.println("I'm a Green Backed Duck");
    }

}
