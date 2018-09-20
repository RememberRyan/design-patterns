package ee.sda.patterns.structural.adapter;

public class CircleHole {

    private int radius;

    public CircleHole(int radius) {
        this.radius = radius;
    }

    public boolean take(CirclePug circlePug) {
        if (circlePug.getRadius() <= this.radius) {
            return true;
        } else {
            return false;
        }
    }


}
