package version5;

public class MuteQuack implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
