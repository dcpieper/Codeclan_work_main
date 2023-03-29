import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(){
        this.numbers = new ArrayList<>();
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public void addNumber(int number){
        this.numbers.add(number);
    }

    public int getNumberAtIndex(int i) {
        return this.numbers.get(i);
    }

    public int getTotal() {
        int total=0;

//        Long Version - more control
//        for (int i=0; i<getNumberCount();i++) {
//            total += getNumberAtIndex(i);
//        }
        for (int number : this.numbers) {
            total += number;
        }
        return total;
    }
}
