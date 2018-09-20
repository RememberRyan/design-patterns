package ee.sda.patterns.structural.adapter.example1;

public class SquareToBasicCircleAdapter implements CirclePug {

    private SquarePug squarePug;

    public SquareToBasicCircleAdapter(SquarePug squarePug) {
        this.squarePug = squarePug;
    }

    @Override
    public int getRadius() {

        // pythagoras's theorem - cast to Integer, after decimal removed using Math.floor
        return (int) Math.floor((squarePug.getSideLength() * Math.sqrt(2)) /2);
    }


}
