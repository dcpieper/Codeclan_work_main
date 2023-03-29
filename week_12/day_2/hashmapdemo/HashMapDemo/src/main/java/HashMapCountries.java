import java.lang.reflect.Array;
import java.util.HashMap;

public class HashMapCountries {
    public static void main(String[] args) {

        HashMap<String, Integer> population = new HashMap<>();

        population.put("UK", 64100000);
        population.put("Germany", 80620000);
        population.put("France", 66030000);
        population.put("Japan", 127300000);

        Integer ukPopulation = population.get("UK");

        String output = "In the UK there are " + ukPopulation.toString() + " people.";
        System.out.println(population.values());

    }
}
