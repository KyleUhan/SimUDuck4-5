package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        FlyAndQuackAndSwimGroup[] ducks
                = {new MallardDuck(new FlyWithWings(), new Quack(), new StandardSwim()),
                    new GreenBackedDuck(new FlyWithWings(), new MuteQuack(),new StandardSwim())};

        for (FlyAndQuackAndSwimGroup duck : ducks) {
            duck.display();
            duck.performQuack();
            duck.performFly();
            duck.performSwim();
            System.out.println("-------");
        }

        //Dynamically changing instance variables  
        ducks[1].display();
        ducks[1].setQuackStrategy(new Quack());
        ducks[1].setSwimStrategy(new SwimNoWay());
        ducks[1].performQuack();
        ducks[1].performSwim();

        System.out.println("-------");

        //Example from a different group
        QuackGroup rubberduck = new RubberDuck(new Squeak());
        rubberduck.display();
        rubberduck.performQuack();

    }

}
