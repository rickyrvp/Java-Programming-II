package personnel;

public class Person {
    private String name;
    private Education title;

    public Person(String name, Education title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return this.name;
    }

    public Education getEducation() {
        return this.title;
    }

    @Override
    public String toString() {
        return getName() + ", " + getEducation();
    }
}
