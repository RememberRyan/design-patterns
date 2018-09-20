package ee.sda.patterns.structural.decorator;

public class VerboseGraphicDecorator implements Graphic {

    private Graphic decoratedGraphic;

    public VerboseGraphicDecorator(Graphic decoratedGraphic) {
        this.decoratedGraphic = decoratedGraphic;
    }

    @Override
    public void draw() {
        System.out.println("Start of Drawing");
        decoratedGraphic.draw();
        System.out.println("Start of Drawing");
        System.out.println("End of Drawing");
    }
}
