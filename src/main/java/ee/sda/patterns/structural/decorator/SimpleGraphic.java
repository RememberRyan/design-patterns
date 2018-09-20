package ee.sda.patterns.structural.decorator;
public class SimpleGraphic implements Graphic {
    private String name;
    public SimpleGraphic(String name) {
        this.name = name;
    }
    @Override
    public void draw() {
        System.out.print(name);
    }
}