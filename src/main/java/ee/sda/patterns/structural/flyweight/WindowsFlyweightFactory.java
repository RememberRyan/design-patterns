package ee.sda.patterns.structural.flyweight;

import ee.sda.patterns.structural.flyweight.model.Window;

import java.util.HashMap;
import java.util.Map;

public class WindowsFlyweightFactory {

    // implementation of HashMap
    private Map<String, Window> cache = new HashMap<>();


    public Window createWindow(String title) {
        if (cache.containsKey(title)) {
            return cache.get(title);
        }

        Window window = new Window(title);
        cache.put(title, window);
        return window;
    }
}
