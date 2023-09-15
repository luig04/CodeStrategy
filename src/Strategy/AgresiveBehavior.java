package Strategy;

public class AgresiveBehavior implements RobotBehavior{

    @Override
    public int moveCommand() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public String toString() {
        return "AgresiveBehavior "+ "if find another robot ignore it";
    }
}
