package creational.abstractfactory;

import java.awt.FlowLayout;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WidgetFactory wf = null;
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("Choose a widget toolkit 0 for AWT, 1 for Swing: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.               
        reader.close();
        
        switch(n) {
            case 0:
                wf = new AWTWidgetFactory();
                break;
            case 1:
                wf = new SwingWidgetFactory();
                break;
            default:
                System.err.println("Wrong option:" + n);
                System.exit(-1);
                break;            
        }
        
        IFrame f = wf.createFrame();
        f.setSize(400,400);
        IButton b = wf.createButton("click on me");
        b.setBounds(30,40,40,30);
        f.add(b);
        f.setVisible(true);        
    }
}
