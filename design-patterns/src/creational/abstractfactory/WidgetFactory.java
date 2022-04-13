package creational.abstractfactory;

public interface WidgetFactory {
    IButton createButton(String label);
    IFrame createFrame();
}
