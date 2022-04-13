package creational.abstractfactory;

import javax.swing.JButton;

public class SwingButton extends JButton implements IButton {
    SwingButton(String label) {
        super(label);
    }   
}
