package creational.abstractfactory;

import java.awt.Button;

public class AWTButton extends Button implements IButton {
    AWTButton(String label) {
        super(label);
    }
}
