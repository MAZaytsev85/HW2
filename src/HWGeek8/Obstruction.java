package HWGeek8;

public class Obstruction {

    protected String name;
    protected int runDistance;
    protected int climbHeight;
    protected int wallHeight = 30;
    protected int raceLength = 1500;

    public int getRaceLength() {
        return raceLength;
    }

    public void setRaceLength(int raceLength) {
        this.raceLength = raceLength;
    }


    public int getWallHeight() {
        return wallHeight;
    }


    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }
}
