package ee.sda.patterns.structural.flyweight.model;

public class Window {

    // only works with immutable objects

    private String title;

    public String getTitle() {
        return title;
    }

    public Window(String title) {

        this.title = title;
    }
}
