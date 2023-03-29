import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;
    public BusStop(){
        this.queue = new ArrayList<>();
    }
    public int queueCount(){
        return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public Person removePerson() {
        return this.queue.remove(0);
    }
}
