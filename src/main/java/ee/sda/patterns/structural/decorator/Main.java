package ee.sda.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Graphic graphic0 =
                new VerboseGraphicDecorator(
                new BoxedGraphicDecorator(
                    new BoxedGraphicDecorator(
                        new SimpleGraphic("0")
                    )
                )
                );

        graphic0.draw();
    }
}
