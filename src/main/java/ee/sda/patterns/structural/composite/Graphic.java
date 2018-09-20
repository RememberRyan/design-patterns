package ee.sda.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Graphic {

    private String name;
    private List<Graphic> children = new ArrayList<>();

    public Graphic(String name) {
        this.name = name;
    }

    // just 'add' but IRL we'd have 'remove' etc
    public void add(Graphic g){
        children.add(g);
    }

    // every child will have method 'draw' and have this structure
    public void draw () {

        // draw the element itself - but we shall output a value instead
        System.out.println(name);

        for (Graphic child : children){
            System.out.print("  ");
            child.draw();
        }
    }
}
