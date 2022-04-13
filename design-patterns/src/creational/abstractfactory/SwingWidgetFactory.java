package creational.abstractfactory;

public class SwingWidgetFactory implements WidgetFactory {
    @Override
    public IButton createButton(String label) {
        return new SwingButton(label);
    }

    @Override
    public IFrame createFrame() {
        return new SwingFrame();
    }        
}
