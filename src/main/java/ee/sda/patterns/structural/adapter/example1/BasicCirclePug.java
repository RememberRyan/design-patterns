package ee.sda.patterns.structural.adapter.example1;

public class BasicCirclePug implements CirclePug {
    private int radius;

    public BasicCirclePug(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
