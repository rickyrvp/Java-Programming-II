package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movableList = new ArrayList<Movable>();

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.movableList) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Movable movable : this.movableList) {
            returnString += movable + "\n";
        }
        return returnString;
    }

    public void addToGroup(Movable movable) {
        this.movableList.add(movable);
    }
}
