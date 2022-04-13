package creational.abstractfactory;

import java.awt.Component;
import javax.swing.JFrame;

public class SwingFrame extends JFrame implements IFrame {

    @Override
    public void add(IButton b) {
        getContentPane().add((Component) b);
    }

}
