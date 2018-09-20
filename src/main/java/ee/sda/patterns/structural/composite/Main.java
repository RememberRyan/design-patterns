package ee.sda.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Graphic graphic0 = new Graphic("0");
        Graphic graphic1 = new Graphic("1");
        Graphic graphic2 = new Graphic("2");
        Graphic graphic3 = new Graphic("3");
        Graphic graphic4 = new Graphic("4");
        Graphic graphic5 = new Graphic("5");
        Graphic graphic6 = new Graphic("6");
        Graphic graphic7 = new Graphic("7");
        Graphic graphic8 = new Graphic("8");
        Graphic graphic9 = new Graphic("9");

        graphic7.add(graphic8);
        graphic7.add(graphic9);

        // not indented but should be
        graphic4.add(graphic5);
        graphic4.add(graphic6);
        graphic4.add(graphic7);

        graphic0.add(graphic1);
        graphic0.add(graphic2);
        graphic0.add(graphic3);
        graphic0.add(graphic4);

        // TODO: fix indentation level
        graphic0.draw();

    }
}
