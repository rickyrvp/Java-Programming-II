package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {
    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            return Collections.max(this.history);
        }
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            return Collections.min(this.history);
        }
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Double value : this.history) {
            total += value;
        }
        return total / this.history.size();
    }

    public double greatestFluctuation() {
        if (this.history.size() <= 1) {
            return 0;
        }

        double maxFluctuation = 0;

        for (int i = 0; i < this.history.size()-1; i++) {
            double current = this.history.get(i) - this.history.get(i+1);
            current = Math.abs(current);

            if (current > maxFluctuation) {
                maxFluctuation = current;
            }
        }
        return maxFluctuation;
    }

    public double variance() {
        Double temp = 0.0;
        Double average = this.average();

        for (Double value : this.history) {
            temp += Math.pow(value - average, 2);
        }
        return temp / (this.history.size() - 1);
    }


    @Override
    public String toString() {
        return this.history.toString();
    }
}
