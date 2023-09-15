import Strategy.AgresiveBehavior;
import Strategy.DefensiveBehavior;
import Strategy.Robot;


public class App {
    public static void main(String[] args) throws Exception {
        Robot Bender = new Robot();
        Bender.setName("Bender");
        Bender.setBehavior(new DefensiveBehavior());
        System.out.println(Bender.getName());
        Bender.move();

        Robot Robotmio = new Robot();
        Robotmio.setName("Robotmio");
        Robotmio.setBehavior(new DefensiveBehavior());
        System.out.println(Robotmio.getName());
        Robotmio.move();
    }
}

