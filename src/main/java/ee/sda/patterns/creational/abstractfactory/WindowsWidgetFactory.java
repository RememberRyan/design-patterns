package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;
import ee.sda.patterns.creational.abstractfactory.model.WindowsScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.WindowsWindow;

public class WindowsWidgetFactory extends WidgetFactory {

    public Window createWindow() {
        return new WindowsWindow();
    }

    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
