import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Storehouse() {
        this.priceMap = new HashMap<String, Integer>();
        this.stockMap = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }

    public Set<String> products() {
        return this.priceMap.keySet();
    }

    public int price(String product) {
        if (!this.priceMap.containsKey(product)) {
            return -99;
        }

        return priceMap.get(product);
    }

    public int stock(String product) {
        if (!this.stockMap.containsKey(product)) {
            return 0;
        }

        return stockMap.get(product);
    }

    public boolean take(String product) {
        if (this.stockMap.containsKey(product) && this.stock(product) > 0) {
            this.stockMap.replace(product, this.stock(product) - 1);
            return true;
        }
        return false;
    }
}
