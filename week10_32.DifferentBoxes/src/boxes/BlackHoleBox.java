package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {
    private Thing thing;
    private List<Thing> things;

    public BlackHoleBox() {
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        this.things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
