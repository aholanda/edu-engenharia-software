package structural.composite;

public class Main {
    public static void main(String[] args) {
        Graphic g = new Picture();
        Graphic g0;
        
        Line l0 = new Line();
        Line l1 = new Line();
        Rectangle r = new Rectangle();
        Text t = new Text();
        
        g.add(l0);
        g.add(r);
        g.add(l1);
        g.add(t);
        
        g.draw();
        
        g.remove(l1);
        g0 = g.getChild(0);
        g.remove(g0);
        
        System.out.println("\n<--- no line --->");
        g.draw();
    }
}
