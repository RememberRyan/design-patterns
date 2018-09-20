package ee.sda.patterns.structural.adapter.example1;

public class Main {
    public static void main(String[] args) {
        CircleHole circleHole = new CircleHole(50);
        BasicCirclePug basicCirclePug50 = new BasicCirclePug(50);
        BasicCirclePug basicCirclePug100 = new BasicCirclePug(100);
        BasicCirclePug basicCirclePug25 = new BasicCirclePug(25);

        System.out.println(circleHole.take(basicCirclePug25));
        System.out.println(circleHole.take(basicCirclePug50));
        System.out.println(circleHole.take(basicCirclePug100));

        SquarePug squarePug = new SquarePug(50);
        // only takes instances of circlePug. Adaptor is now used.
        boolean result1 = circleHole.take(new SquareToBasicCircleAdapter(squarePug));
        System.out.println(result1);

        SquarePug squarePug1000 = new SquarePug(1000);
        boolean result2 = circleHole.take(new SquareToBasicCircleAdapter(squarePug1000));
        System.out.println(result2);
    }
}
