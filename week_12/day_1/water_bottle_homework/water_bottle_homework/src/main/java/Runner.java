public class Runner {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle(100);
        System.out.println(waterBottle.getVolume());
        waterBottle.drink();
        System.out.println(waterBottle.getVolume());
        waterBottle.empty();
        System.out.println(waterBottle.getVolume());
        waterBottle.fill();
        System.out.println(waterBottle.getVolume());
    }
}
