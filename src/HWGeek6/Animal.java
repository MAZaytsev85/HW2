package HWGeek6;

public class Animal {

    protected String name;
    protected int distanceRun;
    protected int distanceSwim;
    static int count;

    public Animal() {
 count++;
        }
        public static int getAnimalCount() {
        return count;
        }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distanceRun;
    }

    public void setDistance(int distance) {
        this.distanceRun = distance;
    }

}
