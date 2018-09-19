package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

public abstract class WidgetFactory {
    public abstract Window createWindow();
    public abstract ScrollBar createScrollBar();

    public static WidgetFactory getInstance (String osName) {
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
        return widgetFactory;
    }
}

