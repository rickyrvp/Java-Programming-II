package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> persons) {
        for (Person person : persons) {
            this.employees.add(person);
        }
    }

    public void print() {
        Iterator<Person> personIterator = this.employees.iterator();

        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> personIterator = this.employees.iterator();

        while (personIterator.hasNext()) {
            Person nextPerson = personIterator.next();

            if (nextPerson.getEducation().equals(education)) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> personIterator = this.employees.iterator();

        while (personIterator.hasNext()) {
            Person nextPerson = personIterator.next();

            if (nextPerson.getEducation().equals(education)) {
                personIterator.remove();
            }
        }
    }
}
