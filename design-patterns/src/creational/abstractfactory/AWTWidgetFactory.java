package creational.abstractfactory;

public class AWTWidgetFactory implements WidgetFactory {
    @Override
    public IButton createButton(String label) {
        return new AWTButton(label);
    }

    @Override
    public IFrame createFrame() {
        return new AWTFrame();
    }    
}
