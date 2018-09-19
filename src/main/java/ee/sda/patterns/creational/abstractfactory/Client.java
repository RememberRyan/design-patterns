package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

// This is our main.java but for the slide purpose and class purpose we're calling it 'Client'
public class Client {


    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println("osName = " + osName);

        WidgetFactory widgetFactory = WidgetFactory.getInstance(osName);

        ScrollBar scrollBar = widgetFactory.createScrollBar();
        Window window = widgetFactory.createWindow();

        scrollBar.show();
        window.open();
    }
}
