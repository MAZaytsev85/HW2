package HWGeek6;

public class Cat extends Animal{

    public Cat (String name, int distanceRun) {
        this.name = name;
        this.distanceRun = distanceRun;

    }
    public void run() {
        if (distanceRun < 200)
        System.out.println(name + " пробежал " + distanceRun + " метров ");
        else System.out.println(name + " Столько не бегает");

    }
}
