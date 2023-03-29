import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 54);
        ages.put("Bob", 24);


        ages.put("Futbol", 2);

        ages.size();

        Integer aliceAge = ages.get("Futbol");

        String output = "Futbol's age is" + aliceAge.toString();
        System.out.println(ages.keySet());
    }
}
