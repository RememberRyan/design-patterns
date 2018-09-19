package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.MacOSScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.MacOSWindow;
import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

public class MacOSWidgetFactory extends WidgetFactory {
    public Window createWindow() {
        return new MacOSWindow();
    }

    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }
}
