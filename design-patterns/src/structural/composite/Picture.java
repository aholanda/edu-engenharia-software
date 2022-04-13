package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic {
    List<Graphic> graphics;

    public Picture() {
        this.graphics = new ArrayList<>();
    }
    
    @Override
    public void draw() {
        for (Graphic g : graphics)
            g.draw();
    }

    @Override
    public void add(Graphic g) {
        this.graphics.add(g);
    }

    @Override
    public void remove(Graphic g) {
        this.graphics.remove(g);
    }

    @Override
    public Graphic getChild(int i) {
        return this.graphics.get(i);
    }
    
}
