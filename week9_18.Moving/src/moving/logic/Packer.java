package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    private Box box;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxList = new ArrayList<Box>();

        if (!things.isEmpty()) {
            this.box = new Box(boxesVolume);

            for (Thing thing : things) {
                if (!this.box.addThing(thing)) {
                    boxList.add(this.box);

                    this.box = new Box(boxesVolume);
                    this.box.addThing(thing);
                }
            }
            boxList.add(this.box);
        }
        return boxList;
    }
}
