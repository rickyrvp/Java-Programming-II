import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, ArrayList<String>> placeMap = new HashMap<Bird, ArrayList<String>>();

    public void observe(Bird bird, String place) {
        if (!this.placeMap.containsKey(bird)) {
            this.placeMap.put(bird, new ArrayList<String>());
        }
        this.placeMap.get(bird).add(place);
    }

    public void observations(Bird bird) {
        if (this.placeMap.get(bird) == null) {
            System.out.println(bird + " observations: 0");
        } else {
            System.out.println(bird + " observations: " + this.placeMap.get(bird).size());
            for (String place : this.placeMap.get(bird)) {
                System.out.println(place);
            }
        }
    }
}
