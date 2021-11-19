package HWGeek8;

public class Robot extends Obstruction implements Move{
    private String name;
    private int runDistance;
    private int climbHeight;

    public Robot(String name, int runDistance, int climbHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.climbHeight = climbHeight;

    }

    @Override
    public boolean run() {
       System.out.println("Man run");
        if (runDistance < raceLength) {
            System.out.println(name + " не пробежал");
            return false;
        } else System.out.println(name + " пробежал, молодец");
        return true;
    }

    @Override
    public boolean jump() {
        System.out.println("Man jump");
        if (climbHeight < wallHeight) {
            System.out.println(name + " не перепрыгнул");
            return false;
        } else System.out.println(name + " перепрыгнул, молодец");
        return true;
    }
}
