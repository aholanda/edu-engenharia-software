package structural.composite;

public class Line extends Graphic {
            
    @Override
    public void draw() {
        System.out.println("Draw a LINE!");
    }

    @Override
    public void add(Graphic g) {
        System.out.println("Cannot add from a leaf!");
    }

    @Override
    public void remove(Graphic g) {
        System.out.println("Cannot remove from a leaf!");
    }

    @Override
    public Graphic getChild(int i) {
        System.out.println("Cannot get child from a leaf!");
        return null;
    }
    
}
