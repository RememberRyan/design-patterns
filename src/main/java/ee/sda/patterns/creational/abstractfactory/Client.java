package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

// This is our main.java but for the slide purpose and class purpose we're calling it 'Client'
public class Client {


    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println("osName = " + osName);

        // define our variables
        WidgetFactory widgetFactory;

        if (osName.startsWith("Windows")){
            widgetFactory = new WindowsWidgetFactory();
        } else if (osName.startsWith("Mac OS")) {
            widgetFactory = new MacOSWidgetFactory();
        } else {
        // because we dont have  3rd alternative. So by default, MacOS is chosen ie. if you have Linux OS
            widgetFactory = new MacOSWidgetFactory();
        }


        ScrollBar scrollBar = widgetFactory.createScrollBar();
        Window window = widgetFactory.createWindow();

        scrollBar.show();
        window.open();
    }
}
