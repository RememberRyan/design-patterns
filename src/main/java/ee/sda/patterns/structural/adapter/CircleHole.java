package ee.sda.patterns.structural.adapter;

public class CircleHole {

    private int radius;

    public CircleHole(int radius) {
        this.radius = radius;
    }

    public boolean take(CirclePug circlePug) {
        return circlePug.getRadius() <= this.radius;
    }


}
