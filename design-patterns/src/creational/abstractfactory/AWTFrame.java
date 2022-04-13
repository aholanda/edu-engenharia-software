package creational.abstractfactory;

import java.awt.Component;
import java.awt.Frame;

public class AWTFrame extends Frame implements IFrame {

    @Override
    public void add(IButton b) {
               add((Component) b);
    }

}
