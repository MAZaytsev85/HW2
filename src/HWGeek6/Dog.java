package HWGeek6;

public class Dog extends Animal{

    public Dog (String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;

        }

    public void run() {
        if (distanceRun < 500)
        System.out.println(name + " пробежал " + distanceRun + " метров ");
        else System.out.println(name + " cтолько не бегает");
    }
    public void swim() {
        if (distanceSwim < 10)
        System.out.println(name + " проплыл " + distanceSwim + " метров ");
        else System.out.println(name + " cтолько не плавает");
    }
}
