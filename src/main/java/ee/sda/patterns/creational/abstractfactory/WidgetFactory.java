package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

public abstract class WidgetFactory {
    public abstract Window createWindow();
    public abstract ScrollBar createScrollBar();
}
