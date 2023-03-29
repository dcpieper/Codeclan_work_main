import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> inBus;

    public Bus(String destination, Integer capacity) {
        this.inBus = new ArrayList<Person>();
        this.capacity = capacity;
        this.destination = destination;
    }

    public int personCount(){
        return this.inBus.size();
    }

    public void pickUpPerson(Person person) {
        if (personCount() < capacity)
        {
            inBus.add(person);
        }
    }

    public void dropOffPerson(Person person) {
        inBus.remove(person);
    }

    public void collectPersonFromBusStop(BusStop busstop){
    Person person = busstop.removePerson();
    pickUpPerson(person);
    }
}

