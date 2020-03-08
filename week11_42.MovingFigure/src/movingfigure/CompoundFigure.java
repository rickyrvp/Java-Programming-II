package movingfigure;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure {
    private List<Figure> lists;

    public CompoundFigure() {
        super(0, 0);
        this.lists = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        this.lists.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure f : lists) {
            f.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure f : lists) {
            f.move(dx, dy);
        }
    }
}
