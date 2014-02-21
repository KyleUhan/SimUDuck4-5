package version5;

public class FlyNoWay implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
