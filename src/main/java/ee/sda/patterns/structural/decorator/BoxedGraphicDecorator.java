package ee.sda.patterns.structural.decorator;

public class BoxedGraphicDecorator implements Graphic{

    private Graphic decoratedGraphic;

    public BoxedGraphicDecorator(Graphic decoratedGraphic) {
        this.decoratedGraphic = decoratedGraphic;
    }


    @Override
    public void draw() {
        System.out.println("-------------");
        System.out.print("|  ");

        // we can do what we want before or after this call
        decoratedGraphic.draw();

        System.out.println("  |");
        System.out.println("-------------");
    }
}
