package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        FlyAndQuackGroup[] ducks
                = {new MallardDuck(new FlyWithWings(), new Quack()),
                    new GreenBackedDuck(new FlyWithWings(), new MuteQuack())};

        for (FlyAndQuackGroup duck : ducks) {
            duck.display();
            duck.performQuack();
            duck.performFly();
            System.out.println("-------");
        }

        //Dynamically changing instance variables  
        ducks[1].display();
        ducks[1].setQuackStrategy(new Quack());
        ducks[1].performQuack();

        System.out.println("-------");

        //Example from a different group
        QuackGroup rubberduck = new RubberDuck(new Squeak());
        rubberduck.display();
        rubberduck.performQuack();

    }

}
