import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if ((this.totalWeight() + thing.getWeight()) <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        Thing heaviest = null;

        if (things.size() > 0) {
            heaviest = things.get(0);
            for (Thing thing : things) {
                if (heaviest.getWeight() < thing.getWeight()) {
                    heaviest = thing;
                }
            }
        }
        return heaviest;
    }

    public String toString() {
        if (things.isEmpty()) {
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return "1 thing (" + this.totalWeight() + " kg)";
        } else {
            return things.size() + " things (" + this.totalWeight() + " kg)";
        }
    }
}
