
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
         return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Bird compared = (Bird) other;
        return compared.latinName.equals(this.latinName) &&
                compared.ringingYear == this.ringingYear;
    }

    @Override
    public int hashCode() {
        if (this.latinName == null) {
            return 7;
        }
        return this.ringingYear + this.latinName.hashCode();
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


