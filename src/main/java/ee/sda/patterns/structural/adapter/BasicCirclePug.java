package ee.sda.patterns.structural.adapter;

public class BasicCirclePug implements CirclePug {
    private int radius;

    public BasicCirclePug(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
