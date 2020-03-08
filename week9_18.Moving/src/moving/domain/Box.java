package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private int maximumCapacity;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() > this.maximumCapacity) {
            return false;
        }

        return this.things.add(thing);
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : things) {
            volume += thing.getVolume();
        }
        return volume;
    }
}
